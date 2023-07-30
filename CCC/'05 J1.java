import java.util.*;
import java.io.*;

public class TheCellSell {

    public static void main(String[] args) {
        double daytimeCostA = 0.0;
        double daytimeCostB = 0.0;
        Scanner scan = new Scanner(System.in);
        int daytime = scan.nextInt();
        int evening = scan.nextInt();
        int weekend = scan.nextInt();
        if (daytime > 100) {
            daytimeCostA = (daytime - 100) * 0.25;
        } else {
            daytimeCostA = 0.0;
        }
        double eveningCostA = evening * 0.15;
        double weekendCostA = weekend * 0.20;

        double totalA = daytimeCostA + eveningCostA + weekendCostA;
        if (daytime > 250) {
            daytimeCostB = (daytime - 250) * 0.45;
        } else {
            daytimeCostB = 0.0;
        }

        double eveningCostB = evening * 0.35;
        double weekendCostB = weekend * 0.25;

        double totalB = daytimeCostB + eveningCostB + weekendCostB;
        double A = Math.round(totalA * 100.0) / 100.0;
        double B = Math.round(totalB * 100.0) / 100.0;

        String newA = Double.toString(A);
        String newB = Double.toString(B);

        if (newA.substring(newA.indexOf(".")).length() == 2) {
            newA = newA + "0";

        }
        if (newB.substring(newB.indexOf(".")).length() == 2) {
            newB = newB + "0";
        }

        System.out.println("Plan A costs " + newA);
        System.out.println("Plan B costs " + newB);

        if (A > B) {
            System.out.println("Plan B is cheapest.");
        } else if (A == B) {
            System.out.println("Plan A and B are the same price.");
        } else {
            System.out.println("Plan A is cheapest.");
        }
    }
}
