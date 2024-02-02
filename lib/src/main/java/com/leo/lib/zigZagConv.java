package com.leo.lib;

import java.util.Arrays;

public class zigZagConv {
    public static void main (String[] args){
        System.out.println(convert("PAYPALISHIRING",3));
    }

    public static String convert(String s, int numRows) {


        //First making an 2-d array and placing the each word into it. if the place is empty simply put "null" in that location.



        String[][] val = new String[numRows][7];

        String zigName = String.valueOf(s.charAt(0));
        int pointer = 0;
        int pointer2 = 0;
        boolean invertDir = false;
        for (int a = 0 ; a<= s.length();a++){
            System.out.println(Arrays.deepToString(val));
            if(invertDir){
                if(pointer == 0){
                    invertDir =  false;
                    val[pointer][pointer2] = String.valueOf(s.charAt(a));
                    pointer++;
                }else {
                    val[pointer][pointer2] = String.valueOf(s.charAt(a));
                    pointer2++;
                    pointer--;
                }

            }else {
                val[pointer][pointer2] = String.valueOf(s.charAt(a));
              //  pointer++;
                if (pointer+1 != numRows)pointer++;

            }
            if (pointer+1 == numRows){
                invertDir = true;
                pointer2++;
                pointer--;
            }
        }
        System.out.println(Arrays.deepToString(val));

        return zigName;
    }
}
