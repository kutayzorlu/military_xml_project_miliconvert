package org.miliconvert.xsmt.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * File manipulation functions
 * 
 * @author tom
 * 
 */
public class FileUtils {

	private static final int BUFF_SIZE = 100000;

	/**
	 * File copy, from Java Performance book
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 */
	public static void copy(File src, File dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		in = new FileInputStream(src);
		out = new FileOutputStream(dest);
		transfer(in, out, true);
	}

	/**
	 * Fast stream transfer method
	 * 
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public static void transfer(InputStream in, OutputStream out,
			boolean closeIn) throws IOException {
		final byte[] buffer = new byte[BUFF_SIZE];

		try {
			while (true) {
				int amountRead = in.read(buffer);
				if (amountRead == -1) {
					break;
				}
				out.write(buffer, 0, amountRead);
			}
		} finally {
			if (closeIn) {
				in.close();
			}
			out.flush();
			out.close();
		}
	}

	public static InputStream dumpStream(InputStream in, PrintStream dump,
			boolean closeIn) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			transfer(in, out, closeIn);
			dump.println("-- stream dump start --");
			dump.println(out.toString());
			dump.println("-- stream dump end --");
		} catch (Throwable t) {
			throw new IOException(t.getMessage());
		}
		return new ByteArrayInputStream(out.toByteArray());
	}

}
