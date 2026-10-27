package track.Class_Practice.OOPS.HAS_A_Relation;

class OsDie {
    OsDie() {
        System.out.println("OS created");
    }

    void checkOs() {
        System.out.println("OS is still creating...");
    }
}

class MobileDie {
    OsDie o = new OsDie();

    MobileDie() {
        System.out.println("Mobile created with OS");
    }
}

public class CompositeMainObjectDie {
    public static void main(String[] args) {
        MobileDie m = new MobileDie();
        m.o.checkOs();
        m = null;
        // m.o.checkOs(); // we will get null pointer exception.
    }
}
