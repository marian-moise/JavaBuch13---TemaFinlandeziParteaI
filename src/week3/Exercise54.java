package week3;

import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = scanner.next();
        System.out.println("Length of the end part: ");
        int endPart = scanner.nextInt();

        String x = word.substring(endPart);

        System.out.println("Result: " + word.substring(endPart));
    }
}
