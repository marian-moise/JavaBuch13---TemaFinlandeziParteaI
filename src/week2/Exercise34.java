package week2;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = scanner.nextInt();
        int produs = 1;

        for (int i = 1; i <= number ; i++) {
            produs = produs*i;
        }
        System.out.println("Factorial is " + produs);

    }
}
