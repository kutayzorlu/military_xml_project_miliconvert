package org.miliconvert.adatp3.tools;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.miliconvert.adatp3.tools.impl.SampleGeneratorImpl;

public class SampleGenApp implements IApplication {

	private Log logger = LogFactory.getLog(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args");


		CommandLineParser parser = new PosixParser();

		Options options = new Options();
		options.addOption( "f", "file", true, "The csv source file or directory" );
		options.addOption( "s", "sets_dir", true, "The sample sets directory");
		options.addOption( "o", "output", true, "The output dir ");		
		options.addOption( "h", "help", false, "Print this message");
		
		
		try {

		    CommandLine cmd = parser.parse( options, args );
		    HelpFormatter formatter = new HelpFormatter();
		    if(cmd.hasOption( "h" )){
		    	formatter.printHelp("samplegenapp", options );
		    	return IApplication.EXIT_OK;
		    }

		    if( ! cmd.hasOption( "f" ) 
		    		 || !cmd.hasOption("o")
		    		 || !cmd.hasOption("s")) {
				formatter.printHelp("samplegenapp", options, true );
				return IApplication.EXIT_OK;
		    }
		    
			
		  
			File outputDir = new File(cmd.getOptionValue("o"));
			File html = new File(cmd.getOptionValue("f"));
			File setDefinitions = new File(cmd.getOptionValue("s"));

			if (html.isDirectory()) {
				File[] csvs = html.listFiles(new FilenameFilter() {

					@Override
					public boolean accept(File dir, String name) {
						return name.toLowerCase().endsWith(".csv");
					}
				});
				
				
				
				for (File csv : csvs) {
					
					generate(csv,setDefinitions,outputDir);
					
				}
			} else {
				
				generate(html,setDefinitions,outputDir);
			}

		    
		    
		}
		catch( ParseException exp ) {
			logger.error( "Unexpected exception:" + exp.getMessage() );
		}

		
		return EXIT_OK;
		
		
	}

	private void generate( File csv,
			File setDefinitions, File outputDir) {
		
		IGenerator sg = new SampleGeneratorImpl(csv, outputDir, setDefinitions);
		try{
			sg.generate();
		} catch (Exception e) {
			logger.error(e,e);
		}
		
	}

	@Override
	public void stop() {
	}

}
