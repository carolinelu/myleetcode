package leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if(x<0) return false;
		int left = 0;
		int right = 0;
		int count = 1;
		while(x/count>=10){
			count = count * 10;
		}
		while(x>9 || x<count){
			if(x<count) left = 0;
			else left = x/count;
			right = x%10;
			System.out.println("left--"+left);
			System.out.println("right--"+right);
			if(left != right) return false;
			x = (x%count)/10;
			count = count/100;
		}
        return true;
    }
	
	public static void main(String args[]){
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(1444994441));
	}
}
