package track.Class_Practice.OOPS.super_construct_chaining;

class Developer {
    void work() {
        System.out.println("Developer working");
    }

    void project() {
        System.out.println("Developer doing project");
    }
}

class JavaDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("JavaDeveloper working");
    }

    @Override
    void project() {
        System.out.println("JavaDeveloper doing project");
    }
}

class PythonDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("PythonDeveloper working");
    }

    @Override
    void project() {
        System.out.println("PythonDeveloper doing project");
    }
}

public class Upcasting {

    public static void main(String[] args) {
        Developer dev;
        // JavaDeveloper jd = new JavaDeveloper();
        // dev = jd; // upcatsing
        dev = new JavaDeveloper(); // upcasting
        dev.work();
        dev.project();

        // PythonDeveloper pd = new PythonDeveloper();
        // dev = pd; // upcasting
        dev = new PythonDeveloper(); // upcasting
        dev.work();
        dev.project();

    }

}
