import java.util.*;

public class CrazyFencing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = 0;
        int n = scan.nextInt();
        int[] base = new int[n+1];
        int[] height = new int[n];

        for (int i = 0; i < base.length; i++) {
            base[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            height[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            area += ((base[i] + base[i+1]) * height[i] / 2.0);
        }
        System.out.println(area);

    }


}
