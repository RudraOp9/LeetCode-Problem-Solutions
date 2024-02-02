package com.leo.lib;

// https://leetcode.com/problems/longest-common-prefix/description/
// solved
public class LCPSol {
    public static void main(String[] args) {
        String[] karma  = {"ab","a"};
        System.out.println(longestCommonPrefix(karma));
    }
    public static String longestCommonPrefix(String[] strs) {
        String answer = "";
        for (int a = 0; a<strs[0].length();a++){
            char shorts = strs[0].charAt(a);
            System.out.println("check1" +answer);
            for (int b=0; b<strs.length;b++) {
                System.out.println("check2" + answer);
                char reel;
                if (strs[b].length() > a) {
                    reel = strs[b].charAt(a);
                } else return answer;
                if (shorts == reel) {
                    System.out.println("checking");
                    if (b == strs.length - 1) {
                        answer += reel;


                        System.out.println("check" + answer);
                    }
                } else {
                    return answer;
                }
            }
        }
        return answer;
    }
}
