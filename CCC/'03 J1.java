import java.util.*;
import java.io.*;

public class Trident {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int s = scan.nextInt();
        int h = scan.nextInt();
        //prints the "fork" of the trident
        for (int j = 0; j < t; j++) {
            if (j != 0) {
                System.out.println();
            }
            for (int i = 0; i < 3; i++) {
                System.out.print("*");
                if (i != 2)
                    for (int k = 0; k < s; k++) {
                    System.out.print(" ");
                }
            }
        }
        //prints the line connecting the handle and the "fork" of the trident
        if (t!=0)
            System.out.println();
        for (int i = 0; i < (s*2 + 3); i++) {
            System.out.print("*");


                }
        System.out.println();
            //prints the handle
        for (int k = 0; k < h; k++) {
            //positions the handle in the centre of the trident
            for (int i = 0; i < (s+1); i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        scan.close();
    }

}
