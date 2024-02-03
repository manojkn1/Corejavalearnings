package p2;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
              String s=sc.nextLine();

              int j= s.length()-1;
               int size= s.length()-1;

        for(int i = 0; i <=s.length()-1 ; i++) {
            if(s.charAt(i)==s.charAt(j)){
                j--;
                if(i==size){
                    System.out.println("palindrom");

                }
            }else {
                System.out.println(" not a palindrome");
                break;
            }


        }



    }

    }
