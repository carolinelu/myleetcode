package leetcode;


public class RemoveElement2 {
	
	//best
	public int removeElement2(int[] A, int elem) {
		int len=0;
		for(int i=0;i<=A.length-1;i++){
			if(A[i]!=elem){
				A[len]=A[i];
				len++;
			}
		}
		System.out.print(A.length);
		return len;
	}
	
	public static void main(String[] args){
		int[] A = {3,3};
		RemoveElement2 re = new RemoveElement2();
		re.removeElement2(A, 3);
		for(int i = 0; i<= A.length-1; i++){
			System.out.print(A[i] + " ");
		}
	}
}
