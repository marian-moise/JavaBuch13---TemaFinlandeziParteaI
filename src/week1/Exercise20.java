package week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        System.out.println("Type your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("type your password: ");
        String password = scanner.next();

        if(username.equals("alex") && password.equals("mightyducks")){
            System.out.println("You are now logged into the system!");
        } else if (username.equals("emily") && password.equals("cat")){
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
