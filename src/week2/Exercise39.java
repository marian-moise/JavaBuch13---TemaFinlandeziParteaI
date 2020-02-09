package week2;

public class Exercise39 {

    private static void printStars(int amount) {
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = 0;
        while(i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
     public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
     }

     public static void printRectangle(int width, int height) {
         int i = 0;
         while (i < height) {
             printStars(width);
             i++;
         }
     }

     public static void prinTriamgle(int size) {
        int i = 0;
        while (i <= size) {
            printStars(i);
            i++;
        }

     }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17,3);
        prinTriamgle(4);
    }
}
