package Array_Leet_Qus;

import java.util.Arrays;

public class Leet_53 {
    public static void main(String[] args) {
            int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    public static  int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum =Integer.MIN_VALUE;

        for(int i=0;i<nums.length; i++)
        {
            int currsum = sum+nums[i];
            if(currsum < nums[i])
            {
                sum = nums[i];
            }
            else
            {
                sum = currsum;
            }


            if(sum > maxsum)
            {
                maxsum = sum;
            }
        }

        return maxsum;

    }
}
