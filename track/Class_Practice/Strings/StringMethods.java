package track.Class_Practice.Strings;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = " ";
        String s3 = "Java";
        String str = "KodNest Technologies";
        System.out.println(str); // KodNest Technologies

        // Inspect
        // length(), // size
        // isEmpty(), // true or false (only letter are considered as string)
        // isBlank() // space also considers as string
        System.out.println(str.length()); // 20
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false
        System.out.println(s1.isEmpty()); // true
        System.out.println(s1.isBlank()); // true
        System.out.println(s2.isEmpty()); // false
        System.out.println(s2.isBlank()); // true
        System.out.println(s3.isEmpty()); // false
        System.out.println(s3.isBlank()); // false

        // str.isBlank();
        // Search contains(),
        // indexOf(), // first occurrence of value
        // startsWith(),
        // endsWith()
        System.out.println(str.contains("Nest")); // true
        System.out.println(str.contains("nest")); // false
        System.out.println(str.indexOf('e')); // 4
        System.out.println(str.indexOf('K')); // 0
        System.out.println(str.indexOf('z')); // -1
        System.out.println(str.startsWith("Kod")); // true
        System.out.println(str.startsWith("Nest")); // false
        System.out.println(str.endsWith("ies")); // true
        System.out.println(str.endsWith("Kod")); // false

        // Extract charAt(),
        System.out.println(str.charAt(4)); // e
        // System.out.println(str.charAt(99)); Exception index out of bounds
        System.out.println(str.substring(2, 6)); // dNes
        System.out.println(str.substring(5)); // t

        // Transform toUpperCase(),
        // toLowerCase(),
        // trim(),
        // replace()
        System.out.println(str.toUpperCase()); // KODNEST TECHNOLOGIES
        System.out.println(str.toLowerCase()); // kodnest technologies
        System.out.println(str.trim()); // KodNest Technologies
        System.out.println(str.replace('e', 'A')); // KodNAst TAchnologiAs
        System.out.println(str.replace("Technologies", "Software Solutions")); // KodNest Software Solutions
        // Join concat()
        System.out.println(str.concat("June Batch")); // KodNest TechnologiesJune Batch

    }
}
