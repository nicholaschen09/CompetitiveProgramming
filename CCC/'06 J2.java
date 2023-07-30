import java.util.*;
import java.io.*;

public class RollTheDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int numOfWays = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                if (j + i == 10) {
                    numOfWays += 1;
                }
            }

        }
        if (numOfWays == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        }
        else {
            System.out.println("There are " + numOfWays + " ways to get the sum 10.");
        }
    }
}
