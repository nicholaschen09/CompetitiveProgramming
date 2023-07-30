import java.util.*;
import java.io.*;

public class TermsOfOffice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        for (int i = x; i <= y; i+=60) {
                System.out.println("All positions change in year " + i);
            }
        }
    }
