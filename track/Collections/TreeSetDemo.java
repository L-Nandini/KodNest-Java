package track.Collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String args[]) {
        // TreeSet ts = new TreeSet(); // raw set
        TreeSet<Integer> ts = new TreeSet<>(); // generic set
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);

        // headset -> from that element gives all left elements
        System.out.println(ts.headSet(75)); // 75 doesn't include in the list
        System.out.println(ts.headSet(75, true)); // 75 includes in the list

        // tailSet -> from that element gives all right elements
        System.out.println(ts.tailSet(100)); // inlcudes 100
        System.out.println(ts.tailSet(100, false)); // doesn't include 100

        // higher -> gives the next higher element in the list if not present gives null
        System.out.println(ts.higher(100));
        System.out.println(ts.higher(80));
        System.out.println(ts.higher(200));
        System.out.println(ts.higher(0));

        // lower -> gives the next lower element in the list if not ay element gives
        // null
        System.out.println(ts.lower(100));
        System.out.println(ts.lower(30));
        System.out.println(ts.lower(10));

        // ceiling -> if that value present in list gives that value other wise gives
        // the next higher value / null
        System.out.println(ts.ceiling(100));
        System.out.println(ts.ceiling(80));
        System.out.println(ts.ceiling(200));

        // floor -> if that value present in list gives that value other wise gives the
        // next lower value / null
        System.out.println(ts.floor(125));
        System.out.println(ts.floor(70));
        System.out.println(ts.floor(20));
    }
}
