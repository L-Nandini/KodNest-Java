package track.Class_Practice.OOPS.super_construct_chaining;

class Parent {
    Parent() {
        System.out.println("Inside parent 0 param.. constructor");
    }

    Parent(int a) {
        System.out.println("Inside parent 1 param.. constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Inside child 0 param.. constructor");
    }

    Child(int a) {
        System.out.println("Inside child 1 param.. constructor");
    }
}

public class Inheritance_Constructor_Chaining {

    public static void main(String[] args) {
        Child c1 = new Child();
        Child c2 = new Child(5);
        c1.getClass();
        c2.getClass();
    }
}