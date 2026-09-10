package track.Class_Practice.Strings;

public class StringBuilderPgm {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0
        sb.append("Java");
        System.out.println(sb); // Java
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 4
        sb.append(" is a programming Language");
        System.out.println(sb); // Java is a programming Language
        System.out.println(sb.capacity()); // 34
        System.out.println(sb.length()); // 30
        sb.append(" and Object oriented");
        System.out.println(sb); // Java is a programming Language and Object oriented
        System.out.println(sb.capacity()); // 70
        System.out.println(sb.length()); // 50

        StringBuilder sb2 = new StringBuilder("Java");
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb2.length()); // 4
        sb2.append("Programming");
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb2.length()); // 15
    }
}
