package week3;

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = scanner.next();
        System.out.println("First character: " + firstCharacters(input));
    }

    public static char firstCharacters(String text) {
        return text.charAt(0);
    }
}
