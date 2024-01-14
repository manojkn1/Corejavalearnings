package p2;

public class ExeptionExample1 {

    public static void main(String[] args) {

        try {
            int  x=10;
            int y=0;
            int z=x/y;                     // airthmatic exception
            System.out.println("hello ");  // this line will not run
         }catch(Exception e) {
            e.printStackTrace();
        }finally {                           // finally block will run all the time
            System.out.println(" i will run anytime no matter what");
        }

        System.out.println(" hello world"); // this line will run because he handled exception using try catch block

        }

    }

