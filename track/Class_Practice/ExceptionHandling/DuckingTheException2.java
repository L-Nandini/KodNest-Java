package track.Class_Practice.ExceptionHandling;

import java.util.Scanner;

class DuckingTheException2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main method Execution Started.....");
        divide();
        System.out.println("Main method Execution Completed.....");
    }

    static void divide() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        int res = a / b;
        System.out.println(res);
        scan.close();
    }
}
