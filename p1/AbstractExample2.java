package p1;

public class AbstractExample2 extends AbstractExample {
    @Override
    public void test1() {
        System.out.println(" from test 1");
    }

    public static void main(String[] args) {
        AbstractExample2 a1= new AbstractExample2();
        a1.test1();
        a1.test2();
    }
}
