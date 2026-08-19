package track.Class_Practice;

import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the values : ");
        for (int i = 0; i <= r - 1; i++) {
            for (int j = 0; j <= c - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The values are : ");
        for (int i = 0; i <= r - 1; i++) {
            for (int j = 0; j <= c - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
