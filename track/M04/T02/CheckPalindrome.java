package track.M04.T02;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Create the reversed word and compare it.
        StringBuilder str = new StringBuilder(word);
        str.reverse();
        String reverse = str.toString();

        System.out.println("Reversed: " + reverse);
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Palindrome: false");
        }
        scanner.close();
    }
}