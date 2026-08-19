package track.Class_Practice;

import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of blocks : ");
        int a = sc.nextInt();
        System.out.println("Enter No of rows : ");
        int b = sc.nextInt();
        System.out.println("Enter No of columns : ");
        int c = sc.nextInt();
        int arr[][][] = new int[a][b][c];
        System.out.println("Enter the values : ");
        for (int i = 0; i <= a - 1; i++) {
            for (int j = 0; j <= b - 1; j++) {
                for (int k = 0; k <= c - 1; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("The values are : ");
        for (int i = 0; i <= a - 1; i++) {
            for (int j = 0; j <= b - 1; j++) {
                for (int k = 0; k <= c - 1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
