package Sort;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
    int[] arr = {5,3,4,1,2};
        System.out.println(arr.length-1);
    insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr)
    {
        for (int i = 0; i <= arr.length-1 ; i++)
        {
            System.out.println("I" + i);
           for(int j=i+1; j>0; j--)
              {
                  if(arr[j] < arr[j-1])
                  {
                      swap(arr,j,j-1);
                  }

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
