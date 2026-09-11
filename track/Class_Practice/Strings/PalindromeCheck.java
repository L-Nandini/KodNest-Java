package track.Class_Practice.Strings;

import java.util.*;

public class PalindromeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new String");
        String str = sc.nextLine();
        char charArr[] = str.toCharArray();
        char revArr[] = new char[charArr.length];
        int j = revArr.length - 1;
        for (int i = 0; i < charArr.length; i++) {
            revArr[j] = charArr[i];
            j--;
        }
        String revString = new String(revArr);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + revString);
        if (str.equalsIgnoreCase(revString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}