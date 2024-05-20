package Sort;
//268 Leetcode
//2-https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

public class MissingNumbers {
    public static void main(String[] args) {

int[] arr = {9,6,4,2,3,5,7,0,1};

        System.out.println(missing(arr));

    }
    public  static int missing(int[] arr)
    {
        int i=0;

        while (i < arr.length)
        {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }

        for (int j = 0; j < arr.length ; j++) {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }

    public  static void swap(int[] arr,int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

}
