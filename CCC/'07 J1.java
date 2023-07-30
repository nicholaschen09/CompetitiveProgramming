import java.util.*;
import java.io.*;

public class WhoInTheMiddle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if (x > y && x < z || x > z && x < y) {
            System.out.println(x);
        }
        else if (y > x && y < z || y > z && y < x) {
            System.out.println(y);
        }
        else if(z > x && z < y || z > y && z < x) {
                System.out.println(z);
            }
        }
    }
