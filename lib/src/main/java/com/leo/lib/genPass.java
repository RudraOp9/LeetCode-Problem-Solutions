package com.leo.lib;

import java.util.ArrayList;

import java.util.Collections;


public class genPass {
    public static void main(String[] args) {
        byte alphaCapLength = 4;
        byte specialSymbol = 2;
        byte numberslen = 4;
        byte alphaSmallLength = 6;

        byte passLength = 16;

        String[] capitalLetter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"} ;
        String[] smalLetter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y"} ;
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String[] specials = {"#","$","&","*","@","~","?","=","/",":"};

        //String[] password = new String[16];
        ArrayList<String> password = new ArrayList<>(passLength);
        // adding alphabetical small to password array

        for (byte a = 0; a < alphaSmallLength; a++){
            password.add(smalLetter[(int) (Math.random() * 25)]);
        }
        for (byte d = 0; d < specialSymbol; d++){
            password.add( specials[(int) (Math.random() * 9)]);
        }
        for (byte c = 0; c < numberslen; c++){
            password.add( numbers[(int) (Math.random() * 9)]);
        }

        for (byte b = 0; b < alphaCapLength; b++){
            password.add(capitalLetter[(int) (Math.random() * 25)]);
        }


        Collections.shuffle(password);

        String pass = "";
        for (String a : password){
            pass += a;
        }

    }
}
