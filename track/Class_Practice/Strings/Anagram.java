package track.Class_Practice.Strings;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
        } else {

            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            String sortedStr1 = new String(arr1);
            String sortedStr2 = new String(arr2);
            if (sortedStr1.equals(sortedStr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }
        sc.close();

    }
}
