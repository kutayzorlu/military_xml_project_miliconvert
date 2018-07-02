package org.miliconvert.adatp3.tools;

import java.io.InputStream;

public interface IOpenable {

	InputStream open();

	String getFileName();

	String getAbsolutePath();

}
