package p1;

public class ConstExample {
// constructor example with overloading
    ConstExample(){
        System.out.println(" const with zero args");
    }

    ConstExample(int i,int j){    // const with 2 args of same type
        System.out.println(i);
        System.out.println(j);
    }

    ConstExample(char c,int j){    // const with 2 args of diffrent type
        System.out.println(c);
        System.out.println(j);
    }


    public static void main(String[] args) {

        ConstExample c1=new  ConstExample();
        ConstExample c2=new  ConstExample(100,200);
        ConstExample c3=new  ConstExample('A',300);
        System.out.println(" main method statement");
    }
}
