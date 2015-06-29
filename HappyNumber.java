package leetcode;

public class HappyNumber {
	public boolean isHappy(int n) {
		if(n<10 && n!=1 && n!=7) return false;
        int result = 0;
        while(n != 0){
        	int temp = n%10;
        	result = result + temp*temp;
        	n = n/10;
        }
        System.out.println(result);
        if(result==1) return true;
        else return isHappy(result);
    }
	
	public static void main(String args[]){
		HappyNumber hn = new HappyNumber();
		System.out.print(hn.isHappy(13));
		
	}
}
