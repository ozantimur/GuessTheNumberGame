package com.timur;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        

    }

    static int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return randomNumber;
    }
}
