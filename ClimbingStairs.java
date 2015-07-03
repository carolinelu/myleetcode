package leetcode;

public class ClimbingStairs {
	//eclipse运行没有问题，leetcode显示time limit
	public int climbStairs(int n) {
        int res = 0;
        if(n == 0) return res;
        if(n-2 > 0) res = climbStairs(n-2) + climbStairs(n-1);
        else if(n-1 > 0) res = 1 + climbStairs(n-1);
        else return 1;
        return res;
    }
	 
	public static void main(String[] args){
		 ClimbingStairs cs = new ClimbingStairs();
		 System.out.print(cs.climbStairs(7));
	 }
	
}
