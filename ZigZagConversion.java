package leetcode;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if(s == null || numRows == 0) return "";
		if(numRows == 1) return s;
        StringBuffer result = new StringBuffer();
        int total = s.length();
        int subsize = 2*numRows - 2;
        for(int i=0; i < numRows; i++){
        	for(int j=i; j < total; j+=subsize){
        		result.append(s.charAt(j));
        		if(i != 0 && i != numRows - 1 && j+subsize-2*i < total) 
        			result.append(s.charAt(j+subsize-2*i));
        	}
        }
        return result.toString();
    }
	
	public static void main(String args[]){
		ZigZagConversion zzc = new ZigZagConversion();
		System.out.print(zzc.convert("1234567890", 5));
	}
}
