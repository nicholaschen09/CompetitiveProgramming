import java.util.*;
import java.io.*;

public class Squares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tiles = scan.nextInt();

        int sideLength = (int) Math.sqrt(tiles);

        System.out.println("The largest square has side length " + sideLength + ".");
    }
}
