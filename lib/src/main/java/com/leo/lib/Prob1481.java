package com.leo.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Prob1481 {

    public static void main(String[] args) {

        System.out.println(findLeastNumOfUniqueInts(new int[]{4, 3, 1, 1, 3, 3, 2}, 3));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

// this is not perfect but i used hashmap

        // i will try to decrease the ms if i got some penny of time.


        //  if (arr.length == 0 || k == arr.length) return 0;

        HashMap<Integer, Integer> hashtable = new HashMap<>();


        for (int i : arr) {
            hashtable.put(i, hashtable.getOrDefault(i, 0) + 1);

        }

        ArrayList<Integer> newValArr = new ArrayList<>(hashtable.values());

        Collections.sort(newValArr);

        int byteToremove = 0;
        for (int c = 0; c < newValArr.size() && k >= newValArr.get(c); c++) {
            k -= newValArr.get(c);
            //   newValArr.remove(c);  taking so much ms , i just noticed and time goes from 418 ms to 44 . LOL
            byteToremove++;

        }
        return newValArr.size()-byteToremove;
    }

}
