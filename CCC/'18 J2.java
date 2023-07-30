import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String yesterday = scan.nextLine();
        String today = scan.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (yesterday.charAt(i) == 'C' && today.charAt(i) == 'C') {
                count++;

            }

        }
        System.out.println(count);
    }
}
