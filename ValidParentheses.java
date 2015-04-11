package leetcode;

import java.util.Stack;

public class ValidParentheses {
	private Stack<Character> strstack = new Stack<Character>();
	public boolean isValid(String s) {

		for(int i=0;i<s.length();i++){
			char substring = s.charAt(i);
			if(substring == ')'){
				if(strstack.empty() || strstack.pop() != '('){
					return false;
				}
			}else if(substring == '}'){
				if(strstack.empty() || strstack.pop() != '{'){
					
				}
			}else if(substring == ']'){
				if(strstack.empty() || strstack.pop() != '['){
					return false;
				}
			}else{
				strstack.push(substring);
			}
			
		}
		return strstack.empty();
    }
	public static void main(String args[]){
		ValidParentheses vp = new ValidParentheses();
		String s = "";
		System.out.println(vp.isValid(s));
	}
}
