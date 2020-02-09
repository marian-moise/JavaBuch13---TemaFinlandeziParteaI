package week2;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Introduce number:");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            sum = read + sum;

            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }

}
