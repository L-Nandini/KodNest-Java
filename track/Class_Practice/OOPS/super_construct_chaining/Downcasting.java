package track.Class_Practice.OOPS.super_construct_chaining;

class DowncastParent {
    void display1() {
        System.out.println("Inside parent's display1");
    }

    void display2() {
        System.out.println("Inside parent's display2");
    }
}

class DowncastChild1 extends DowncastParent {
    @Override
    void display2() {
        System.out.println("Inside child1's display2");
    }

    void display3() {
        System.out.println("Inside child1's display3");
    }
}

class DowncastChild2 extends DowncastParent {
    @Override
    void display2() {
        System.out.println("Inside child2's display2");
    }

    void display3() {
        System.out.println("Inside child2's display3");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        DowncastParent p = new DowncastChild1(); // Upcasting
        p.display1();
        p.display2();

        ((DowncastChild1) p).display3(); // Downcasting
    }
}
