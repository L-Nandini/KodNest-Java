package track.PracticeSession;

import java.util.Scanner;

class EmployeeRole {
    String name;
    String role;

    EmployeeRole() {
        role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee role: " + role);
    }
}

public class DefaultEmployeeRole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        EmployeeRole e = new EmployeeRole();
        e.name = name;

        e.displayProfile();

        sc.close();
    }
}
