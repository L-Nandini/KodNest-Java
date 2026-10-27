package track.Class_Practice.OOPS.HAS_A_Relation;

class AggregateOS {
    AggregateOS() {
        System.out.println("OS is installed");
    }

    void checkOS() {
        System.out.println("OS is still executing");
    }
}

class AggregateCharger {
    AggregateCharger() {
        System.out.println("Charger is created");
    }

    void getCharger() {
        System.out.println("Charger can be used for charging.");
    }
}

class AggregateMobile {
    AggregateOS o = new AggregateOS();

    AggregateMobile() {
        System.out.println("Mobile is created with OS");
    }

    void hasA(AggregateCharger c) {
        System.out.println("Charger acquired");
    }

}

public class Aggregate1 {
    public static void main(String[] args) {
        AggregateMobile m = new AggregateMobile();
        AggregateCharger c = new AggregateCharger();
        m.hasA(c);
        c.getCharger();
        m = null;
        // m.o.checkOS(); // exception
        c.getCharger();

    }
}
