package com.leo.lib;

//https://leetcode.com/problems/reverse-integer/description/
//Solved
public class RevIntiger {
    public static void main(String[] args) {
        System.out.println(reverse(555559999));
    }
    public static int reverse(int x) {
        long reverse = 0;
        while(x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x/10;
            if (reverse > Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) reverse;
}
}
