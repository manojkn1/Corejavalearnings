package p1;

public class GoldAccount extends SilverAcount{    // in overriding inheritence uis mandatory
    @Override
    public void rateOfintrest(){
        System.out.println("7.5%");
    }
    @Override
    public void chqBooks(){
        System.out.println("unlimited");
    }
    public static void main(String[] args) {
        GoldAccount g1= new GoldAccount();
        g1.onlineBanking();
        g1.rateOfintrest();
        g1.chqBooks();
        System.out.println("-------------------");
        SilverAcount s1= new SilverAcount();
        s1.onlineBanking();
        s1.rateOfintrest();
        s1.chqBooks();

    }

}
