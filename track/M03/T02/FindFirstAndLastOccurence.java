package track.M03.T02;

import java.util.Scanner;

public class FindFirstAndLastOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                first = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == value) {
                last = i;
                break;
            }
        }
        System.out.println(first + " " + last);
        sc.close();

    }

}
