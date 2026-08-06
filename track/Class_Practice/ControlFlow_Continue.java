package track.Class_Practice;

public class ControlFlow_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue; // stops the current iteration and moves to the next iteration
            }
            System.out.println(i);
        }
    }
}
