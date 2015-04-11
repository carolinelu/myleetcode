package leetcode;

public class MajorityElement {
	//O(n)
	public int majorityElement(int[] num) {
        int result = 0;
        int count = 0;
        for(int i=0;i<=num.length-1;i++){
        	if(count==0){
        		result = num[i];
        	}
        	if(result==num[i]){
        		count++;
        	}else{
        		count--;
        	}
        }
        return result;
    }
}
