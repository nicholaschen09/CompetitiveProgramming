import java.util.*;
import java.io.*;

public class AlpacaShapes {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int sideLength = scan.nextInt();
        int radius = scan.nextInt();

        int areaSquare = 0;
        areaSquare = sideLength * sideLength;

        double radiusCircle = 0;
        radiusCircle = 3.14 * (radius * radius);
        if ( areaSquare < radiusCircle) {
            System.out.println("CIRCLE");
        }
        else {
            System.out.println("SQUARE");
        }
    }
}
