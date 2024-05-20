package Array_Leet_Qus;

import java.util.Arrays;

public class Leet_54 {
    public static void main(String[] args) {
              int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
              int[] ans = new int[12];
              int mid = (mat.length)/2;
              int len = ans.length-1;
              int elemet = 0;

        for (int i = 0; i <mat.length ; i++) {

            int col = mat[i].length-1;

            for (int j = 0; j <mat[i].length ; j++) {

                if(i == 0) {ans[elemet++] = mat[i][j];}

                if(i>0 &&i != mat.length-1)
                {
                    if(col == mat[i].length-1 ) {ans[elemet++] = mat[i][col--];}

                    if(col >=0 && col < mat[i].length-1) {ans[len--] =mat[i][col--];}

                }

                if(i == mat.length-1) {ans[elemet++] = mat[i][col--];}

            }
        }
        System.out.println(Arrays.toString(ans));
    }



}
