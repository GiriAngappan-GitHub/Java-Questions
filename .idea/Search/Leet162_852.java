package Search;

public class Leet162_852 {
    public static void main(String[] args) {
    int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }

        return start;
    }
}
