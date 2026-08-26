package track.PracticeSession;

import java.util.Scanner;

public class DailyAttendanceTotal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int classes = scanner.nextInt();
        int days = scanner.nextInt();

        int[][] attendance = new int[classes][days];

        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        int total = 0;

        for (int i = 0; i < days; i++) {
            for (int j = 0; j < classes; j++) {
                total += attendance[j][i];
            }

            System.out.println("Day " + (i + 1) + " total: " + total);
            total = 0;
        }

        scanner.close();
    }
}
