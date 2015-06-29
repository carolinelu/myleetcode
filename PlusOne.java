package leetcode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int len = digits.length;
		if(digits == null || len == 0) 
			return null;
		for(int i = len-1; i>=0; i--){
			if(digits[i] != 9) {
				digits[i] = digits[i]+1;
				break;
			}else{
				digits[i] = 0;
			}
		}
		if(digits[0] == 0){
			len = len + 1;
			int[] newdigits = new int[len];
			for(int i = len-1;i>0;i--){
				newdigits[i] = digits[i-1];
			}
			newdigits[0] = 1;
			for(int j = 0;j<len;j++){
				System.out.print(newdigits[j]);
			}
			return newdigits;
		}
		for(int j = 0;j<len;j++){
			System.out.print(digits[j]);
		}		
        return digits;
    }
	
	public static void main(String args[]){
		int[] digits = {9,9,9};
		PlusOne po = new PlusOne();
		po.plusOne(digits);
	}
}
