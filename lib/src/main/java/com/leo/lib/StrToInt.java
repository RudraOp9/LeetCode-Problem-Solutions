package com.leo.lib;

public class StrToInt {

    public static void main(String[] args) {
        String todo = "021474836460";
        System.out.println(myAtoi(todo));
        System.out.println(todo.lastIndexOf("4"));
    }

    public static int myAtoi(String s) {


        String p = s.trim();
        int length = p.length();
        if (length<1){
            return 0;
        }
        

        int ab = 0;
        String charAt;
        int  sign = 1;


        if(String.valueOf(p.charAt(0)).equals("-") ){
            sign = -1;
            ab = 1;
        } else if (String.valueOf(p.charAt(0)).equals("+") ) {
            ab = 1;
        }
        String value = "0";

        while(ab<length){
            if (Long.parseLong(value)*sign <= -2147483648 ){
                return -2147483648;
            } else if (Long.parseLong(value)*sign>=2147483647) {
                return 2147483647;
                
            }
            charAt = String.valueOf(p.charAt(ab));
            if (endPoint(String.valueOf(p.charAt(ab)))){
                value+= charAt;
            }else {
                break;
            }
            ab++;
        }

        while(true){
            if (value.charAt(ab)== 0){

            }else {
                break;
            }
        }

        return (Integer.parseInt(value)*sign);
    }

    private static boolean endPoint(String num) {

        for (int a = 0;  a <10 ;a++){
            String ind = String.valueOf(a);
            if (num.equals(ind)){
                return true;
            }
        }
        return false;
    }
}
