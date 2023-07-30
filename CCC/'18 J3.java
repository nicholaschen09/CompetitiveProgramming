import java.util.*;
import java.io.*;

public class AreWeThereYet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a[] = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = scan.nextInt();
        }
            int distance10 = 0;
            int distance11 = a[0];
            int distance12 = a[0] + a[1];
            int distance13 = a[0] + a[1] + a[2];
            int distance14 = a[0] + a[1] + a[2] + a[3];

            int distance20 = a[0];
            int distance21 = a[0] - a[0];
            int distance22 = a[1];
            int distance23 = a[1] + a[2];
            int distance24 = a[1] + a[2] + a[3];

            int distance30 = a[1] + a[0];
            int distance31 = a[1];
            int distance32 = a[1] - a[1];
            int distance33 = a[2];
            int distance34 = a[2] + a[3];

            int distance40 = a[0] + a[1] + a[2];
            int distance41 = a[1] + a[2];
            int distance42 = a[2];
            int distance43 = a[2] - a[2];
            int distance44 = a[3];

            int distance50 = a[0] + a[1] + a[2] + a[3];
            int distance51 = a[1] + a[2] + a[3];
            int distance52 = a[2] + a[3];
            int distance53 = a[3];
            int distance54 = a[3] - a[3];

            System.out.println(distance10 + " " + distance11 + " " + distance12 + " " + distance13 + " " + distance14 );
            System.out.println(distance20 + " " + distance21 + " " + distance22 + " " + distance23 + " " + distance24 );
            System.out.println(distance30 + " " + distance31 + " " + distance32 + " " + distance33 + " " + distance34 );
            System.out.println(distance40 + " " + distance41 + " " + distance42 + " " + distance43 + " " + distance44 );
            System.out.println(distance50 + " " + distance51 + " " + distance52 + " " + distance53 + " " + distance54 );

    }
}
