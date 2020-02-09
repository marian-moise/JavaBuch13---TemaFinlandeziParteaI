package week1;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println("Type the first number:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Type the second number:");
        int number2 = scanner.nextInt();

        if(number1 > number2) {
            System.out.println("Greater number: " + number1);
        } else if (number1 < number2) {
            System.out.println("Greater number: " + number2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
