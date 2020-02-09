package week2;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many?");
        int m = scanner.nextInt();
        int i = 0;

        while (i < m) {
            printText();
            i++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

}
