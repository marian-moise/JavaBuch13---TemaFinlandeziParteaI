package week2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int x = scanner.nextInt();
        int counter = 0;

        while(counter < x) {
            counter++;
            System.out.println(counter);
        }
    }
}
