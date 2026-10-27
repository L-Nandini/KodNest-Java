package track.Class_Practice.OOPS.HAS_A_Relation;

class OsLive {
    OsLive() {
        System.out.println("OS created");
    }

    void checkOs() {
        System.out.println("OS is still creating...");
    }
}

class MobileLive {
    OsLive o = new OsLive();

    MobileLive() {
        System.out.println("Mobile created with OS");
    }
}

public class CompositeMainObjectALive {
    public static void main(String[] args) {
        MobileLive m = new MobileLive();
        m.o.checkOs();
    }
}
