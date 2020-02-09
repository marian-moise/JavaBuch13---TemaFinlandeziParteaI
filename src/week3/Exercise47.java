package week3;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = scanner.next();
        System.out.println("Number of characters: " + calculateCharacters(input));
    }

    public static int calculateCharacters(String text) {
        return text.length();
    }
}
