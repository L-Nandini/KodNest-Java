package track.Class_Practice.OOPS.super_construct_chaining;

// external calling using super
// global chaining
class Parent {

    Parent(int a) {
        System.out.println("Inside parent 1 param.. constructor");
    }
}

class Child extends Parent {
    Child() {
        super(10); // explicit calling
        System.out.println("Inside child 0 param.. constructor");
    }

}

public class Inheritance_Constructor_Chaining_1 {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.getClass();
    }
}
