package track.M04.T02;

import java.util.Scanner;

public class Checkananagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String first = sc.nextLine().toLowerCase();
            String second = sc.nextLine().toLowerCase();

            // Match each character of first with the mutable copy of second.
            // Display the result.
            if (first.length() != second.length()) {
                System.out.println("Anagram : false");
                return;
            }

            StringBuilder str = new StringBuilder(second);

            for (int i = 0; i < first.length(); i++) {
                int index = str.indexOf(String.valueOf(first.charAt(i)));
                if (index == -1) {
                    System.out.println("Anagram: false");
                    return;
                }
                str.deleteCharAt(index);
            }

            System.out.println("Anagram: true");
        }
    }
}
