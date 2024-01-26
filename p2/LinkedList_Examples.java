package p2;

import java.util.LinkedList;

public class LinkedList_Examples {
    public static void main(String[] args) {

        LinkedList l= new LinkedList();
        l.add(10);
        l.add("durga");
        l.add("durga");
        l.add(null);
        System.out.println(l);
        l.addFirst("manu");
        l.removeLast();
        System.out.println(l);
    }
}

