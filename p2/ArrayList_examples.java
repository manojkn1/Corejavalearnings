package p2;

import java.util.*;

public class ArrayList_examples {

    public static void main(String[] args) {
        ArrayList a= new ArrayList<String>();

        a.add("manoj");  // Arraylist maintains insertion order and can contains duplicate elements
        a.add(30);
        a.add("manoj");
        a.add(null);
        System.out.println(a);
        a.remove("manoj");
        a.add(0,40);
        System.out.println(a);
        System.out.println(a.contains(40));
        System.out.println(a.get(2));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        a.set(1,"mann");  // to replace with new value
        System.out.println(a);
        System.out.println("------");


        ArrayList<String> b= new ArrayList<String>();
        b.add("manoj");
        b.add(1,"manu");
        b.remove(1);
        System.out.println(b);
        b.clear();

        System.out.println("---");

        ArrayList v= new ArrayList();
        v.add(20);
        v.add(10);
        v.add(50);
        Collections.sort(v);
        System.out.println(v);
       int index= Collections.binarySearch(v,10);
        System.out.println(v.get(index));

        System.out.println("-----");

        Iterator itr=v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }







    }
}
