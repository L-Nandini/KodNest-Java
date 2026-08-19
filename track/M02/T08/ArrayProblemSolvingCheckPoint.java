package track.M02.T08;

import java.util.Scanner;

public class ArrayProblemSolvingCheckPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int arr[] = new int[s];
        int arrTotal = 0;

        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
            arrTotal += arr[i];
        }

        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];
        int matrixTotal = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        System.out.println("Array total: " + arrTotal);
        System.out.println("Matrix total: " + matrixTotal);
        sc.close();
    }
}
