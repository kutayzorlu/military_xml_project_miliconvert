package org.miliconvert.adatp3.common.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

	public static String[] safeSplit(String s, char sep) {
		ArrayList<String> al = new ArrayList<String>(25);
		StringBuffer cur = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == sep) {
				al.add(cur.toString().trim());
				cur = new StringBuffer();
			} else {
				cur.append(s.charAt(i));
			}
		}
		al.add(cur.toString().trim());

		String[] ret = al.toArray(new String[al.size()]);
		return ret;
	}
	
	
	public static String clean(String toClean){
		return toClean.replaceAll("[ ]+", " ").replace("\n", "").replace("\r", "")
		.replace("\u00A0", "").trim();
	}
	
	
	/**
	 * Convert a string array to integer array.
	 * If a string field array hasn't the numeric format, an exception will be sent.
	 * @param stringArray the string array to convert.
	 * @return integerArray the Integer array corresponding to the string array.
	 */
	public static Integer[] convertStringToInteger(String[] stringArray) {
		Integer[] integerArray=new Integer[stringArray.length];
		for(int i=0;i<stringArray.length;i++){
			integerArray[i]=Integer.parseInt(stringArray[i]);
		}
		return integerArray;
	}

	/**
	 * Convert a string array to integer list.
	 * If a string field array hasn't the numeric format, an exception will be sent.
	 * @param stringArray the string array to convert.
	 * @return integerArray the Integer list corresponding to the string array.
	 */
	public static List<Integer> convertStringToIntegerList(String[] stringArray) {
		List<Integer> integerArray=new ArrayList<Integer>();
		for(int i=0;i<stringArray.length;i++){
			integerArray.add(Integer.parseInt(stringArray[i]));
		}
		return integerArray;
	}
	
	

	public static  String justify( String value, boolean left, int length )
	{
	  value = value.trim();
	  String blank = "";
	  for(int i=0;i<(length-value.length());i++){
		  blank+=" ";
	  }
	  
		if(left){
			return value+blank;
		}
		return blank+value;
		
	}


	public static String difference(String str1, String str2) {
		   String ret = "";
		    String[] x = str1.split("\\n");
	        String[] y = str2.split("\\n");

	        // number of lines of each file
	        int M = x.length;
	        int N = y.length;

	        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
	        int[][] opt = new int[M+1][N+1];

	        // compute length of LCS and all subproblems via dynamic programming
	        for (int i = M-1; i >= 0; i--) {
	            for (int j = N-1; j >= 0; j--) {
	                if (x[i].equals(y[j]))
	                    opt[i][j] = opt[i+1][j+1] + 1;
	                else 
	                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
	            }
	        }

	        // recover LCS itself and print out non-matching lines to standard output
	        int i = 0, j = 0;
	        while(i < M && j < N) {
	            if (x[i].equals(y[j])) {
	                i++;
	                j++;
	            }
	            else if (opt[i+1][j] >= opt[i][j+1]) ret += "< " + x[i++]+"\n";
	            else                                  ret += "> " + y[j++]+"\n";
	        }

	        // dump out one remainder of one string if the other is exhausted
	        while(i < M || j < N) {
	            if      (i == M)  ret += "> " + y[j++]+"\n";
	            else if (j == N)  ret += "< " + x[i++]+"\n";
	        }
	        return ret;
	} 
	
	
	

}
