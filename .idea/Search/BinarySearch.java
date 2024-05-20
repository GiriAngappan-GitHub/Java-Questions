package Search;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,7,10,12,15};
        int[] arr2 = {15,12,10,7,4,3,2,1};
        System.out.println(BinarySearch(arr2,4));

    }

    public  static  int BinarySearch(int[]arr,int target)
    {
        int start = 0,end = arr.length-1;

        boolean ascorder = arr[start] < arr[end];

        while (start<= end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            if (ascorder)
            {
                if(target < arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else
            {
                if(target < arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }

        }

        return -1;
    }

}
