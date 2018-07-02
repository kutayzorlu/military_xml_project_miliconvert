package org.miliconvert.adatp3.tools.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.tools.ICSVFieldMapper;
import org.miliconvert.adatp3.tools.IGenerator;
import org.miliconvert.adatp3.tools.impl.bl13.CSVBL13FieldMapper;

/**
 * 
 * @author matthieu
 *
 */
public class SampleGeneratorImpl implements IGenerator {

	private File csv;
	private File outputDir;
	private File setDefinitions;
	private ICSVFieldMapper icsvFieldMapper;
	
	private static Log logger = LogFactory.getLog(SampleGeneratorImpl.class);
	
	public SampleGeneratorImpl(File csv, File outputDir, File setDefinitions) {
		this.csv=csv;
		this.outputDir=outputDir;
		this.setDefinitions=setDefinitions;
		this.icsvFieldMapper = new CSVBL13FieldMapper();
	}

	@Override
	public void generate() throws Exception {
		InputStream in = new FileInputStream(csv);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		StringBuffer out = new StringBuffer();
		
		String line = reader.readLine();
		while ((line = reader.readLine()) != null) {

			String[] items = SetsUtils.safeSplit(line, ';');
			appendSetSample(out,items[icsvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SETID)].toLowerCase(),items[icsvFieldMapper.getCSVIndex(ICSVFieldMapper.F_RPT)]);
			
		}
		in.close();
		
		String nsPrefix = csv.getName().split(":")[0].toLowerCase();
		String rootNode =  SetsUtils.getXmlElementName(csv.getName().split(":")[1].replace("\n","").replace(".csv", ""));
		
		File output = new File(outputDir+"/"+nsPrefix+":"+rootNode+".adatp3");
		if(output.exists()){
			output.delete();
		}
		RandomAccessFile raf = new RandomAccessFile(output, "rw");
		raf.write(out.toString().getBytes());
		raf.close();
		logger.info("Wrote mapping to " + output.getAbsolutePath());

	}

	private void appendSetSample(StringBuffer out, String setId, String rep) throws IOException {
		File setSample = new File(setDefinitions.getAbsolutePath() + "/"
				+ setId + ".sample");
		if(!setSample.exists()){
			logger.error(setDefinitions.getAbsolutePath() + "/"
				+ setId + ".sample doesn't exits");
			return;
		}
	
		StringBuffer tmp = new StringBuffer();
	
		InputStream in = new FileInputStream(setSample);
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(in));

		String line = null;
		int count =0;
		while ((line = reader.readLine()) != null) {
			if(line.trim().toLowerCase().contains(setId)){
				count++;
			}
			if(count>1){
				break;
			}
			
			tmp.append(line.trim()+"\n");
		}
		
		in.close();
		
		for (int i = 0; i < (rep.contains("ü")?3:1); i++) {
			out.append(tmp.toString());
		}
		
	}

}
