package track.Class_Practice.ExceptionHandling;

import java.util.*;

public class TryWithResource {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // automatically closes the scanner resource
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Number: " + a);
        }
    }
}
