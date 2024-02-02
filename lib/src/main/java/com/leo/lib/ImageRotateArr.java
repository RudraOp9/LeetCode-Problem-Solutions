package com.leo.lib;

import java.util.Arrays;

public class ImageRotateArr {
    public static void rotate(int[][] matrix) {
      //  System.out.println(matrix[0].length);
        System.out.println(Arrays.deepToString(matrix));
        // defining resulting matrix : rows and column are always equal
      //  int column = matrix[0].length;
      //  int rows = matrix.length;

        int originVal = 2000;
        int dimen = matrix.length;
        // targeting corners

      // getting the transpose of the matrix

        for (int x = 0; x < matrix.length;x++){
            for (int y = 0; y < matrix[x].length;y++){
                System.out.println(Arrays.deepToString(matrix));
                int valueOne = matrix[x][y];
                int valueTwo = matrix[y][x];

                matrix[x][y] = valueTwo;
                matrix[y][x] = valueOne;
                System.out.println(valueOne +" " + valueTwo);
            }

        }

        System.out.println(Arrays.deepToString(matrix));

    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3}
                    ,  {4,5,6}
                    ,  {7,8,9}};
       // mat[0][0] = 12;
        rotate(mat);

    }

}
