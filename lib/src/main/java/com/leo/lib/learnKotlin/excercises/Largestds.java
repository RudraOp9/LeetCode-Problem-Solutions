package com.leo.lib.learnKotlin.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largestds {
    public static void main(String[] args) {
        System.out.println(largestDivisibleSubset(new int[]{4,8,10,240}));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>();
        boolean takeIt = true;
        for(int a = 0 ; a<nums.length ; a++){
            for(int b = a+1; b<nums.length; b++){
                int a1 = nums[a];
                int b1 = nums[b];
                if (a1 == -1 || b1 ==-1){
                    break;
                }
                if(b1 % a1 == 0 ){
                    if (!ans.contains(b1) && !ans.contains(a1) ){
                        ans.add(a1);
                        ans.add(b1);

                    } else break;
                }else{
                    nums[b] = -1;
                }
            }
        }
        if (ans.isEmpty()){
            System.out.println("khali hai");
            ans.add(nums[0]);
        }
      //  System.out.println(ans.get(0));
        return ans;
    }
}
