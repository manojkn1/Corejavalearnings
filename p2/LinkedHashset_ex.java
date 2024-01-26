package p2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset_ex {

    public static void main(String[] args) {

        LinkedHashSet h= new LinkedHashSet();   // default capacity is 16 with load ratio 0.75
        h.add("m");  // LinkedHashset duplicates not allowed but maintains insertion order
        h.add("j");
        h.add("R");
        h.add(null);   // null insertion possible only once
        h.add(10);
        System.out.println(h.add("m"));  // returns false bcz it is duplicate
        System.out.println(h);

    }
}

