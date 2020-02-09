package week2;

public class Exercise40 {


    private static void printWhitespaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
    }

    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }


    public static void printTriangle(int height) {
        int i = 1;

        while (i <= height) {
            printWhitespaces(height - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;

        while (i <= height) {
            printWhitespaces(height - i);
            printStars(2 * i - 1);
            i++;
        }

        i = 2;
        while (--i >= 0) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }


    public static void main(String[] args) {
        printTriangle(4);
        xmasTree(20);

    }
}

