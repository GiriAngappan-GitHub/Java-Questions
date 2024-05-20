package Sort;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
            int[] arr = {5,6,4,1,3,2};
            cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void cyclic(int[] arr)
    {
        int i=0;
        while (i < arr.length)
        {
            int correct = arr[i] -1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            } else
            {
                i++;
            }

        }
    }
    static  void swap(int[] arr , int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
