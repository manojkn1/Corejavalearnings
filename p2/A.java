package p2;

import java.util.Comparator;
import java.util.TreeSet;

public class A implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer I1=(Integer)obj1;
        Integer I2=(Integer)obj2;
        if(I1<I2){
            return +1;
        }
        else if(I1>I2){
            return -1;
        }
        else
            return 0;

    }

    public static void main(String[] args) {
        A a1= new A();
        TreeSet t= new TreeSet(a1);
        t.add(20);
        t.add(10);
        t.add(50);
        System.out.println(t);
    }
}
