package leetcode;

public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int result = 0;
        while(n>0){
        	result = result + n/5;
        	n = n/5;
        }
        return result;
    }
	public static void main(String args[]){
		FactorialTrailingZeroes llw = new FactorialTrailingZeroes();
		System.out.print(llw.trailingZeroes(10));
	}
}
