package org.miliconvert.adatp3.hibernate;

import static org.hibernate.criterion.Example.create;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

/**
 * 
 * @author matthieu
 *
 */
public class HibernateUtil {
	
	 private static final SessionFactory b11sessionFactory;
	 private static final SessionFactory b12sessionFactory;

	 private static Log log = LogFactory.getLog(HibernateUtil.class);
	 
	 
	 private static final void copyInputStream(InputStream in, OutputStream out)
	  throws IOException
	  {
	    byte[] buffer = new byte[1024];
	    int len;

	    while((len = in.read(buffer)) >= 0)
	      out.write(buffer, 0, len);

	    in.close();
	    out.close();
	  }

	 
	 @SuppressWarnings("unchecked")
	private static void extractJarDB(String dest){
		 try {
			 FileOutputStream out = new FileOutputStream(dest+System.getProperty("file.separator")+"db.zip");
			 InputStream in = HibernateUtil.class.getClassLoader().getResourceAsStream("db/db.zip");
			 if(in ==null){
				in = new FileInputStream("db/db.zip");
			 } 
			 
			 copyInputStream(in , out);
		
			  ZipFile  zipFile = new ZipFile(dest+System.getProperty("file.separator")+"db.zip");

			  Enumeration entries = zipFile.entries();

		      while(entries.hasMoreElements()) {
		        ZipEntry entry = (ZipEntry)entries.nextElement();

		        if(entry.isDirectory()) {
		          (new File(dest+System.getProperty("file.separator")+entry.getName())).mkdir();
		          continue;
		        }


		        copyInputStream(zipFile.getInputStream(entry),
		           new BufferedOutputStream(new FileOutputStream(dest+System.getProperty("file.separator")+entry.getName())));
		      }

		      zipFile.close();
		    } catch (IOException ioe) {
		      ioe.printStackTrace();
		      return;
		    }

		 
	 }
	 
	 
	 static {
	   try {
		   String sep = System.getProperty("file.separator");
		   String path = System.getProperty("java.io.tmpdir")+sep+"derby"+sep;
			File bd = new File(path);    
			if(!bd.exists()){
				bd.mkdirs();
				extractJarDB(bd.getPath());
			
			}
			
		   // Crée la SessionFactory
			 b11sessionFactory =
			 new Configuration()
		   		.setProperty("hibernate.connection.url", "jdbc:derby:directory:"+path+"NU_Baseline11")
		   		.configure().buildSessionFactory();
			 b12sessionFactory =
				 new Configuration()
			   		.setProperty("hibernate.connection.url","jdbc:derby:directory:"+path+"NU_Baseline12")
			   		.configure().buildSessionFactory();
			 
		   } catch (HibernateException ex) {
			   throw new RuntimeException("Problème de configuration : " + ex.getMessage(), ex);
		   }
	   }

	 
	 //Un peu crapi mais l'appli n'est pas multithreadé
	 public static final ThreadLocal<Session> session = new ThreadLocal<Session>();
	 public static final ThreadLocal<String> currbaseline = new ThreadLocal<String>();
	 
	 
	 public static void init(String baseline){
		 if(currbaseline.get()==null || !currbaseline.get().equals(baseline) || session.get()==null){
			Session s = getSessionFact(baseline).openSession();
			session.set(s);
			currbaseline.set(baseline);
		 }
	 }
	 
	 


	private static SessionFactory getSessionFact(String baseline) {
		if(BaselineConstants.BL12.equals(baseline)){
			return b12sessionFactory;
		}
		return b11sessionFactory;
	}




	public static Session currentSession()
			throws HibernateException {
	   Session s =  session.get();
	   // Ouvre une nouvelle Session, si ce Thread n'en a aucune
	   if (s == null) {
	    log.error("You should init a Baseline first");
	   }
	   return s;
	  }

	 public static void closeSession() {
	   Session s = session.get();
	   session.set(null);
	   if (s != null)
	   s.close();
	 }
	 
	 
	 @SuppressWarnings("unchecked")
	public static <T> List<T> findByExample(T instance) {
			log.debug("finding "+instance.getClass().getName()+"  instance by example");
			try {
				List<T> results =  currentSession()
						.createCriteria(
								instance.getClass().getName())
						.add(create(instance)).list();
				log.debug("find by example successful, result size: "
						+ results.size());
				return results;
			} catch (RuntimeException re) {
				log.error("find by example failed", re);
				throw re;
			}
		}

	 
	 @SuppressWarnings("unchecked")
	public static <T> List<T> findByExampleAndSort(T instance , Order order) {
		log.debug("finding "+instance.getClass().getName()+"  instance by example");
		try {
			List<T> results = currentSession()
					.createCriteria(
							instance.getClass().getName())
					.add(create(instance)).addOrder(order).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}




	public static String getCurrentBaseline() {
		return currbaseline.get();
	}




	public static void begin() {
		currentSession().beginTransaction();
	
	}



}
