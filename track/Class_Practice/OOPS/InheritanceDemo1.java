package track.Class_Practice.OOPS;

class Demo1 {
    int a = 10;

    void disp() {
        System.out.println("Parent class Method");
    }
}

class Demo2 extends Demo1 {

}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.disp();
        System.out.println(d2.a);
    }
}