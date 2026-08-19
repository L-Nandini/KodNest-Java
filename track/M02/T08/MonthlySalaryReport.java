package track.M02.T08;

import java.util.Scanner;

public class MonthlySalaryReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];

                System.out.println("Product " + (i + 1) + " total: " + sum);
                sum = 0;

            }

        }
        sc.close();

    }

}
