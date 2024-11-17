package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.printf("Hello, %s!\n", userName);
        sc.close();
    }
}
