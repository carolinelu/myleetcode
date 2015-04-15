package leetcode;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		int length = 0;
		String[] substring = s.split(" ");
		if(substring == null || substring.length == 0) return length;
		else{
			int l = substring.length;
			return substring[l-1].length();
		}
    }
	
	public static void main(String args[]){
		LengthofLastWord llw = new LengthofLastWord();
		System.out.print(llw.lengthOfLastWord("  "));
	}
}
