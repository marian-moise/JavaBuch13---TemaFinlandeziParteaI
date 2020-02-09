package week2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Until what? ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;

        while(i < n) {
            i++;
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
