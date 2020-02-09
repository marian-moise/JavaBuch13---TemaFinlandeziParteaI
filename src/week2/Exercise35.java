package week2;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number:");
        int num = scanner.nextInt();
        int i = 0;
        int base = 2;
        int result = 0;

         while (i <= num) {
             result = result +  (int)Math.pow(base,i);
             i++;
         }
        System.out.println(result);
    }
}
