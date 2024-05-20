package Array_Leet_Qus;

import java.util.Arrays;

public class Leet_1929 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

//    int[] resultantArr = new int[2*nums.length];
//    // Copy the numbers from input array to resultant array.
//        for(int i = 0; i < resultantArr.length; i++) {
//        // Use modulo (%) for cycling through the indix of input array.
//        resultantArr[i] = nums[i%nums.length];
//    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int count = 1;
        int element =0;

        for(int i=0; i<nums.length; i++)
        {
            ans[element++] = nums[i];
        }
        for(int i=0; i< nums.length;i++)
        {
            ans[element++] = nums[i];
        }
        return ans;

    }
}
