package Sort;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1,6};
        bubble(arr);
        System.out.println( Arrays.toString(arr) );

    }
    public  static  void bubble(int[] arr)
    {
        boolean swappped;
        for (int i = 0; i <arr.length; i++) {
            swappped = false;

                    // j <=arr.length-1-i
            for (int j = 1; j <arr.length-i ; j++) {

                        if(arr[j] < arr[j-1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j-1];
                            arr[j-1] = temp;
                        }
                swappped = true;

            }
            if(!swappped)
            {
                break;
            }
        }
    }
}
