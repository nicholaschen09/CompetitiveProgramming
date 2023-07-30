import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double x = scan.nextDouble();

        double bmi = n / (x * x);
        if (bmi > 25) {
            System.out.println("Overweight");
        }
        else if (bmi > 18.5 && bmi < 25.0 ) {
            System.out.println("Normal weight");
        }
        else {
            System.out.println("Underweight");
        }

    }
}
