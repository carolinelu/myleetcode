package leetcode;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		char[] stringlist = s.toLowerCase().toCharArray();
		if(stringlist == null) return true;
		int first = 0, last = s.length()-1;
        while(first <= last){
        	char firstchar = stringlist[first];
        	char lastchar = stringlist[last];
        	if(!(firstchar >= '0' && firstchar <= '9') && !(firstchar >='a' && firstchar <= 'z')){
        		first++;
        		continue;
        	}
        	if(!(lastchar >= '0' && lastchar <= '9') && !(lastchar >='a' && lastchar <= 'z')){
        		last--;
        		continue;
        	}
        	if(firstchar == lastchar){
        		first++;
        		last--;
        	}else{
        		return false;
        	}
        }
		return true;
    }
	
	public static void main(String args[]){
		String test = "";
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome(test));
	}
}
