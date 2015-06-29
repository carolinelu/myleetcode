package leetcode;

public class PalindromeNumber2 {
	public boolean isPalindrome(int x){
        if(x < 0) return false;
        int reverse = 0, temp = x;
        while(x != 0){
            reverse = reverse * 10 + x % 10;
            x = x / 10;
            //System.out.println(reverse);
        }
        return reverse == temp;
    }
	
	public static void main(String args[]){
		PalindromeNumber2 pn = new PalindromeNumber2();
		System.out.println(pn.isPalindrome(Integer.MAX_VALUE));
	}
}
