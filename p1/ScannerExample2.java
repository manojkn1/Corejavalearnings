package p1;

import java.util.Scanner;

public class ScannerExample2 {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
      for(int i=0;i<3;i++) {
          System.out.println(" Enter a card number");
          int pinNumber = scan.nextInt();
          if (pinNumber == 1234) {
              System.out.println("welcome");
              break;
          } else {
              System.out.println("In valid pin number");
              if(i==2){
                  System.out.println("your card is blocked");
              }
          }
      }

    }
}
