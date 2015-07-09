package leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int result = 0;
        s = s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            result = s.charAt(i) - 'A' + 1 + result * 26;
        }
        return result;
    }
    
    public static void main(String[] args){
        ExcelSheetColumnNumber cvn = new ExcelSheetColumnNumber();
        System.out.print(cvn.titleToNumber("Z"));
    }
}
