package leetcode;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		if(n<=0) return null;
		String result = "";
		while(n>0){
			result = (char)('A'+(n-1)%26) + result;
			n = (n-1)/26;
		}
        return result;
    }
	
	public static void main(String args[]){
		ExcelSheetColumnTitle esct = new ExcelSheetColumnTitle();
		System.out.println(esct.convertToTitle(676));
		
	}
}
