package org.miliconvert.adatp3.tools.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.tools.IOpenable;

public class Openable implements IOpenable {

	private String path;
	private static final Log logger = LogFactory.getLog(Openable.class);

	public Openable(String path) {
		this.path = path;
	}
	
	public String getFileName() {
		return new File(path).getName();
	}

	@Override
	public InputStream open() {
		try {
			return new FileInputStream(path);
		} catch (FileNotFoundException e) {
			logger.error(e, e);
			return null;
		}

	}

	@Override
	public String getAbsolutePath() {
		return new File(path).getAbsolutePath();
	}

}
