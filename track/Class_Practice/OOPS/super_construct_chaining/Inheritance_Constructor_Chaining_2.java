package track.Class_Practice.OOPS.super_construct_chaining;

// local chaining
class LocalChainingParent {
    LocalChainingParent() {
        System.out.println("Inside parent 0 param.. constructor");
    }

}

class LocalChainingChild extends LocalChainingParent {
    LocalChainingChild() {
        this(10);
        System.out.println("Inside child 0 param.. constructor");
    }

    LocalChainingChild(int a) {
        this(a, 10);

        System.out.println("Inside child 1 param.. constructor");
    }

    LocalChainingChild(int a, int b) {
        System.out.println("Inside child 2 param.. constructor");
    }

    void disp() {
        System.out.println("inside method");
    }

}

public class Inheritance_Constructor_Chaining_2 {

    public static void main(String[] args) {
        LocalChainingChild c1 = new LocalChainingChild();
        c1.disp();
    }
}