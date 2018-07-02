package org.miliconvert.adatp3.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.miliconvert.adatp3.common.formlets.Couple;
import org.miliconvert.adatp3.common.formlets.SegmentSequence;
import org.miliconvert.adatp3.common.formlets.Set;
import org.miliconvert.adatp3.common.formlets.SetCouple;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SetsUtils {

	
	public static String getXmlElementName(String setFormatName) {
		
		if(setFormatName==null){
			return "null";
		}
		
		if(setFormatName.length()>0 &&  Character.isDigit(setFormatName.charAt(0))){
			setFormatName+="n_";
		}
		
		return setFormatName
				.replaceAll("([',\\(\\)]|\\(NU\\))", "")
				.replace("=", "equals")
				.replace("&", "and")
				.replaceAll("[\\s\\.\\+:;-]", "_")
				.replace("/", "_")
		.toLowerCase();
		
	}

	
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


	public static String getSetExtensionName(String setFormatName) {
		// TODO Auto-generated method stub
		return setFormatName.replaceAll("_", ".");
	}
	
	

	/**
	 * Return duplicated sets inside a list of sets.
	 * @param sets the sets to parse.
	 * @return list of duplicated sets.
	 */
	public static List<Set> getDuplicateSet(List<Set> sets){
		
		ArrayList<Set> duplicated=new ArrayList<Set>();
		
		for(Set set:sets){
			if(sets.indexOf(set)!=sets.lastIndexOf(set) && !duplicated.contains(set)){
				duplicated.add(set);
			}
		}
		return duplicated;
	}
	
	/**
	 * Reorder the list in order to generate a valid xml with repeatable segments.
	 * 
	 * @param sets
	 * @param duplicatedSets
	 * @param repeatableElements
	 * @return a list reordered for repeatable segments.
	 */
	public static List<Set> reorderSets(List<Set> sets,List<Set> duplicatedSets,List<SegmentSequence> repeatableElements){
		
		List<Set> tempsSet=new ArrayList<Set>(sets);
		for(SegmentSequence elements:repeatableElements){
			
			for(Set set:duplicatedSets){
				
				if(elements.matchAnyInSequence(set)){

					Integer first=tempsSet.indexOf(set);
					if(first>-1){
						
						List<Set> left=new ArrayList<Set>();
						List<Set> right=new ArrayList<Set>();
						
						for(int i=0;i<=first;i++){
							left.add(tempsSet.get(i));
						}
						for(int i=first+1;i<tempsSet.size();i++){
							if(!tempsSet.get(i).equals(set)){
								right.add(tempsSet.get(i));
							}else{
								left.add(tempsSet.get(i));
							}
						}
						left.addAll(right);
						tempsSet=left;
						
					}
				}
			}
		}
		
		return tempsSet;
	}
	
	/**
	 * Retrieve all seqs repeatable for matching.
	 * @param seqs all sequences retrieved in the mapping file. 
	 * @param depth all depths retrieved in the mapping file. 
	 * @return a list which contains several sequenceMappingElements (containing all  sequences in the correct order and the start sequence number for easy use).
	 */
	public static List<SegmentSequence> getElementsRepeatable(Map<String,List<Integer>> seqs,Map<String,List<Integer>> depth){
		//Assemble only one Map which contains names and depths by ids 
		return retrieveRepeatableSequences(transformSequence(seqs,depth));
	}
	
	/**
	 * Convert seqs map and depths map into one map matched by ids.
	 * @param seqs all sequences matched by ids.
	 * @param depth all depth matched by ids.
	 * @return elements one map containing seqs and depth (encapsulated in a couple object) by ids.
	 */
	public static Map<String,Couple<Integer[],Integer[]>> getElements(Map<String,List<Integer>> seqs,Map<String,List<Integer>> depth){
		
		HashMap<String,Couple<Integer[],Integer[]>> elements=new HashMap<String,Couple<Integer[],Integer[]>>();
		
		for(Map.Entry<String,List<Integer>> entry: seqs.entrySet()){
			Integer[] currentSeqs=entry.getValue().toArray(new Integer[0]);
			Integer[] currentDepths=depth.get(entry.getKey()).toArray(new Integer[0]);
			Couple<Integer[],Integer[]> couple=new Couple<Integer[],Integer[]>(currentSeqs,currentDepths);
			elements.put(entry.getKey(), couple);
		}
		return elements;
	}
	
	/**
	 * Retrieve all SetSequence objects group by mapping sequences.
	 * @return list of SetSequence with mapping sequences as ids.
	 */
	public static SegmentSequence transformSequence(Map<String,List<Integer>> seqs,Map<String,List<Integer>> depth){
		
		SegmentSequence elements=new SegmentSequence();
		
		for(Map.Entry<String,List<Integer>> entry: seqs.entrySet()){
			Integer[] currentSeqs=entry.getValue().toArray(new Integer[0]);
			Integer[] currentDepths=depth.get(entry.getKey()).toArray(new Integer[0]);
			
			for(int i=0;i<currentSeqs.length;i++){
				elements.add(currentSeqs[i],new SetCouple(entry.getKey(),currentDepths[i]));
			}

		}
		return elements;
	}
	
	
	/**
	 * Return a list of repeated SetSequence
	 * @param elementsBySequence
	 * @return repeated elements
	 */
	public static List<SegmentSequence> retrieveRepeatableSequences(SegmentSequence segmentSequence){
		return segmentSequence.getRepeatableSegments();
	}
	
	
	/**
	 * Parse the dom and print all node ids in the output. Only for testing.
	 * @param document the document to parse.
	 * @param seqs the sequences to display
	 * @param depth 
	 */
	public static void parsingDom(Document document,Map<String,List<Integer>> seqs,Map<String,List<Integer>> depth){
		ArrayList<Node> nodes=new ArrayList<Node>();	
		parsingNodes(document.getChildNodes(),nodes,getElementsRepeatable(seqs, depth));
		for(Node node:nodes){
			System.out.println(node.getNodeName());
		}
	}
	
	
	private static void parsingNodes(NodeList nodeList,List<Node> allNodes,List<SegmentSequence> sequence){
			for(int i=0;i<nodeList.getLength();i++ ){
				if(nodeList.item(i).getNodeName()!=null && nodeList.item(i).getNodeName().endsWith("_segment")){
					allNodes.add(nodeList.item(i));
				}
				parsingNodes(nodeList.item(i).getChildNodes(),allNodes,sequence);
			}
			
	}


	public static String[] split(String[] exploded) {
		String[] ret = null;
		if(isFreeTextSet(exploded[0])){
			
			int ind = 0;
			if("GENTEXT".equals(exploded[0]) ){
				ret = new String[2];	
				ret[0]=exploded[1].replaceAll("/n", "");
				ind = 1;
 			} else {
 				ret = new String[1];
 				ind = 0;
 			}
			ret[ind]="";
			for (int i = ind; i < exploded.length-1; i++) {
				if(i>ind) ret[ind]+="/";
				ret[ind]+=exploded[i+1];
			}
			return ret;
		}
		
		ret = new String[exploded.length-1];	
		for (int i = 1; i < exploded.length; i++) {
			ret[i-1] = exploded[i].replaceAll("\n", "");
		}
		
		return ret;
	}



	// GENTEXT, AMPN, NARR, and RMKS, respectively)
	private static boolean isFreeTextSet(String setId) {
		
		return "GENTEXT".equalsIgnoreCase(setId) 
				|| "AMPN".equalsIgnoreCase(setId)
				|| "NARR".equalsIgnoreCase(setId)
				|| "RMKS".equalsIgnoreCase(setId);
	}
	
}
