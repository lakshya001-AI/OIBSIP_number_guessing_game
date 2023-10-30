package org.example;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args) {
        System.out.println();
        System.out.println("<<<<<<Welcome to the Number Guessing Game>>>>>>");
        System.out.println();

        Random random = new Random();
        int randomvalue = random.nextInt(100) + 1;
        int numberoftries = 0;
        boolean hasGuessedCorrectly = false;
        int score = 0;

        Scanner scanner = new Scanner(System.in);


        while (!hasGuessedCorrectly) {
            System.out.print("Please make a guess between 1 to 100: ");
            System.out.println();
            int userInput = scanner.nextInt();
            numberoftries++;

            int lowerbound = 0;
            int upperbound = 100;
            if (userInput < lowerbound || userInput > upperbound) {
                System.out.println("Please enter a number between 1 and 100");
            } else if (userInput < randomvalue) {
                System.out.println("Too low. Try again.");
            } else if (userInput > randomvalue) {
                System.out.println("Too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations ! you have guessed correctly, " + randomvalue);
                System.out.println("Number of Tries: " + numberoftries);
                score = score + 10;
                System.out.println("Score : " + score);
            }
        }
        scanner.close();
    }

}


