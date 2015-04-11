package leetcode;

public class ValidPalindrome2 {
	public boolean isPalindrome(String s) {
		String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return ss.equals(new StringBuilder(ss).reverse().toString());
    }
	
	public static void main(String args[]){
		String test = "";
		ValidPalindrome2 vp = new ValidPalindrome2();
		System.out.println(vp.isPalindrome(test));
	}
}
