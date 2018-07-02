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
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.tools.impl.SchemaGeneratorImpl;
import org.miliconvert.adatp3.tools.impl.bl11.CSVBL11FieldMapper;
import org.miliconvert.adatp3.tools.impl.bl13.CSVBL13FieldMapper;

public class SchemaGenApp implements IApplication {

	private Log logger = LogFactory.getLog(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args");


		CommandLineParser parser = new PosixParser();

		Options options = new Options();
		options.addOption( "f", "file", true, "The csv source file or directory" );
		options.addOption( "r", "root_node", true, "The xml root node name [optional]");		
		options.addOption( "s", "sets_dir", true, "The csv sets directory");
		options.addOption( "d", "field_dir", true, "The csv fields directory");
		options.addOption( "o", "output", true, "The output dir ");		
		
		options.addOption( "bl13", "baseline13", false, "Set baseline 13 parser [default bl11]");
		options.addOption( "h", "help", false, "Print this message");
		
		
		try {

		    CommandLine cmd = parser.parse( options, args );
		    HelpFormatter formatter = new HelpFormatter();
		    if(cmd.hasOption( "h" )){
		    	formatter.printHelp("schemagenapp", options );
		    	return IApplication.EXIT_OK;
		    }

		    if( ! cmd.hasOption( "f" ) 
		    		 || !cmd.hasOption("o")
		    		 || !cmd.hasOption("s")
		    		 || !cmd.hasOption("d")) {
				formatter.printHelp("schemagenapp", options, true );
				return IApplication.EXIT_OK;
		    }
		    
			
		    ICSVFieldMapper fieldMapper = null;
			if(cmd.hasOption("bl13")){
				fieldMapper = new CSVBL13FieldMapper();
			} else {
				logger.info("Using BL11");
				fieldMapper = new CSVBL11FieldMapper();
			}
		    
		    

			File outputDir = new File(cmd.getOptionValue("o"));
			File html = new File(cmd.getOptionValue("f"));
			File fieldDefinitions = new File(cmd.getOptionValue("d"));
			File setDefinitions = new File(cmd.getOptionValue("s"));

			if (html.isDirectory()) {
				File[] csvs = html.listFiles(new FilenameFilter() {

					@Override
					public boolean accept(File dir, String name) {
						return name.toLowerCase().endsWith(".csv");
					}
				});
				
				
				
				for (File csv : csvs) {
					
					String nsPrefix = null;
					String rootNode = null;
					try{
						
						if(cmd.hasOption("p")){
							nsPrefix = cmd.getOptionValue("p");
						} else {
							nsPrefix = csv.getName().split(":")[0].toLowerCase();
						}
						
						if(cmd.hasOption("r")){
							rootNode = cmd.getOptionValue("r");
						} else {
							rootNode = SetsUtils.getXmlElementName(csv.getName().split(":")[1].replace("\n","").replace(".csv", ""));
						}
					} catch (Exception e) {
						logger.error("You should specify a correct namespace prefix and a correct root node");
						return EXIT_OK;
					}
					
					generate(nsPrefix,
							rootNode,
							csv,setDefinitions,fieldDefinitions,fieldMapper,outputDir);
					
				}
			} else {
				String nsPrefix = null;
				String rootNode = null;
				try{
					
					if(cmd.hasOption("p")){
						nsPrefix = cmd.getOptionValue("p");
					} else {
						nsPrefix = html.getName().split(":")[0].toLowerCase();
					}
					
					if(cmd.hasOption("r")){
						rootNode = cmd.getOptionValue("r");
					} else {
						SetsUtils.getXmlElementName(html.getName().split(":")[1].replace("\n","").replace(".csv", ""));
					}
				} catch (Exception e) {
					logger.error("You should specify a correct namespace prefix and a correct root node");
					return EXIT_OK;
				}
				
				generate(nsPrefix,
						rootNode,
						html,setDefinitions,fieldDefinitions,fieldMapper,outputDir);
			}

		    
		    
		}
		catch( ParseException exp ) {
			logger.error( "Unexpected exception:" + exp.getMessage() );
		}

		
		return EXIT_OK;
		
		
	}

	private void generate(String nsPrefix, String rootNode, File csv,
			File setDefinitions, File fieldDefinitions,
			ICSVFieldMapper fieldMapper, File outputDir) {
		
		IGenerator sg = new SchemaGeneratorImpl(csv, outputDir, setDefinitions,
				fieldDefinitions, rootNode, fieldMapper);
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
