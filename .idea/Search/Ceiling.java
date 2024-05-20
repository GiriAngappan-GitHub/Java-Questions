package Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int[] arr2 = {2,3,4,5,6,8,10};
        System.out.println( "Search.Ceiling: "  +Ceiling( arr2,7));
//        System.out.println("Floor: " + Floor(arr,15));
    }
    public  static  int Ceiling(int[]arr,int target)
    {
        //the smallest element in the array greater than or equal to 'x ceiling of a number
        //he largest element in the array smaller than or equal
        int start = 0,end = arr.length-1;



        while (start<= end)
        {
            int mid = start + (end-start)/2;

                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }
                else {
                    return  mid;
                }




        }

        return start;
    }

    public  static  int Floor(int[]arr,int target)
    {
        //the smallest element in the array greater than or equal to 'x ceiling of a number
        //he largest element in the array smaller than or equal
        int start = 0,end = arr.length-1;



        while (start<= end)
        {
            int mid = start + (end-start)/2;

//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                return  mid;
            }


        }

        return end;
    }


}
