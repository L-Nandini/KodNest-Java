package track.Class_Practice.Threads;

import java.util.Scanner;

public class ThreadsPgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Activity 1
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println(a);
        // Activity 2
        System.out.println("Enter First number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = sc.nextInt();
        int res = n1 + n2;
        System.out.println("Addition result is:" + res);
        sc.close();
    }
}
