package p2;

import java.util.Scanner;

public class BiggestWord {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
         String s1= sc.nextLine();

        String[] s2=s1.split(" ");
        String temp=null;
        if(s2[0].length()>s2[1].length()){
           temp=s2[0];
        }
        if(s2[1].length()>s2[0].length()){
            temp=s2[1];
        }
        if(temp!=null){
            System.out.println("biggest word is :"+temp);
        }else {
            System.out.println(" too may big words");
        }


    }
}
