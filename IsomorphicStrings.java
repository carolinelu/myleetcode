package leetcode;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<String,String> st = new HashMap<String,String>();
        HashMap<String,String> ts = new HashMap<String,String>();
        String[] slist = s.split("");
        String[] tlist = t.split("");
        if(slist.length != tlist.length) return false;
        for(int i = 0; i< slist.length; i++){
            String svalue = slist[i];
            String tvalue = tlist[i];
            if(st.containsKey(svalue)){
                if(!st.get(svalue).equals(tvalue)) return false;
            }else{
                st.put(svalue, tvalue);
            }
            if(ts.containsKey(tvalue)){
                if(!ts.get(tvalue).equals(svalue)) return false;
            }else{
                ts.put(tvalue, svalue);
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        IsomorphicStrings is = new IsomorphicStrings();
        System.out.print(is.isIsomorphic("paper", "title"));
    }
}
