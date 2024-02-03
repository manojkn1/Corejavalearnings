package p2;

import java.util.HashSet;

public class HashSet_Examples {
    public static void main(String[] args) {

        HashSet h= new HashSet();   // default capacity is 16 with load ratio 0.75
        h.add("m");  // hash set duplicates not allowed and doesn't maintain insertion order
        h.add("j");
        h.add("R");
        h.add(null);   // null insertion possible only once
        h.add(10);
        System.out.println(h.add("m"));  // returns false bcz it is duplicate
        System.out.println(h);


    }
}
