import java.util.*;

public class S1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        String flips = scan.nextLine();
        for (int i = 0; i < flips.length(); i++) {
            if (flips.charAt(i) == 'H') {
                int temp = array[0][0];
                array[0][0] = array[1][0];
                array[1][0] = temp;
                temp = array[0][1];
                array[0][1] = array[1][1];
                array[1][1] = temp;
            } else {
                int temp = array[0][0];
                array[0][0] = array[0][1];
                array[0][1] = temp;
                temp = array[1][0];
                array[1][0] = array[1][1];
                array[1][1] = temp;
            }
        }
//        System.out.print(array[0][0] + " ");
//        System.out.println(array[0][1]);
//        System.out.print(array[1][0] + " ");
//        System.out.println(array[1][1]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
