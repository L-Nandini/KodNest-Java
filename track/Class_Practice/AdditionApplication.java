package track.Class_Practice;

class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    double add(int a, int b, double c) {
        return a + b + c;
    }
}

public class AdditionApplication {

    public static void main(String[] args) {

        Addition ad = new Addition();

        System.out.println(ad.add(10, 20));
        System.out.println(ad.add(10.5, 20.5));
        System.out.println(ad.add(10, 20.5));
        System.out.println(ad.add(10.5, 20));

        System.out.println(ad.add(10, 20, 30));
        System.out.println(ad.add(10.5, 20.5, 30.5));
        System.out.println(ad.add(10, 20, 30.5));
    }
}
