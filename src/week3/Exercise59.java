package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        Collections.reverse(words);
        System.out.println("You typed the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
