package track.Class_Practice.OOPS;

class Book1 {
    private int pageNumber; // membered variable / data

    public void setData(int x) { // membered function
        if (x > 0) {
            pageNumber = x;
        }
    }

    public int getData() { // membered function
        return pageNumber;
    }
}

public class EncapDemo2 {
    public static void main(String[] args) {
        Book1 b = new Book1();
        b.setData(-100);
        System.out.println(b.getData());
    }
}
