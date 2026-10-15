package track.Class_Practice.OOPS.Interfaces;

interface Shape {
public abstract void input();
public abstract void disp();
}
class Square implements Shape { // class implements the interface and Promises to provide body for the abstract method
@Override
public void input() { // public must and should be there
    System.out.println("Input");
}
@Override 
public void disp() {
    System.out.println("Disp");
}
}
public class Interface1 {
    public static void main(String[] args) {
        Square s = new Square(); // Object 
        s.input();
        s.disp();
     //   Shape ref = new Shape(); // error we cant create objects.
        Shape ref; // reference
        ref = s;
        ref.input();
        ref.disp();
    }
}
