package track.Class_Practice.ExceptionHandling;

import java.util.Scanner;

// 1. Custom Exception Class1
class UnderAgeException1 extends Exception {
    UnderAgeException1() {
        System.out.println("You are too young... still have a time");
    }
}

// 1. Custom Exception Class2
class OverAgeException extends Exception {
    OverAgeException() {
        System.out.println("You are too old... take rest");
    }
}

// 2. Class containing the validation logic
class DrivingLicence1 {
    int age;

    void takeUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your AGE: ");
        age = scan.nextInt();
        scan.close();
    }

    void verify() throws UnderAgeException1, OverAgeException {
        if (age < 18) {
            throw new UnderAgeException1();
        } else if (age > 65) {
            throw new OverAgeException();
        } else {
            System.out.println("DrivingLicence will be issued");
        }
    }
}

public class CustomException2 {
    public static void main(String[] args) {
        DrivingLicence1 dl = new DrivingLicence1();
        dl.takeUserInput();
        try {
            dl.verify();
        } catch (UnderAgeException1 | OverAgeException e) {
            e.printStackTrace();
        }
    }
}