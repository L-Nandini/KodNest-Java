package track.Class_Practice;

class StudentThis {

    // Instance variables
    String name;
    int age;
    double height;

    // Parameter variables
    void input(String name, int age, double height) {

        // this.name = instance variable
        // name = parameter variable
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApplicationUsingThis {

    public static void main(String[] args) {

        StudentThis s = new StudentThis();

        s.input("Raja", 18, 5.5);
        s.display();
    }
}
