package track.M02.T05;

import java.util.Scanner;

class StudentChallenge {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class StudentMethodFinalChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int first = sc.nextInt();
        int second = sc.nextInt();

        StudentChallenge s = new StudentChallenge();

        s.setName(name);
        s.showName();
        s.showScore(first);
        s.showScore(first, second);

        sc.close();
    }
}
