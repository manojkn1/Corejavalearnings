package p1;

public class Bchildclass extends Aparentclass {  // here extend keyword inherit the members of Aparentclass.
    int j=20;
    public static void main(String[] args) {
        Bchildclass b1= new Bchildclass();
        System.out.println(b1.j);
        System.out.println(b1.i);
        b1.test1();

    }
}
