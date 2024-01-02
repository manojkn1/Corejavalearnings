package p1;

public class Hello implements InterfaceExample1,InterfaceExample2{  // at interface level multiple inheritence in possible

    @Override   // here we re completing the inherited method using overiding concept
    public void test1() {
        System.out.println(" from test 1");

    }

    @Override     // here we re completing the inherited method using overiding concept
    public void test2() {
        System.out.println(" from test 2");

    }

    public static void main(String[] args) {
        Hello a1= new Hello();
        a1.test1();
        a1.test2();

    }
}
