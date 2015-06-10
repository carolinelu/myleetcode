package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String args[]){
        ContainsDuplicate2 cd = new ContainsDuplicate2();
        int[] test = {};
        System.out.print(cd.containsDuplicate(test));
    }
}
