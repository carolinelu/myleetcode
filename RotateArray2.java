package leetcode;

public class RotateArray2 {
	public void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		if(k != 0){
			subrotate(nums,0,n-k-1);
			subrotate(nums,n-k,n-1);
			subrotate(nums,0,n-1);
		}
		//for(int i=0; i<= nums.length-1; i++){System.out.print(nums[i] + " ");}
    }
	public void subrotate(int[] A, int p,int q){
		int mid = (q-p+1)/2;
		for(int i=0;i<mid;i++){
			int tmp = A[p];
			A[p++] = A[q];
			A[q--] = tmp;
		}
	}
	
	public static void main(String[] args){
		int[] A = {1,2,3,4,5,6,7};
		RotateArray2 ra = new RotateArray2();
		ra.rotate(A, 3);
	}
}
