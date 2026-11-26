package track.Collections;

import java.util.HashSet;
import java.util.Objects;

class StudentHashSet extends Object {
    int roll;
    String name;

    StudentHashSet(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        StudentHashSet s = (StudentHashSet) obj;
        return (this.roll == s.roll && this.name == s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    // without this we get the address of the objects
    @Override
    public String toString() {
        return roll + " " + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class ClassWithHashSet {
    public static void main(String[] args) {
        StudentHashSet s1 = new StudentHashSet(11, "Anu");
        StudentHashSet s2 = new StudentHashSet(12, "Ram");
        StudentHashSet s3 = new StudentHashSet(11, "Anu");

        HashSet<StudentHashSet> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
