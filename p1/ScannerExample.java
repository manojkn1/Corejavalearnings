package p1;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scan.next();
        System.out.println("your name is:"+name);
        System.out.println("Enter your age");
         int age= scan.nextInt();
        System.out.println("your age is:"+age);
        System.out.println("Are you single");
        boolean result=scan.nextBoolean();
        if(result){
            System.out.println("yes i am single");
        }else{
            System.out.println("no i am engaged");
        }

    }
}
