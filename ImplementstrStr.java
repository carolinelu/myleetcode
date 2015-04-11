package leetcode;

public class ImplementstrStr {

	 public int strStr(String haystack, String needle) {
		 if(needle==null||needle.equals("")){
			 return 0;
		 }else if(haystack==null||haystack.equals("")){
			return -1;
		 }
		 int i=0,j=0,index=0;
		 boolean flag= false;
		 while(i<haystack.length()&&j<needle.length()){
			 if(haystack.charAt(i)==needle.charAt(j)){
				 if(!flag){
					 index=i;
					 flag = true;
				 }
				 i++;
				 j++;
			 }else{
				 if(flag){
					 i=index+1;
				 }else{
					 i++;
				 }
				 
				 j=0;
				 index=0;
				 flag=false;
			 }
		 }
		 if(flag&&j==needle.length()){
			 return index;
		 }else{
			 return -1;
		 }
	 }
	
	public static void main(String[] args) {
		ImplementstrStr is = new ImplementstrStr();
		String haystack ="aaa";
		String needle = "aaaa";
		System.out.println(is.strStr(haystack, needle));
	}

}
