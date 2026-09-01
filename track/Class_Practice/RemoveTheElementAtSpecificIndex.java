package track.Class_Practice;

import java.util.Scanner;

public class RemoveTheElementAtSpecificIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index at which element to be removed");
        int index = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // // if (i != index) {
        // // System.out.print(a[i] + " ");
        // // }
        // if (i == index)
        // continue;
        // System.out.print(a[i] + " ");
        // }
        int b[] = new int[n - 1];
        for (int i = 0; i <= b.length; i++) {
            if (i == index) {
                continue;
            } else if (i > index) {
                b[i - 1] = a[i];
            } else {
                b[i] = a[i];
            }
        }
        sc.close();
    }
}
