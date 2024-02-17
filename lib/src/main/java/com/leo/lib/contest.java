package com.leo.lib;

import java.util.Arrays;

public class contest {
    public static void main(String[] args) {

        int[][] matrix = {{3,-1},{5,2}};
        int maxNum = -1;
        int posToChan = 0;
        for (int a = 0; a<matrix.length ; a++) {
            for (int b =0 ; b<matrix[a].length;b++) {
                if (matrix[a][b] == -1) {
                    posToChan = b;
                    for (int c = 0; c< matrix.length;c++){
                        if (matrix[c][posToChan] > maxNum){
                            maxNum = matrix[c][posToChan];
                        }
                    }
                    matrix[a] [posToChan] = maxNum;
                    maxNum = -1;

                }

            }





        }
        System.out.println(Arrays.deepToString(matrix));

    }
}
