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

public class Polymorphism {
    public static void main(String[] args) {
        Developer jd = new JavaDeveloper();
        accessMethod(jd);

        Developer pd = new PythonDeveloper();
        accessMethod(pd);
    }

    // run time polymorphism the method type was changed based on the parameter
    // passsing
    // once it was javaDevelper type and other time it was Python developer type.
    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
