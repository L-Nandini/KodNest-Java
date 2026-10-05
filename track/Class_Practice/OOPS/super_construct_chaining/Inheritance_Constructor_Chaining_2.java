package track.Class_Practice.OOPS.super_construct_chaining;

// local chaining
class Parent {
    Parent() {
        System.out.println("Inside parent 0 param.. constructor");
    }

}

class Child extends Parent {
    Child() {
        this(10);
        System.out.println("Inside child 0 param.. constructor");
    }

    Child(int a) {
        this(a, 10);

        System.out.println("Inside child 1 param.. constructor");
    }

    Child(int a, int b) {
        System.out.println("Inside child 2 param.. constructor");
    }

}

// o/p:
// Inside parent 0 param.. constructor
// Inside child 2 param.. constructor
// Inside child 1 param.. constructor
// Inside child 0 param.. constructor
// but here due to compiler ssue we aren't getting correct o/p.

public class Inheritance_Constructor_Chaining_2 {

    public static void main(String[] args) {
        Child c1 = new Child();
    }
}