package track.Class_Practice;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of rows ");
        int r = sc.nextInt();

        int a[][] = new int[r][];

        // // Define the size of each row
        // a[0] = new int[5];
        // a[1] = new int[2];
        // a[2] = new int[4];

        System.out.println("Enter the values : ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter No of columns ");
            int c = sc.nextInt();
            a[i] = new int[c];
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The values are : ");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
