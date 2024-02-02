package com.leo.lib;

import java.util.Arrays;

public class solveTheArray2 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println("answer " +removeDuplicates(arr));
    }



        public static int removeDuplicates(int[] nums) {

            int[] arra = new int[nums.length];
            int uniqueValue = 0;
            int pointerNum = -10000;
            int prevNum = nums[0];
            int arrPos = 0;
            for (int position = 0;position<nums.length;position++){
                // System.out.println(pointerNum);
                int x = nums[position];
                if (position != 0 && position != 1){
                    if ( x >= pointerNum){
                        if (x != prevNum){
                            uniqueValue++;
                            pointerNum = x;
                            arra[arrPos] = x;
                            prevNum = nums[position-1];
                            // nums[arrPos] = x;
                            arrPos++;
                            System.out.println(" the pointer num; " + pointerNum);
                        }
                    }

                }else{
                    arra[arrPos] = x;
                    arrPos++;
                    uniqueValue++;
                    pointerNum = x;
                }

                for (int a = 0 ; a<uniqueValue;a++){
                    nums[a]=arra[a];
                }
                System.out.println(Arrays.toString(arra));
                System.out.println(Arrays.toString(nums));
            }
            return uniqueValue;
        }




    }
