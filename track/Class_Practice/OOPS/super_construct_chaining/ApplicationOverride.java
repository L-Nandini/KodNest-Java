package track.Class_Practice.OOPS.super_construct_chaining;

class Parent{
    void disp1(){
        System.out.println("Inside parent disp 1");
    }
    void disp2(){
        System.out.println("Inside parent disp 2");
    }
}

class Child extends Parent{
    @Override
    void disp2(){
        System.out.println("inside child disp 2");
    }

    void disp3(){
        System.out.println("inside child disp 3");
    }
}

public class ApplicationOverride{
    
    public static void main(String[] args) {
        Parent p=new Parent();
        p.disp2();
        Child c=new Child();
        c.disp2();
        
    }
}