package com.jmitchell.colorquotes;

import java.util.Random;

public class Utils {

    public static int getRandomNumber(int max){
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int randomNumber = random.nextInt(max);
        return randomNumber;
    }
}
