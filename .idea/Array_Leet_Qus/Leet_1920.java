package Array_Leet_Qus;

import java.util.Arrays;

public class Leet_1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(Array_permutation(nums)));

    }

    public  static  int[] Array_permutation(int[] nums)
    {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
            System.out.println(nums[nums[i]]);
        }

        return ans;

    }
}
