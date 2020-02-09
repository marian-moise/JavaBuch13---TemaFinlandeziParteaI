package week1;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name1 = scanner.next();
        System.out.print("Type your age: ");
        int age1 = scanner.nextInt();
        System.out.println();
        System.out.print("Type your name: ");
        String name2 = scanner.next();
        System.out.print("Type your age: ");
        int age2 = scanner.nextInt();
        int sumAge = age1 + age2;
        System.out.println(name1 + " and " + name2 + " are " + sumAge + " years old in total.");
    }
}
