package week1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number1 = scanner.nextInt();
        System.out.print("Type another number: ");
        int number2 = scanner.nextInt();
        System.out.print("Sum of the numbers: ");
        int sum = number1 + number2;
        System.out.println(sum);
    }
}
