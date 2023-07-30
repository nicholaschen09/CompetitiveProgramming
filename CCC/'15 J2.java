import java.util.Scanner;
public class HappyOrSad {
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       String emoticons = scan.nextLine();
       String happy = ":-)";
       String sad = ":-(";
       int numOfSad = 0;
       int numOfHappy = 0;
       for (int i = 0; i < emoticons.length() - 3; i++) {
           if (emoticons.substring(i, i + 3).equals(happy)) {
               numOfHappy++;
           } else if (emoticons.substring(i, i + 3).equals(sad)) {
               numOfSad++;
           }
       }
       if (numOfSad > numOfHappy ) {
           System.out.println("sad");

       }
        else if (numOfSad < numOfHappy ) {
           System.out.println("happy");

       }
       else if (numOfSad == 0 && numOfHappy == 0 ) {
           System.out.println("none");

       }
       else {
           System.out.println("unsure");
       }
   }
   }
