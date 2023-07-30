import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        Map<String, Integer> shuValues = new HashMap<String, Integer>();
        shuValues.put("Poblano", 1500);
        shuValues.put("Mirasol", 6000);
        shuValues.put("Serrano", 15500);
        shuValues.put("Cayenne", 40000);
        shuValues.put("Thai", 75000);
        shuValues.put("Habanero", 125000);

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totalShu = 0;

        for (int i = 0; i < n; i++) {
            String pepperName = input.next();
            totalShu += shuValues.get(pepperName);
        }

        System.out.println(totalShu);
    }
}
