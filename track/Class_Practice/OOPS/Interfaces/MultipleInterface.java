package track.Class_Practice.OOPS.Interfaces;
interface Work {
    void working(); // By default public abstract
}
interface Project {
    void doProject();
}
class Employee implements Work , Project {
    @Override 
    public void working() {
        System.out.println("Employee is working");
    }
    @Override 
    public void doProject() {
        System.out.println("Employee is doing project");
    }
}   
public class MultipleInterface {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.working();
        e.doProject();
    }
}
