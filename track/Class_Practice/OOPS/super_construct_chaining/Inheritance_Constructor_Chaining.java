package track.Class_Practice.OOPS.super_construct_chaining;

// global chaining by default super() calls it self.. and it should be first call
class ChainingParent {
    ChainingParent() {
        System.out.println("Inside parent 0 param.. constructor");
    }

    ChainingParent(int a) {
        System.out.println("Inside parent 1 param.. constructor");
    }
}

class ChainingChild extends ChainingParent {
    ChainingChild() {
        System.out.println("Inside child 0 param.. constructor");
    }

    ChainingChild(int a) {
        System.out.println("Inside child 1 param.. constructor");
    }
}

public class Inheritance_Constructor_Chaining {

    public static void main(String[] args) {
        ChainingChild c1 = new ChainingChild();
        ChainingChild c2 = new ChainingChild(5);
        c1.getClass();
        c2.getClass();
    }
}