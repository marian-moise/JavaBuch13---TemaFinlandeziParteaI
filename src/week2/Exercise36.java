package week2;

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers:");
        double sum = 0;
        double counter = 0;
        int even = 0;
        int odd = 0;
        double average;
        while (true) {
            int num = scanner.nextInt();
            if(num != -1) {
                if(num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                sum = sum + num;
                counter++;
            }

            if (num == -1) {
                break;
            }
        }
        System.out.println("Thank you and see you later! ");
        System.out.println("The sum is " + (int)sum);
        System.out.println("How many numbers: " + (int)counter);
        System.out.println("Average: " + sum/counter);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);



    }
}
