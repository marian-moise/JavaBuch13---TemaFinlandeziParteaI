package week1;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.println("How old are you? ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Impossible!");
        } else if (age >= 150) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
