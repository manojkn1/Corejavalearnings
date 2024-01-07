package p1;

public interface InterfaceExample1 {

    public abstract void test1();

}
interface InterfaceExample2{
    public void test2();

}

interface A{
     default void test3(){   //default keyword helps us to build complete method after jdk 1.8
        System.out.println(" from test3 that contain default keyword");
    }
}


