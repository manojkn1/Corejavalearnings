package p1;

public class ThisExample2 {

    ThisExample2(){
        this(500);   // this() can be used to suppy value to constructor & this() should be used in first statement and cannot be used inside a methods
    }
    ThisExample2(int i){    
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisExample2 a1= new ThisExample2();
    }
}
