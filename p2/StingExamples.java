package p2;

public class StingExamples {
    public static void main(String[] args) {

        String s=new String ("durga");
        s.concat("software");  // in case of String calss we use concat
        System.out.println(s);     // String objects are immutable(we can't change the content) , if anyone tries to change the object with those chages new object will be created


        StringBuffer sb= new StringBuffer("durga");
        sb.append("software");   // // in case of StringBuffer calss we use append
        System.out.println(sb); //// String objects are mutable(we can change the content) , if anyone tries to change the object on the same object changes will be applied.

        String s1= new String("durga");
        String s2= new String("durga");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println("--------");

        StringBuffer sb1= new StringBuffer("durga");
        StringBuffer sb2= new StringBuffer("durga");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
