package week1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.println("Number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x > 0) {
            System.out.println("The number is pozitive!");
        } else {
            System.out.println("The number is not positive!");
        }
    }
}
