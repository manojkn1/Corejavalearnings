package p2;

public class Example_program {

    Example_program(int q){
        System.out.println(" first constructor will be printed");

    }
    int i=10;
    int j=20;
    static int s=30;
    static int p=40;

    public static void main(String[] args) {
        Example_program e= new Example_program(10);
        System.out.println(e.i);
        System.out.println(e.j);
        System.out.println(Example_program.s);
        System.out.println(Example_program.p);
        e.test1();
         test3();

    }
    public void test1(){
        System.out.println("from test 1");
        //Example_program e2= new Example_program(20);
        this.test2();
    }
    public  void test2(){
        System.out.println("from test 2");
    }
    public  static void test3(){
        System.out.println("from test 3");
    }
}
