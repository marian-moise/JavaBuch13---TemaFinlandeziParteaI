package week1;

import libs.Graph;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Input number:");
            Scanner scanner = new Scanner(System.in);
            double number = Double.parseDouble(scanner.nextLine());
            if (number < -30 || number > 40) {
                continue;
            }
            Graph.addNumber(number);
        }
    }
}
