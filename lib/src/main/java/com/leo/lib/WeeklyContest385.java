package com.leo.lib;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WeeklyContest385 {
    public static void main(String[] words1) {


       /*

        //prob 1
          String[] words = new String[]{"a", "aba", "ababa", "aa"};
        int count = 0;
        for (int a = 0; a < words.length-1; a ++) {
            String word1 = words[a];
            for (int b = a+1; b<words.length; b++){
                String word2 = words[b];
                if (word1.length() > word2.length()) continue;
                if (word1.equals(word2.substring(0, word1.length()))) {
                    if (word1.equals(word2.substring(word2.length() - word1.length()))) {
                        count++;
                    }
                }
            }

        }
        System.out.println(count);*/

        //getting tle :(
        int[] arr1 = new int[]{657,1916,3207,555,701,657,1312,3209,2601,1319,4988,4131,4072,2084,576,581,2955,2539,4809,2579,1761,3231,1400,4359,60,1058,2801,1126,2660,154,515,3321,1040,397,2427,4127,4725,804,707,1960,3956,2583,4333,4796,3286,2772,4126,2470,1683,2991};
        int[] arr2 = new int[]{1724,1423,3422,210,484,491,796,246,3577,38,4639,3456,2857,299,1486,4928,3738,1285,3849,4837,2278,754,2272,1359,2821,3027,89,1164,2859,449,3436,125,688,2707,4401,2511,1636,4214,4209,3431,850,4044,4571,1454,3188,1432,4150,2105,4196,821};


        int maxCount = 0;
        for (int j : arr1) {
            String one = String.valueOf(j);
            if (one.length()<maxCount)continue;
           // System.out.println("\""+one+"\"");
            for (int i : arr2) {
                String two = String.valueOf(i);
                if (two.length()<maxCount)continue;
             //   if (one.length() > two.length()) continue;
                for (int a = 0; a<=one.length();a++){
                    if (one.substring(0,a).equals(two.substring(0, Math.min(one.substring(0,a).length(), two.length())) ) ) {
                        if (one.substring(0,a).length() > maxCount) {
                            maxCount = one.substring(0,a).length();
                        }
                    }else break;
                }
           //     one.compareTo()

            }
        }
        System.out.println(maxCount);

    }


}
