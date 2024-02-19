package com.leo.lib;

import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
    }
    public static int removeElement(int[] nums, int val) {
        byte crr=0;
        for(byte a = 0; a<nums.length;a++){
            byte now = (byte) nums[a];
            if(now!=val){
                nums[crr] = now;
                crr++;
            }
        }
        return crr;
    }
}
