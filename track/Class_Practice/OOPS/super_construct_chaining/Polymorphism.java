package track.Class_Practice.OOPS.super_construct_chaining;

class PolyDeveloper {
    void work() {
        System.out.println("Developer working");
    }

    void project() {
        System.out.println("Developer doing project");
    }
}

class PolyJavaDeveloper extends PolyDeveloper {
    @Override
    void work() {
        System.out.println("JavaDeveloper working");
    }

    @Override
    void project() {
        System.out.println("JavaDeveloper doing project");
    }
}

class PolyPythonDeveloper extends PolyDeveloper {
    @Override
    void work() {
        System.out.println("PythonDeveloper working");
    }

    @Override
    void project() {
        System.out.println("PythonDeveloper doing project");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        PolyJavaDeveloper jd = new PolyJavaDeveloper();
        accessMethod(jd);

        PolyPythonDeveloper pd = new PolyPythonDeveloper();
        accessMethod(pd);
    }

    // run time polymorphism the method type was changed based on the parameter
    // passsing
    // once it was javaDevelper type and other time it was Python developer type.
    public static void accessMethod(PolyDeveloper dev) {
        dev.work();
        dev.project();
    }
}
