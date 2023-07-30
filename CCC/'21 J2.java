import java.util.*;
import java.io.*;

public class SilentAuction {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int numOfBids = scan.nextInt();
            scan.nextLine();
            String[] name = new String[numOfBids];
            int[] bidCount = new int[numOfBids];
            for (int i = 0; i < numOfBids; i++) {
                name[i] = scan.nextLine();
                bidCount[i] = scan.nextInt();
                scan.nextLine();

            }

            int highestBid = 0;
            String winnerName = "";
            for (int j = 0; j < numOfBids; j++) {
                if (bidCount[j] > highestBid) {
                    highestBid = bidCount[j];
                    winnerName = name[j];
                }
            }
            System.out.println(winnerName);
            scan.close();
        }

    }
