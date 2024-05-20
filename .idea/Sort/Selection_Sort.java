package Sort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
    int[]arr = {5,6,3,2,1};
    SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr)
    {
        for (int i=0; i< arr.length; i++)
        {
            int lastnum = arr.length - i - 1;
            int max = getMax(arr,0,lastnum);
            if(max != i)
            {
                swap(arr,max,lastnum);
            }


        }

    }


    public  static  int getMax(int[] arr,int start , int end)
    {
                int max = start;
                for (int i = start; i <= end; i++)
                {
                       if(arr[max] < arr[i])
                       {
                           max = i;
                       }

                 }
                        
                 return max;

    }
    public  static  void swap(int[] arr , int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
