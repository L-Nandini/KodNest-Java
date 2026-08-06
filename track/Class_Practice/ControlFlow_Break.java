package track.Class_Practice;

public class ControlFlow_Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // tops the exection and ended the program OR block
            }
            System.out.println(i);
        }
    }
}
