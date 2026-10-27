package track.Class_Practice.OOPS.HAS_A_Relation;

class Heart {
    Heart() {
        System.out.println("Heart is created");
    }

    void pumpHeart() {
        System.out.println("Heart is pumping blood");
    }
}

class Person {
    Heart h = new Heart();

    Person() {
        System.out.println("Person is created");
    }
}

public class CompisitePersonAlive {
    public static void main(String[] args) {
        Person p = new Person();
        p.h.pumpHeart();
    }
}