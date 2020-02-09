package week2;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First: ");
        int x = scanner.nextInt();
        System.out.println("Last: ");
        int y = scanner.nextInt();

        while (x < y) {
            if (x > y) {
                break;
            }
            x++;
            System.out.println(x);
        }
    }
}
