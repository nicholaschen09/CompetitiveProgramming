import java.io.*;
import java.util.*;

public class J2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int n = scan.nextInt();
        int r = scan.nextInt();
        int newAffected = n;
        int i = 0;
        int totalAffected = 0;
        for (; totalAffected<=p; ++i) {
             totalAffected = newAffected + totalAffected;
             newAffected = newAffected * r;

        }
        System.out.println(i-1);

    }

}
