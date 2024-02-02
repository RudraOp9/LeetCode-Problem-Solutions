package com.leo.lib;

import java.util.Stack;

public class EVLNum {
    public static void main(String[] args){
        String[] token = {"4","13","5","/","+"};
        System.out.println(evalRPN(token));
    }
    public static int evalRPN(String[] tokens) {
        int length = tokens.length;
        if (length<2){
            return Integer.parseInt(tokens[0]);
        }
       // int
        String plus =  "+";
        String minus =  "-";
        String multi=  "*";
        String divide=  "/";

        int firstNum = Integer.parseInt(tokens[0]);
        int secondNum= Integer.parseInt(tokens[1]);
        String crr = tokens[2];
        for (int a = 2;a<length;a++){
            crr = tokens[a];
            if (crr.equals(plus)){
                secondNum = firstNum+secondNum;
                /*if (! tokens[a+1].equals(plus) &&  !tokens[a+1].equals(minus) && !tokens[a+1].equals(multi) && !tokens[a+1].equals(divide)){
                    secondNum = Integer.parseInt(tokens[a+1]);
                }*/
               // firstNum =
            } else if ( crr.equals(minus)) {
                secondNum = firstNum-secondNum;
              //  if (! tokens[a+1].equals(plus) &&  !tokens[a+1].equals(minus) && !tokens[a+1].equals(multi) && !tokens[a+1].equals(divide)){
                  //  secondNum = firstNum+secondNum;
              //  }
            } else if ( crr.equals(multi)) {
                secondNum = firstNum*secondNum;
              //  if (! tokens[a+1].equals(plus) &&  !tokens[a+1].equals(minus) && !tokens[a+1].equals(multi) && !tokens[a+1].equals(divide)){
                   // secondNum = firstNum+secondNum;
              //  }
            } else if ( crr.equals(divide)) {
                secondNum = firstNum/secondNum;
               // if (! tokens[a+1].equals(plus) &&  !tokens[a+1].equals(minus) && !tokens[a+1].equals(multi) && !tokens[a+1].equals(divide)){
                    //secondNum = firstNum+secondNum;
              //  }
            }else {
                firstNum = secondNum;
               // if (! tokens[a+1].equals(plus) &&  !tokens[a+1].equals(minus) && !tokens[a+1].equals(multi) && !tokens[a+1].equals(divide)){
                    secondNum = Integer.parseInt(tokens[a]);
               // }
            }

        }
        return secondNum;
    }
}
