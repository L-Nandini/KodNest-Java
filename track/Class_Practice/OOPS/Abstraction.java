package track.Class_Practice.OOPS;

abstract class AbstractParent {
    abstract void display1();
    abstract void display2();
}
class AbstractChild1 extends AbstractParent{
    @Override 
    void display1() {
        System.out.println("Inside Child1 display1");
    }
    @Override 
     void display2() {
        System.out.println("Inside Child1 display2");
    }
}
class AbstractChild2 extends AbstractParent {
    @Override 
    void display1() {
        System.out.println("Inside Child2 display1");
    }
    @Override 
     void display2() {
        System.out.println("Inside Child2 display2");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        AbstractChild1 c1 = new AbstractChild1();
        AbstractChild2 c2 = new AbstractChild2();
        accessMethod(c1);
        accessMethod(c2);
    }
    static void accessMethod(AbstractParent ref) {
        ref.display1();
        ref.display2();
    }
}
