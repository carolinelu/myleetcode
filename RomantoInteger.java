package leetcode;

import java.util.HashMap;

public class RomantoInteger {
	public int romanToInt(String s) {
        int res = 0;
        int length = s.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(length == 1) 
        	return map.get(s.charAt(0));
        for(int i=0; i<length-1; i++){
        	if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
        		res = res - map.get(s.charAt(i));
        	}else{
        		res = res + map.get(s.charAt(i));
        	}
        }
        res = res + map.get(s.charAt(length-1));
        return res;
    }

	public static void main(String args[]){
		RomantoInteger ri = new RomantoInteger();
		System.out.print(ri.romanToInt("D"));
	}
}
