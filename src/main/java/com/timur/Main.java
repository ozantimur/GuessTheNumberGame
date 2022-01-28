package com.timur;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer randomNumber = randomNumber();
        int tries = 0;

        while (randomNumber.equals(randomNumber)) {
            System.out.print("Guess: ");
            Integer guess = scanner.nextInt();
            if (guess.equals(randomNumber)) {
                tries += 1;
                System.out.println("You guessed correct!!");
                System.out.println("It only took " + tries + " tries");
                break;
            } else if (guess > randomNumber) {
                System.out.println("Guess smaller");
                tries += 1;
                System.out.println("");
                continue;
            } else if (guess < randomNumber) {
                System.out.println("Guess bigger");
                tries += 1;
                System.out.println("");
                continue;
            } else {
                System.out.println("Your guess is not valid");
                System.out.println("Try again");
                System.out.println("");
                continue;
            }
        }
    }

    static int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return randomNumber;
    }
}