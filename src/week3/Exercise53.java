package week3;

import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word: ");
        String input = scanner.next();
        System.out.println("Length of the first part: ");
        int input2 = scanner.nextInt();
        String firstPart = input.substring(0, input2);

        System.out.println("Result: " + firstPart);
    }
}
