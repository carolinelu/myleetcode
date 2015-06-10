package leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> numsmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(numsmap.containsKey(nums[i])){
                return true;
            }else{
                numsmap.put(nums[i], 1);
            }
        }
        return false;
    }

    public static void main(String args[]){
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] test = {1,2,3,3};
        System.out.print(cd.containsDuplicate(test));
    }
}
