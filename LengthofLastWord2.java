package leetcode;

public class LengthofLastWord2 {
	public int lengthOfLastWord(String s) {
		int length = 0;
		int slength = s.length();
		if(slength == 0) return length;
		for(int i = slength-1; i>=0; i--){
			if(s.charAt(i) != ' ') length++;
			if(length != 0 && s.charAt(i) == ' ') break;
		}
		return length;

    }
	
	public static void main(String args[]){
		LengthofLastWord2 llw = new LengthofLastWord2();
		System.out.print(llw.lengthOfLastWord(""));
	}
}
