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
import org.miliconvert.adatp3.tools.impl.MappingGeneratorImpl;
import org.miliconvert.adatp3.tools.impl.Openable;
import org.miliconvert.adatp3.tools.impl.bl11.CSVBL11FieldMapper;
import org.miliconvert.adatp3.tools.impl.bl13.CSVBL13FieldMapper;

public class GenMappingApp implements IApplication {

	private Log logger = LogFactory.getLog(getClass());

	@SuppressWarnings("unchecked")
	@Override
	public Object start(IApplicationContext context) throws Exception {
		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args");

		CommandLineParser parser = new PosixParser();

		Options options = new Options();
		options.addOption( "f", "file", true, "The csv source file or directory" );
		options.addOption( "u", "ns_uri", true, "The xml namespace URI" );
		options.addOption( "p", "ns_prefix", true, "The xml namespace prefix [optional]" );
		options.addOption( "r", "root_node", true, "The xml root node name [optional]");		
		options.addOption( "s", "sets_dir", true, "The csv sets directory");
		options.addOption( "d", "field_dir", true, "The csv fields directory");
		options.addOption( "o", "output", true, "The output dir  [optional]");		
		
		options.addOption( "bl13", "baseline13", false, "Set baseline 13 parser [default bl11]");
		options.addOption( "h", "help", false, "Print this message");
		
		
		try {

		    CommandLine cmd = parser.parse( options, args );
		    HelpFormatter formatter = new HelpFormatter();
		    if(cmd.hasOption( "h" )){
		    	formatter.printHelp("genapp", options );
		    	return IApplication.EXIT_OK;
		    }

		    if( ! cmd.hasOption( "f" ) 
		    		 || !cmd.hasOption("u")
		    		 || !cmd.hasOption("s")
		    		 || !cmd.hasOption("d")) {
				formatter.printHelp("genapp", options, true );
				return IApplication.EXIT_OK;
		    }
		    
			
		    ICSVFieldMapper fieldMapper = null;
			if(cmd.hasOption("bl13")){
				fieldMapper = new CSVBL13FieldMapper();
			} else {
				fieldMapper = new CSVBL11FieldMapper();
			}
		    
		    
			String outputDir = System.getProperty("java.io.tmpdir");
			if (cmd.hasOption("o")) {
				outputDir = cmd.getOptionValue("o");
			}

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
							rootNode =  SetsUtils.getXmlElementName(csv.getName().split(":")[1].replace("\n","").replace(".csv", ""));
						}
					} catch (Exception e) {
						logger.error("You should specify a correct namespace prefix and a correct root node",e);
						return EXIT_OK;
					}
					
					generate(cmd.getOptionValue("u"),
							nsPrefix,
							rootNode,
							new Openable(csv.getPath()),setDefinitions,fieldDefinitions,fieldMapper,outputDir);
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
						rootNode = SetsUtils.getXmlElementName(html.getName().split(":")[1].replace("\n","").replace(".csv", ""));
					}
				} catch (Exception e) {
					logger.error("You should specify a correct namespace prefix and a correct root node");
					return EXIT_OK;
				}
				
				generate(cmd.getOptionValue("u"),
						nsPrefix,
						rootNode,
						new Openable(html.getPath()),setDefinitions,fieldDefinitions,fieldMapper,outputDir);
			}

		    
		    
		}
		catch( ParseException exp ) {
			logger.error( "Unexpected exception:" + exp.getMessage() );
		}

		
		return EXIT_OK;
		
		
	}

	
	private void generate(String namespaceUri, String nsPrefix,
			String rootNode, IOpenable openable, File fieldMappings,
			File fieldDefinitions, ICSVFieldMapper csvFieldMapper, String outputdir) {
		IGenerator generator = new MappingGeneratorImpl(namespaceUri,nsPrefix,rootNode,openable,fieldMappings,fieldDefinitions,csvFieldMapper,
				outputdir);

		try {
			generator.generate();
		} catch (Throwable t) {
			logger.error(t.getMessage(), t);
		}

	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
