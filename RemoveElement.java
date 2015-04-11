package leetcode;


public class RemoveElement {
	/*public int removeElement(int[] A, int elem) {
        int result = 0;
        A = quickSort(A,0,A.length-1);
        int start = 0,stop = 0;
        boolean find = false;
        for(int i=0;i<=A.length-1;i++){
        	if(A[i]==elem){
        		start = i;
        		find = true;
        		break;
        	}
        }
        for(int j=A.length-1;j>=start;j--){
        	if(A[j]==elem){
        		stop = j;
        		break;
        	}
        }
        //System.out.println("start" +start);
        //System.out.println("stop" + stop);
        if(find){
        	result = stop - start + 1;
        	result = A.length - result;
        }else{
        	result = A.length;
        }
        System.out.println(result);
        return result;
    }
	
	public int[] quickSort(int[] A,int i,int j){
		int p = 0;
		if(i<j){
			p = partition(A,i,j);
			quickSort(A,i,p-1);
			quickSort(A,p+1,j);
		}
		
		return A;
	}
	
	public int partition(int[] A,int i,int j){
		int p = A[i];
		while(i<j){
			while(i<j && p<=A[j]){
				j--;
			}
			if(i<j){
				A[i] = A[j];
				i++;
			}
			while(i<j && p>=A[i]){
				i++;
			}
			if(i<j){
				A[j] = A[i];
				j--;
			}
			A[i] = p;
		}
		return i;
	}*/
	//my
	public int removeElement(int[] A, int elem) {
		int result = 0;
		int j = A.length-1;
		int i = 0;
		while(i<=j){
			if(A[i]==elem){
				swap(A,i,j);
				j--;
			}else{
				i++;
			}
		}
		//System.out.print(i);
		return i;
	}
	public void swap(int[] A,int i,int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public static void main(String[] args){
		int[] A = {3,3};
		RemoveElement re = new RemoveElement();
		re.removeElement(A, 3);
		for(int i = 0; i<= A.length-1; i++){
			System.out.print(A[i] + " ");
		}
	}
}
