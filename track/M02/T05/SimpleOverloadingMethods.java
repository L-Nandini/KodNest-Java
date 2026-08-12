package track.M02.T05;

import java.util.Scanner;

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);

    }
}

public class SimpleOverloadingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String w = sc.next();
        Printer p = new Printer();
        p.show(num);
        p.show(w);
        sc.close();
    }

}
