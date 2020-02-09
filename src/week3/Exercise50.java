package week3;

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = scanner.next();
        int counter = 0;
        int i = 0;
        while (i < 3) {
            if (input.length() <= 3) {
                break;
            }
            counter++;
            System.out.println(counter + ". character: " + input.charAt(i));
            i++;
        }
    }
}
