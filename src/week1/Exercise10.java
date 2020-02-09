package week1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius = scanner.nextInt();
        double circleCircumference = 2*Math.PI*radius;
        System.out.println("Circumference of the circle: " + circleCircumference);
    }
}
