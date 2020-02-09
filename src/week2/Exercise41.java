package week2;

import java.util.Random;
import java.util.Scanner;

public class Exercise41 {

    public static void main(String[] args) {
        drawNumber(83);
    }

    public static void drawNumber(int guess) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int input = scanner.nextInt();
//            int guess;
//            Random random = new Random();
//            guess = random.nextInt(100);
//            System.out.println(guess);
            //int guess = 83;

            if (input == guess) {
                break;
            } else if (guess < input) {
                System.out.print("The number is lesser");
            } else {
                System.out.print("The number is greater");
            }
            counter++;
            System.out.println(" , guesses made: " + counter);
        }
        System.out.print("Congratulations, your guess is correct!");
    }
}
