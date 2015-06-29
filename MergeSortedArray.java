package leetcode;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
        int a=m-1;
        int b=n-1;
        int ab = m+n-1;
        while(a>=0 && b>=0){
        	A[ab--] = A[a]>B[b]?A[a--]:B[b--];
        }
        while(b >= 0){
        	A[ab--] = B[b--];
        }
    }
}
