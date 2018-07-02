package org.miliconvert.adatp3.tools.impl.bl13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cyberneko.html.parsers.DOMParser;
import org.miliconvert.adatp3.common.utils.DOMUtils;
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.miliconvert.adatp3.tools.IHTMLExtractor;
import org.miliconvert.adatp3.tools.IOpenable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

public class HTMLBL13Extractor  implements IHTMLExtractor  {

	protected IOpenable openable;
	private Log logger = LogFactory.getLog(getClass());

	public HTMLBL13Extractor(IOpenable openable) {
		this.openable = openable;
	}

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

		
		
		String csv = asCSV(nl,8);
		String messageName = getMessageName(nl,tableNumber);
		String messageCode = getMessageCode(nl,tableNumber);

		
		try {
			in.close();
		} catch (Exception e) {	}
			
		
		if (outputDir == null) {
			try {
				File f = File.createTempFile(messageCode+":"+messageName, ".csv");
				RandomAccessFile raf = new RandomAccessFile(f, "rw");
				raf.write(csv.getBytes());
				raf.close();
				logger.info("cvs:\n" + csv + "\n----\n\n");
				logger.info("CSV dumped to " + f.getAbsolutePath());
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		} else {
			String out = outputDir + "/"+messageCode+":"
					+ messageName+".csv";
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

	private String getMessageName(NodeList nl, int tableNumber) {
		StringBuffer name = new StringBuffer();
		Element el  = (Element)((Element)
		((Element) nl.item(tableNumber))
			.getElementsByTagName("tr").item(0)).getElementsByTagName("td").item(1);
		getData(el, name,"a");
		return StringUtils.clean(name.toString().replace("(","").replace(")", ""));
	}
	
	private String getMessageCode(NodeList nl, int tableNumber) {
		StringBuffer name = new StringBuffer();
		Element el  = (Element)((Element)
		((Element) nl.item(tableNumber))
			.getElementsByTagName("tr").item(0)).getElementsByTagName("td").item(1);
		getData(el, name,"span");
		return StringUtils.clean(name.toString().replace("(","").replace(")", ""));
	}


	protected String asCSV(NodeList tables, int nbCells) {
		boolean headerAlreadyAdded = false; 
		StringBuffer csv = new StringBuffer();
		for (int z = 0; z < tables.getLength(); z++) {
			NodeList trs = ((Element) tables.item(z)).getElementsByTagName("tr");
			for (int i = 0; i < trs.getLength(); i++) {
				Element tr = (Element) trs.item(i);
				NodeList tds = tr.getElementsByTagName("td");
				if(tds.getLength()==nbCells){
					StringBuffer line = new StringBuffer();
					for (int j = 0; j < tds.getLength(); j++) {
						Element td = (Element) tds.item(j);
						if (j > 0) {
								line.append(';');
						}
						getData(td, line,j==4&&headerAlreadyAdded?"b":"span");
					}
					String l = StringUtils.clean(line.toString());
					if (l.length() > 0 ) {
						if((l.startsWith("Seg;")
								&& !headerAlreadyAdded) || (!l.startsWith("Seg;") && !l.trim().startsWith("Structured"))  ){
							headerAlreadyAdded = true;
							csv.append(l);
							csv.append('\n');
						}
					}
				}
			}
		}
		return csv.toString();
	}

	protected void getData(Element td, StringBuffer csv, String elName) {
		NodeList nl = td.getElementsByTagName(elName);
		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);
			if (n instanceof Element) {
				try {
					csv.append("" + DOMUtils.getElementText((Element) n));
				} catch (ClassCastException cce) {
					// for html <br/>
				}
			} else if (n.getNodeType() == Node.TEXT_NODE) {
				csv.append("" + ((Text) n).getData());
			} else {
				csv.append("" + n.getNodeName());
			}
		}
	}
}
