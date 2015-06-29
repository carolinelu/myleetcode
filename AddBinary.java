package leetcode;

public class AddBinary {
	public String addBinary(String a, String b) {
		String res = "";
		int carry = 0, sum = 0;
		int i = a.length() - 1, j = b.length() - 1;
		for (; i >= 0 || j >= 0; i--, j--) {
			sum = (i >= 0 ? (a.charAt(i) - '0') : 0)
					+ (j >= 0 ? (b.charAt(j) - '0') : 0) + carry;
			if (sum >= 2) {
				res = (sum - 2) + res;
				carry = 1;
			} else {
				res = sum + res;
				carry = 0;
			}
		}
		if (carry != 0) 
			res = "1" + res;
		return res;
	}

}
