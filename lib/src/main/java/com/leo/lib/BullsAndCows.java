package com.leo.lib;

import java.util.Hashtable;

public class BullsAndCows {
    public static void main(String[] args) {
        /** how we gonna solve this problem ?
         *  first creating an hash table
         *  then iterate the str from 0 and found the bulls, if any bull is found in the str then do not put the index into the hashtable and put others. and increment the int bull
         *  then iterate the str again from 0 and found the cows, if any cows are found ++ , if
         *
         */

        System.out.println(getHint("1807","7810"));
    }
    public static String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        int length = secret.length();
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int a = 0 ; a <length; a++){
            if (secret.charAt(a) == guess.charAt(a)){
                bulls++;
            } else {
                int value2 =  Integer.parseInt(String.valueOf(guess.charAt(a)));
                hashtable.put(value2,value2);


            }
        }
        for (int a = 0 ; a<length;a++){
            int value2 =  Integer.parseInt(String.valueOf(secret.charAt(a)));
            if (hashtable.contains(value2)){
                cows++;
                hashtable.remove(value2);
            }
        }
        System.out.println(hashtable.values());
        return bulls + "A" + cows + "B";
    }
}
