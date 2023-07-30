import java.util.*;
import java.io.*;
public class smileSimilies {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int numOfAdjectives = scan.nextInt();
        int numOfNouns = scan.nextInt();
        String[] adjectives = new String[numOfAdjectives+1];
        String[] nouns = new String[numOfNouns];

        for (int i = 0; i < numOfAdjectives+1; i++) {
            adjectives[i] = scan.nextLine();
        }

            for (int j = 0; j < numOfNouns; j++) {
                nouns[j] = scan.nextLine();
            }
                for (int k = 1; k < numOfAdjectives+1; k++) {
                    for (int p = 0; p < numOfNouns; p++) {
                        System.out.println(adjectives[k] + " as " + nouns[p]);
                    }
                }


            }
        }
