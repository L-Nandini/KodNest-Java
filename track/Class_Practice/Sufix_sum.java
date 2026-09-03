package track.Class_Practice;

import java.util.Scanner;

public class Sufix_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sufix_sum[] = new int[n];
        sufix_sum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufix_sum[i] = arr[i] + sufix_sum[i + 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sufix_sum[i] + " ");
        }
        sc.close();
    }
}
