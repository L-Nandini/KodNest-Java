package track.Class_Practice.Strings;

public class UpperCaseOrLowerCaseIgnorance {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        if (s1 == s2) {
            System.out.println("Ref are Equal");
        } else {
            System.out.println("Ref are Not-Equal");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Content are Equal");
        } else {
            System.out.println("Content are Not-Equal");
        }
    }
}
