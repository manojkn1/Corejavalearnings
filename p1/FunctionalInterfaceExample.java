package p1;
@FunctionalInterface
public interface FunctionalInterfaceExample {

    void test1();            // if we use functional interface it can consists of only 1 incomplete method
    default void test2(){     // using default keyword we can create complete methos after jdk 1.8
        System.out.println("using default keyword");
    }
}
