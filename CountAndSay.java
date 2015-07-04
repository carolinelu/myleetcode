package leetcode;

public class CountAndSay {
	public String countAndSay(int n) {
        String num = "1";
        while(n>1){
        	StringBuffer res = new StringBuffer();
        	int count = 1;
        	char point = '0';
        	for(int i=0; i<num.length(); i++){
        		if(num.charAt(i) == point){
        			count++;
        		}else{
        			res.append(count).append(point);
        			count = 1;
        			point = num.charAt(i);
        		}
        	}
        	res.append(count).append(num.charAt(num.length()-1));
        	num = res.toString().substring(2);
        	n--;
        	//System.out.println(num);
        }
        return num;
    }
	
	public static void main(String[] agrs){
		CountAndSay cs = new CountAndSay();
		System.out.println(cs.countAndSay(1));
	}
}
