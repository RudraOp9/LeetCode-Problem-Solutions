package com.leo.lib;

import java.util.Arrays;

public class sortTheArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println("answer " +removeDuplicates(arr));
    }



    public static int removeDuplicates(int[] nums) {

     //   int[] arr = new int[nums.length];
        int uniqueValue = 0;
        int pointerNum = -101;
        int arrPos = 0;
        for (int position = 0;position<nums.length;position++){
           // System.out.println(pointerNum);
            int x = nums[position];
            if ( x > pointerNum){
                uniqueValue++;
                pointerNum = x;
                nums[arrPos] = x;
                arrPos++;
                System.out.println(pointerNum);
            }
        }
        return uniqueValue;
    }




}
