import java.util.Scanner;
public class BasketballGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char bananas = 'B';
        char apples = 'A';
        char tie = 'T';
       int threepointA = scan.nextInt();
       int twopointA = scan.nextInt();
       int onepointA = scan.nextInt();
       int threepointB = scan.nextInt();
       int twopointB = scan.nextInt();
       int onepointB = scan.nextInt();
        int totalA =  threepointA*3 + twopointA*2 + onepointA;
        int totalB = threepointB*3 + twopointB*2 + onepointB;
        if (totalA > totalB) {
            System.out.println('A');
        }
        else if (totalA < totalB) {
            System.out.println('B');
        }
        else {
            System.out.println('T');
        }
    }
}
