package track.M03.T02;

import java.util.Scanner;

public class FindSecondLargestDistinctValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                // we can write arr[i] > secLargest && arr[i] < largest is same and also
                // if we write arr[i] != largest it will not print largest value
                secLargest = arr[i];
            }
        }

        if (secLargest == Integer.MIN_VALUE)
            System.out.println("No second largest distinct value");
        else
            System.out.println(secLargest);
        sc.close();

    }
}