package track.M04.T01;

import java.util.Scanner;

public class CompareTwoTextValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        // Compare the two values in both ways.
        if (firstText.equals(secondText)) {
            System.out.println("Exact match: true");
        } else {
            System.out.println("Exact match: false");
        }
        if (firstText.equalsIgnoreCase(secondText)) {
            System.out.println("Ignore-case match: true");
        } else {
            System.out.println("Ignore-case match: false");
        }
        scanner.close();
    }
}