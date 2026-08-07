package track.Class_Practice;

import java.util.Scanner;

public class ScannerMethodsDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // next()
        System.out.print("Enter one word: ");
        String word = sc.next();
        System.out.println("Word = " + word);

        // Clear the newline
        sc.nextLine();

        // nextLine()
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine();
        System.out.println("Sentence = " + line);

        sc.close();
    }
}
