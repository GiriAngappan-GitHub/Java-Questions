package Array_Leet_Qus;

import java.util.Arrays;

public class Leet_164 {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));

    }
    public static  int maximumGap(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        if(n <2){return 0;}
        int max =0;
        for(int i=0; i<n-1; i++)
        {
            int gap =nums[i+1] - nums[i];

            if(max < gap)
            {
                max =gap;
            }
        }
        return  max;
    }
}
