package org.miliconvert.adatp3.tools.impl.bl13;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.StringReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cyberneko.html.parsers.DOMParser;
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.miliconvert.adatp3.tools.IOpenable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class FieldBL13Extractor  extends HTMLBL13Extractor  {


	public FieldBL13Extractor(IOpenable openable) {
		super(openable);
	}

	private Log logger = LogFactory.getLog(getClass());


	public void extract(int tableNumber, String outputDir) {
		InputStream in = openable.open();
		DOMParser parser = new DOMParser();
		try {
			parser.parse(new InputSource(in));
		} catch (Exception e1) {
			logger.error("Error parsing " + openable.getFileName(), e1);
		}
		Document doc = parser.getDocument();

		NodeList nl = doc.getElementsByTagName("table");
		String csv = asCSV(nl, tableNumber);
		if(csv==null || !csv.startsWith("Structure")){
			csv = asCSV2(nl, tableNumber);
			if(csv==null || !csv.startsWith("FUDN")){
			 return;	
			}
			
		} else {
			tableNumber++;
			String csv2 =asCSV(nl, tableNumber);
			while ( csv2 != null && csv2.startsWith(";")  ){
				try {
					csv = merge(csv,csv2);
					tableNumber++;
					csv2 = asCSV(nl, tableNumber);
				} catch (Exception e1) {
					logger.error(e1,e1);
				}
			}
		}
		
		try {
			in.close();
		} catch (Exception e) {	}
			
		if (outputDir == null) {
			try {
				File f = File.createTempFile("adatp3", ".csv");
				RandomAccessFile raf = new RandomAccessFile(f, "rw");
				raf.write(csv.getBytes());
				raf.close();
				logger.info("cvs:\n" + csv + "\n----\n\n");
				logger.info("CSV dumped to " + f.getAbsolutePath());
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		} else {
			String out = outputDir + "/"
					+ openable.getFileName().split(" ")[0]+".csv";
			try {
				File fout = new File(out);
				if (fout.exists()) {
					fout.delete();
				}
				RandomAccessFile raf = new RandomAccessFile(fout, "rw");
				raf.write(csv.getBytes());
				raf.close();
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
			logger.info("CSV dumped to " + out);
		}
	}

	private String merge(String csv, String csv2) throws IOException {
		StringBuffer ret = new StringBuffer();
		BufferedReader reader = new BufferedReader(new StringReader(csv));	
		BufferedReader reader2 = new BufferedReader(new StringReader(csv2));
		String line = null;
		while ((line = reader.readLine()) != null) {
			ret.append(line+reader2.readLine()+"\n");
		}
		return ret.toString();
	}

	protected String asCSV(NodeList tables, int item) {
		NodeList trs = ((Element) tables.item(item)).getElementsByTagName("tr");
		if(trs.getLength()==3){
			StringBuffer csv = new StringBuffer();
			for (int i = 0; i < trs.getLength(); i++) {
				Element tr = (Element) trs.item(i);
				NodeList tds = tr.getElementsByTagName("td");
				StringBuffer line = new StringBuffer();
				for (int j = 0; j < tds.getLength(); j++) {
					Element td = (Element) tds.item(j);
					if (j > 0) {
						line.append(';');
					}
					getData(td, line,i==1&&j>0?"b":"span");
				}
				String l = StringUtils.clean(line.toString());
				if (l.length() > 0) {
					csv.append(l);
					csv.append('\n');
				}
			}
			return csv.toString();
		}
		return null;
	}
	
	protected String asCSV2(NodeList tables, int item) {
		NodeList trs = ((Element) tables.item(item)).getElementsByTagName("tr");
			StringBuffer csv = new StringBuffer();
			for (int i = 0; i < trs.getLength(); i++) {
				Element tr = (Element) trs.item(i);
				NodeList tds = tr.getElementsByTagName("td");
				StringBuffer line = new StringBuffer();
				for (int j = 0; j < tds.getLength(); j++) {
					Element td = (Element) tds.item(j);
					if (j > 0) {
						line.append(';');
					}
					getData(td, line,"span");
				}
				String l = StringUtils.clean(line.toString());
				if (l.length() > 0) {
					csv.append(l);
					csv.append('\n');
				}
			}
			return csv.toString();
	}
	
	
}
