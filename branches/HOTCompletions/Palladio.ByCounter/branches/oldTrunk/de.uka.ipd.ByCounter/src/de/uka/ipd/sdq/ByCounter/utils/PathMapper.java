package de.uka.ipd.sdq.ByCounter.utils;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PathMapper {
	/** 
	 * Gets the list of package names of the class given as canonical name.
	 * @param canonicalName Canonical class name.
	 * @return An ordered list of package name strings. The highest in the hierarchy first. Example: First.Second.MyClass returns {"First", "Second"}.
	 */
	public static ArrayList<String> derivePackageTokensFromCanonicalName(String canonicalName){
		ArrayList<String> tokens = new ArrayList<String>();
		if(canonicalName.indexOf('.')<0 && canonicalName.indexOf('/')<0){
			return tokens;
		}
		StringTokenizer st = new StringTokenizer(canonicalName, "./");
		for(;st.hasMoreTokens();){
			tokens.add(st.nextToken());
		}
		tokens.remove(tokens.size()-1); //remove class name...
		if(tokens.get(0)==null || tokens.get(0).equals("")){
			tokens.remove(0); //remove class name...
		}
		return tokens;
	}

	/**TODO test
	 * @param canonicalName
	 * @return
	 */
	public static String deriveShortClassNameFromCanonicalName(String canonicalName){
		if(canonicalName.indexOf('.')<0 && canonicalName.indexOf('/')<0){
			return canonicalName.trim();
		}
		StringTokenizer st = new StringTokenizer(canonicalName, "./");
		String retString;
		String currToken = null;
		String prevToken = null;
		for(;st.hasMoreTokens();){
			prevToken = currToken;
			currToken = st.nextToken();
		}
		if(currToken!=null && currToken.equals("class")){
			retString = prevToken;
		} else {
			retString = currToken;
		}
		return retString;
	}


}
