package com.leo.lib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Biweekly124 {
    public static void main(String[] args) {
        /*int firstSum = args[0]+args[1];
        int ans =0;
        int lastP =args.length-1;
        int firstP = 0;
        for (int a = 0; a<lastP;a+=2){
          if (args[a+1]+args[a] == firstSum){
              ans++;
              firstP =
              continue;
          } else if (args[args.length]+args[a] == firstSum) {
              
          }
            break;
        }*/



        String s = "hello";
        HashMap<Character,Integer> a = new HashMap<>();
        for (int b = 0; b<s.length();b++) {
            a.put(s.charAt(b), a.getOrDefault(s.charAt(b), 0) + 1);
        }

        ArrayList<Character> sd = new ArrayList<>(a.keySet());
        ArrayList<Integer> sd2 = new ArrayList<>(a.values());

        int maxNum = 0;
        a.clear();
        for( int v = 0; v<sd2.size(); v++){
            System.out.println(a);
            int x = sd2.get(v);
            if(x>maxNum){
                a.clear();
                a.put(sd.get(v),s.lastIndexOf(sd.get(v)));
                maxNum = x;
            } else if (x==maxNum) {
                a.put(sd.get(v),s.lastIndexOf(sd.get(v)));
            }
        }
        sd2.clear();
        sd2.addAll(a.values());

        Collections.sort(sd2);
        String ans = "";
        for(int ay : sd2){
            ans += s.charAt(ay);
        }
       // return ans;
        System.out.println(ans);


      /*
      int operation = 0;
        StringBuilder newP = new StringBuilder(p);
        System.out.println(a);
        int length = p.length();
        String crr;
        String old = p;
        while(newP.length() !=0) {
            for (int z = 0; z < a.size(); z++) {
                int first = newP.indexOf(String.valueOf(a.get(z)));
                //int last = p.lastIndexOf(a.get(z));
                if (first != -1)   newP.deleteCharAt(first);

            }
            crr = old;
            old = newP.toString();
            operation++;
        }
        System.out.println(operation);*/

    }
}
