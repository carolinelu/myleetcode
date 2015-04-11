package leetcode;

public class ReverseInteger {
	public int reverse(int x) {
        long result = 0;
        boolean minus = false;
        if(x<0){
        	minus = true;
        	x = -x;
        }
        while(x>0){
        	result = result*10 + x%10;
        	x = x/10;
        }
        //System.out.println(result);
        if(minus){
        	result = -result;
        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
        	return 0;
        }
        //System.out.println(result);
		return (int)result;
    }
	
	public static void main(String args[]){
		ReverseInteger ri = new ReverseInteger();
		ri.reverse(1534236469);
		
	}
}
