package week3;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = scanner.next();
        System.out.println("Last character: " + lastCharacters(input));
    }

    public static char lastCharacters(String text) {
        return text.charAt(text.length()-1);
    }
}
