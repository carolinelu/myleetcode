package leetcode;

public class RemoveDuplicates {
	public int removeDuplicates(int[] A) {
        int len = 0;
        if(A.length == 0){
        	return 0;
        }
        A[len] = A[0];
        for(int i=1;i<=A.length-1;i++){
        	if(A[len] != A[i]){
        		len++;
        		A[len]=A[i];
        	}
        }
        System.out.println(len+1);
        return len+1;
    }
	
	public static void main(String[] args){
		int[] A = {};
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.removeDuplicates(A);
		for(int i = 0; i<= A.length-1; i++){
			System.out.print(A[i] + " ");
		}
	}
}
