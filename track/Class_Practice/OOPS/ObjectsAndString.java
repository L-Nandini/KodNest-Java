package track.Class_Practice.OOPS;

class Student {

    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo);
        System.out.println(name);
    }

}

class ObjectsAndString {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Arjun");
        Student s2 = new Student(12, "Raju");
        Student s3 = new Student(11, "Arjun");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2)); // false (because in object class .equals compare adress).

        System.out.println(s1.equals(s3)); // false (because in object class .equals compare adress but in Strings they
                                           // override the quals methods to compare content).
    }
}