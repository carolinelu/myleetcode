package leetcode;

public class HappyNumber2 {
	public boolean isHappy(int n) {
		if(n == 0) return false;
		int first = n;
		int second = n;
		while(first > 1){
			first = isHappyNum(first);
			if(first == 1) return true;
			second = isHappyNum(isHappyNum(second));
			if(second == 1) return true;
			if(second == first) return false;
		}
		return true;
    }
	
	public int isHappyNum(int n) {
		int result = 0;
        while(n != 0){
        	int temp = n%10;
        	result = result + temp*temp;
        	n = n/10;
        }
        return result;
	}
	
	public static void main(String args[]){
		HappyNumber2 hn = new HappyNumber2();
		System.out.print(hn.isHappy(13));
		
	}
}
