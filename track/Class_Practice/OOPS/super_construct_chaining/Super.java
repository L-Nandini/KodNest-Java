package track.Class_Practice.OOPS.super_construct_chaining;

class SuperParent {
    int a = 10;

    void disp() {
        System.out.println("Parent's a: " + a);
    }
}

class SuperChild extends SuperParent {
    int a = 20;

    void disp2() {
        System.out.println("Child's a: " + a);
        System.out.println("Parent's a using super: " + super.a);
    }

}

class Super {

    public static void main(String[] args) {
        SuperChild c = new SuperChild();
        c.disp2();
    }
}