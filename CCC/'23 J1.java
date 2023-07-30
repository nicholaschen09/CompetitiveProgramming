import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int f = 0;
        int p = scan.nextInt();
        int c = scan.nextInt();
        if (p > c) {
            f += 500;
        }
        f += (p * 50) + (c * -10);
        System.out.println(f);
    }




}
