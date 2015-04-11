package leetcode;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int n = nums.length;
        k = k % n;
        if(k != 0){
        int[] tmp = new int[n-k];
        int tmpnum = 0;
        for(int i=0;i<n-k;i++){
        	tmp[tmpnum] = nums[i];
        	tmpnum++;
        }
        for(int i=0; i<= tmp.length-1; i++){System.out.print(tmp[i] + " ");}
        System.out.println("-----");
        
        int m=0;
        for(int j=n-k;j<n;j++){
        	nums[m] = nums[j];
        	m++;
        	
        }
        for(int i = 0; i<= nums.length-1; i++){System.out.print(nums[i] + " ");}
        System.out.println("-----");
        
        int p2=0;
        for(int p=k;p<n;p++){
        	nums[p] = tmp[p2];
        	p2++;
        }
        }
        for(int i = 0; i<= nums.length-1; i++){System.out.print(nums[i] + " ");}
        
    }
	public static void main(String[] args){
		int[] A = {1,2};
		RotateArray ra = new RotateArray();
		ra.rotate(A, 1);
	}
}
