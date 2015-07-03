package leetcode;

public class ClimbingStairs2 {
	//仔细观察结果是有规律的：1、2、3、5、8、13、21
	public int climbStairs(int n) {
        int second = 1;
        int pre = 1;
        for(int i=1; i<n; i++){
        	second = second + pre;
        	pre = second - pre;
        }
        return second;
    }
	 
	public static void main(String[] args){
		 ClimbingStairs2 cs = new ClimbingStairs2();
		 System.out.print(cs.climbStairs(4));
	 }
	
}
