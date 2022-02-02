package com.timur;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner;
        int randomNumber = randomNumber();
        int tries = 0;
        int guess;

        do {
            System.out.print("Guess: ");
            try {
                scanner = new Scanner(System.in);
                guess = scanner.nextInt();
            } catch (java.util.InputMismatchException e){
                System.out.println("Your input is invalid\r\n");
                guess = 0;
                continue;
            }
            if (guess > randomNumber) {
                System.out.println("Guess smaller\r\n");
            } else {
                System.out.println("Guess bigger\r\n");
            }
            tries += 1;

        } while (randomNumber!=guess);
        tries += 1;
        System.out.println("You guessed correct!!");
        System.out.println("It only took " + tries + " tries");
    }

    static int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}