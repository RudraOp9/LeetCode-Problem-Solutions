package com.leo.lib;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Plindrome {

        public static boolean isPalindrome(int x) {
                ArrayList<Integer> arrayList = new ArrayList<>();

                if (x>-1 && x<10){
                    return true;
                }
                if (x<0){
                    return false;
                }else {
                    int decimalSize = 0;
                  int num=x;
                  String number ;
                  double num2 = x;
                  while (num!=0){
                      num2 = num2 /10d;
                      decimalSize++;
                      System.out.println(num2);
                      num = num/10;
                  }
                    System.out.println(num  +" " +num2 );
                  num = 1;
                  while(num != -1){
                      System.out.println(num  +" " +num2 );
                      num = (int) (num2 * 10d);
                      num2 = num2*10d;
                      decimalSize--;
                      if (num == 0){
                          break;
                      }else {
                          System.out.println(num  +" " +num2 );
                          arrayList.add(num);

                          num2 =  num2 - num ;
                          BigDecimal bd = new BigDecimal(num2);

                          bd = bd.setScale(decimalSize, RoundingMode.HALF_UP);
                          num2 = bd.doubleValue();
                      }
                  }
                  int pointer = arrayList.size()-1;
                    System.out.println(arrayList.size());
                    number = "";
                  while(pointer > -1 ){

                      if(number.length() == 0){
                          number = (arrayList.get(pointer)).toString();
                      }else {
                          number += arrayList.get(pointer).toString();
                      }
                      pointer-- ;
                      System.out.println(number);

                  }

                    
                  if (x == Integer.parseInt(number)){
                      return true;
                  }
                }
                return false;
        }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    //    int x = (int) (0.1 *10);
      //  System.out.println(x);
        //String x = "";
        //System.out.println(x.length());

       /* double x = 1.21d;
        double y = 1d;

        BigDecimal bd1 = new BigDecimal(x);
        BigDecimal bd2 = new BigDecimal(y);
        BigDecimal differenceBD = bd1.subtract(bd2);
        System.out.println((differenceBD));


        double difference = x - y;

        System.out.println(bd.doubleValue());*/
    }
}
