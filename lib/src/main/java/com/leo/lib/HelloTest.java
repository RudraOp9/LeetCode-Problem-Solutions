package com.leo.lib;

public class HelloTest {
    public static void main(String[] args) {
        String num = "987";
        int num2 = Integer.parseInt(num);
        System.out.println(num2);

        for (int a = 0;  a <10 ;a++){
            String ind = String.valueOf(a);
            if (num.equals(ind)){
                System.out.println(num);
            }
        }
    }
}
