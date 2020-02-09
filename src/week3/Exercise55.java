package week3;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String word1 = scanner.next();
        System.out.println("Type the second word: ");
        String word2 = scanner.next();
        int index = word1.indexOf(word2);
        String containedWord = word1.substring(index);

        if(containedWord.equals(word2)) {
            System.out.println("The word " + word2 + " is found in the word "  +
                    word1);

        }



    }
}
