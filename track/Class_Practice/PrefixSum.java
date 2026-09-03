package track.Class_Practice;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefix_sum[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefix_sum[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prefix_sum[i] + " ");
        }
        // another way
        int prefix_sum_2[] = new int[n];
        prefix_sum_2[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_sum_2[i] = arr[i] + prefix_sum_2[i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prefix_sum_2[i] + " ");
        }
        sc.close();
    }
}
