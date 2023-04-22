import java.util.*;
import java.io.*;
public class CyclicShifts {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String string = scan.nextLine();
        boolean in = false;

        for (int i = 0; i < string.length() && !in; i++) {
            if (text.contains(string)) {
                in = true;
                System.out.println("yes");
            } else {
                string = string.substring(1) + string.charAt(0);
            }

        }
        if (!in) {
            System.out.println("no");
        }
    }
}
