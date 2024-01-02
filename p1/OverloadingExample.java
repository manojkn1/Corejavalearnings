package p1;

public class OverloadingExample {

    public void sendEmail(String str){    // in overloading inheritence is not required
        System.out.println("promotional email");

    }
    public void sendEmail(String str,int id){
        System.out.println("tranctional email");
    }

    public static void main(String[] args) {
        OverloadingExample a1= new OverloadingExample();
        //a1.sendEmail("manojkn@gmail.com");
        a1.sendEmail("ab", 1);
    }
}
