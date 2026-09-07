package track.Class_Practice.Strings;

public class String_pgm1_with_new {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        if (s1 == s2) {
            System.out.println("Ref are Equal");
        } else {
            System.out.println("Ref are Not-Equal");
        }
        if (s1.equals(s2)) {
            System.out.println("Content are Equal");
        } else {
            System.out.println("Content are Not-Equal");
        }
    }
}
