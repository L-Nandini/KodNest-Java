package track.PracticeSession;

public class GCD {
    public static void main(String[] args) {
        int a = 16;
        int b = 10;
        while (b > 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        System.out.println(a);

        // brute force
        // int n = (a < b) ? a : b;
        // for (int i = n; i >= 1; i--) {
        // if (a % i == 0 && b % i == 0) {
        // System.out.println(i);
        // break;
        // }
        // }
    }
}
