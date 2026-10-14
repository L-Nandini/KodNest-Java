package track.Class_Practice.OOPS.Final;

class Final_Method {
    final void display() {
        System.out.println("Final Method");
    }

    void display2() {
        System.out.println("Normal Method");
    }
}

class Final_Method2 extends Final_Method {
    // mot possible because that method is final.
    // @Override
    // void display() {
    // System.out.println("Normal Method");
    // }

    void display2() {
        System.out.println("Normal Method");
    }
}

public class Method {
    public static void main(String[] args) {
        Final_Method fm = new Final_Method();
        fm.display();
        fm.display2();

        Final_Method2 fm2 = new Final_Method2();
        fm2.display();
        fm2.display2();
    }
}
