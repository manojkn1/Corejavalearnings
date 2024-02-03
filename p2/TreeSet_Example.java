package p2;
import java.util.TreeSet;
public class TreeSet_Example {
    public static void main(String[] args) {

        TreeSet t= new TreeSet(); // duplicates are not allowed insertion order is not preserved however it maintains default sorting order(asc).
        t.add(10);
        t.add(50);
        t.add(20);
        System.out.println(t);
        t.remove(10);
        System.out.println(t);


    }
}
