package track.M02.T03;

import java.util.Scanner;

public class interactiveLearnerProgressSummaryHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = sc.nextLine();
        int practiceDays = sc.nextInt();

        int total = 0;
        double average;

        for (int i = 0; i < practiceDays; i++) {
            int solvedProblems = sc.nextInt();
            total += solvedProblems;
        }

        average = (double) total / practiceDays;

        String status;

        if (average >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + average);
        System.out.println("Status: " + status);

        sc.close();
    }
}
