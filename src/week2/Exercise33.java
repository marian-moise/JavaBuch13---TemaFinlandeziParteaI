package week2;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First:");
        int x = scanner.nextInt();
        System.out.println("Last:");
        int y = scanner.nextInt();
        int sum = 0;

        while(x <= y) {
            sum = sum + x;
            x++;
        }
        System.out.println("The sum " + sum);
    }
}
