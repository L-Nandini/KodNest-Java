package track.PracticeSession;

import java.util.Scanner;

class EmployeeProfile {
    int id;
    String name;
    String department;

    EmployeeProfile(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void displayProfile() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class EmployeeProfileInitialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        String department = sc.next();

        EmployeeProfile e = new EmployeeProfile(id, name, department);
        e.displayProfile();
        sc.close();
    }
}
