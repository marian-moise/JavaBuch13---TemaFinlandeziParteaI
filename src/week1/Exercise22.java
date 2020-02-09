package week1;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Type the password:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            String password = "carrot";

            if (input.equals(password)) {
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar!");//"well done"
    }
}
