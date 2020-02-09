package week3;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = scanner.next();

        int i = input.length() - 1;
        while (i >= 0) {
            System.out.print(input.charAt(i));
            i--;
        }
    }
}
