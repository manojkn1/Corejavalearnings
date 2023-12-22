package p1;

public class ThisExample1 {
      int i=10;
    public static void main(String[] args) {
        ThisExample1 a1= new ThisExample1();
        System.out.println(a1);
        a1.test();
    }
    public void test(){
        System.out.println(this.i);  // here insted of a1 we can use this; it holds the current object running address
        System.out.println(this);
        this.test2();                //here insted of a1 we can use this
    }
    public void test2(){
        System.out.println();
        ThisExample1 a2= new ThisExample1();
        System.out.println(a2);

    }
}
