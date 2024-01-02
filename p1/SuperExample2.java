package p1;

public class SuperExample2 extends SuperExample{

    SuperExample2(int x){
        super();    // it will call the matching parent class constructor
    }
    int j=20;
    public static void main(String[] args) {
        SuperExample2 s1= new SuperExample2(100);
        s1.test();
    }
    public void test(){
        System.out.println(super.i);  // used to access the members of parent class with inheritence
        System.out.println(this.j);  // this is used to access the members of same class
        this.test2();
        super.x();
    }
    public void test2(){
        System.out.println("from test 2");
    }
}
