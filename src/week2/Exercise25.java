package week2;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("Type the first number:");
        int read = reader.nextInt();
        System.out.println("Type the second number:");
        read = read + reader.nextInt();
        System.out.println("Type the third number:");
        read = read + reader.nextInt();

        sum = read;

// WRITE YOUR PROGRAM HERE
// USE ONLY THE VARIABLES sum, reader AND read!
        System.out.println("Sum: " + sum);

    }
}
