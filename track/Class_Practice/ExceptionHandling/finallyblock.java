package track.Class_Practice.ExceptionHandling;

class finallyblock {
    public static void main(String[] args) {
        try {
            int value = 10 / 0;
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } finally {
            System.out.println("Calculation attempt finished");
        }

        System.out.println("Program continues");
    }
}
