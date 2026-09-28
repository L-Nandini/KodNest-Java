package track.Class_Practice.OOPS;

class Book {
    private int pageNumber;

    public void setData(int x) {
        pageNumber = x;
    }

    public void getData() {
        System.out.println(pageNumber);
    }
}

public class EncapDemo1 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(100);
        b.getData();
    }
}
