package com.leo.lib;

import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] val = {3,2,4};

        int[] x = twoSum(val,6);
        System.out.println("Hello, World!" + Arrays.toString(x));
    }
    private static int[] twoSum(int[] nums, int target) {
        int position = 0;
        int positionTwo = 0;
        int[] solution;

        for (int a; true; positionTwo++) {
            System.out.println("Hello, !" +positionTwo +" "+ position);
            int firstNum = nums[position];
            a = nums[positionTwo] ;

            if (position != positionTwo) {

                if (firstNum + a == target) {
                    solution = new int[] { positionTwo, position };
                    break;
                }
            }
            if (positionTwo+1 == nums.length) {
                position++;
                positionTwo = 0;
            }
        }
        return solution;
    }

}