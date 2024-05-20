package Search;

public class Leet744 {
    public static void main(String[] args) {
        char[] arr = {'x','x','y','y','y'};
        char[] arr2 = {'c','f','j'};

        System.out.println(nextGreatestLetter(arr,'z'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start % letters.length);

        return letters[start % letters.length];
    }


}
