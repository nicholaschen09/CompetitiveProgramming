import java.util.Scanner;

public class WhichAlien {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numAntennae = scan.nextInt();
        int numEyes = scan.nextInt();

        if (numAntennae >= 3 && numEyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (numAntennae <= 6 && numEyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (numAntennae <= 2 && numEyes <= 3) {
            System.out.println("GraemeMercurian");
        }
    }

}
