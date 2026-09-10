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

        sb2.insert(0, "Python ");
        System.out.println(sb2); // Python JavaProgramming
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb2.length()); // 15

        sb2.delete(0, 7);
        System.out.println(sb2); // JavaProgramming
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb2.length()); // 15

        sb2.deleteCharAt(0);
        System.out.println(sb2); // avaProgramming
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb2.length()); // 14

        sb2.replace(0, 4, "Hi");
        System.out.println(sb2); // Hi Programming
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb2.length()); // 14

        sb2.reverse();
        System.out.println(sb2); // grammatP iH
        System.out.println(sb2.capacity()); // 100
        System.out.println(sb2.length()); // 14

        String s = sb2.toString();
        // String s = String.valueOf(sb2); // same as toString
        System.out.println(s); // grammatP iH
        System.out.println(s.getClass()); // class java.lang.String

    }
}
