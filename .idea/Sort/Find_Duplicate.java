package Sort;
//https://leetcode.com/problems/find-the-duplicate-number/
//2-https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class Find_Duplicate {
    public static void main(String[] args) {

    }
    public int cyclic(int[] arr)
    {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;

    }

    public void swap(int[] arr, int s,int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
