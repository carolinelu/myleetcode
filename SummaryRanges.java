package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if (nums.length == 0)
            return result;
        int start = nums[0];
        int end = nums[0];
        int count = 1;
        while (count < nums.length) {
            if (nums[count] != end + 1) {
                if (start == end)
                    result.add(start + "");
                else
                    result.add(start + "->" + end);
                start = nums[count];
            }
            end = nums[count];
            count++;
        }
        if (start == end)
            result.add(start + "");
        else
            result.add(start + "->" + end);
        return result;
    }

    public static void main(String[] args) {
        SummaryRanges sr = new SummaryRanges();
        int[] nums = { 0 };
        sr.summaryRanges(nums);
    }
}
