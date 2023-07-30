import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        scan.nextLine();
        String[] output = new String[l];
        for (int i = 0; i < l; i++) {
            String line = scan.nextLine();
            String[] splitLine = line.split(" ");
            int n = Integer.parseInt(splitLine[0]);
            String x = splitLine[1];
            output[i] = "";
            for (int j = 0; j < n; j++) {
                output[i] = output[i] + x;
            }

        }
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);

        }
    }


}
