package track.PracticeSession;

// import java.util.Scanner;

class Conductor {
    void collect(Money m) {
        System.out.println("Money collected by Conductor");
        System.out.println("The amount is : " + m.amount);
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;
    }

}

class Money {

    int amount;

    Money(int amount) {
        this.amount = amount;
    }
}

class Ticket {

}

public class Passenger {
    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money(50);
        Ticket t = c.give();
        c.collect(m);
        System.out.println(t);
        if (t != null) {
            System.out.println("Enjoy the journey");
        } else {
            System.out.println("Please buy ticket");
        }
    }
}
