package track.Class_Practice;

class StudentConstructor {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void Display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApplication {

    public static void main(String[] args) {
        StudentConstructor s = new StudentConstructor();
        s.input("Raja", 10, 5.0);
        s.Display();

    }

}