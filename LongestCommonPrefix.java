package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
	public String longestCommonPrefix(List<String> strs) {
        String result = "";
        if(strs == null || strs.size() == 0) return result;
        else result = strs.get(0);
        for(int i=1;i<strs.size();i++){
        	String temp = strs.get(i);
        	if(temp.length() == 0 || result.length() == 0) 
        		return "";
        	else{
        		int length = 0;
        		if(temp.length() <= result.length()){
        			length = temp.length();
        			result = result.substring(0,length);
        		}
        		length = result.length();
        		for(int j=0;j<length;j++){
        			if(result.charAt(j) != temp.charAt(j)){
        				result = result.substring(0,j);
        				break;
        			}
        		}
        	}
        }
        return result;
    }
	public static void main(String args[]){
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		List<String> strs = new ArrayList<>();
		//strs.add("flower");
		strs.add("flow");
		strs.add("flight");
		System.out.print(lcp.longestCommonPrefix(strs));
	}
}
