package track.PracticeSession;

import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    Employee() {
        this.employeeId = 0;
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.bonus = 0.0;
    }

    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    void addBonus(double bonusAmount) {
        this.bonus += bonusAmount;
    }

    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = basicSalary * bonusPercentage / 100;
        double additionalBonus = percentageBonus + extraReward;
        this.bonus += additionalBonus;
    }

    double calculateTotalSalary() {
        double totalSalary = basicSalary + bonus;
        return totalSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class EmployeePayrollManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First employee input
        int e1Id = Integer.parseInt(sc.nextLine());
        String e1Name = sc.nextLine();
        double e1BasicSalary = Double.parseDouble(sc.nextLine());
        double e1Bonus = Double.parseDouble(sc.nextLine());

        // Second employee input
        int e2Id = Integer.parseInt(sc.nextLine());
        String e2Name = sc.nextLine();
        double e2BasicSalary = Double.parseDouble(sc.nextLine());
        double e2Bonus = Double.parseDouble(sc.nextLine());

        // Bonus percentage and extra reward
        double bonusPercentage = Double.parseDouble(sc.nextLine());
        double extraReward = Double.parseDouble(sc.nextLine());

        // Employee 1 using zero-parameter constructor
        Employee e1 = new Employee();

        e1.setEmployeeDetails(e1Id, e1Name, e1BasicSalary);

        e1.addBonus(e1Bonus);

        // Employee 2 using parameterized constructor
        Employee e2 = new Employee(e2Id, e2Name, e2BasicSalary, e2Bonus);

        e2.addBonus(bonusPercentage, extraReward);

        // Display both employees
        System.out.println("Employee 1");
        e1.displayEmployee();

        System.out.println();

        System.out.println("Employee 2");
        e2.displayEmployee();

        sc.close();
    }
}
