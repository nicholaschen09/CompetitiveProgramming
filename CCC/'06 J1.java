import java.util.*;
import java.io.*;

public class CanadianCalorieCounting {
    public static void main(String[] args) {

        int totalCals = 0;
        Scanner scan = new Scanner(System.in);
        int burger = scan.nextInt();
        int side = scan.nextInt();
        int drink = scan.nextInt();
        int dessert = scan.nextInt();

        if (burger == 1) {
            totalCals += 461;
        }
        if (burger == 2) {
            totalCals += 431;
        }
        if (burger == 3) {
            totalCals += 420;
        }

        if (drink == 1) {
            totalCals += 130;
        }
        if (drink == 2) {
            totalCals += 160;
        }
        if (drink == 3) {
            totalCals += 118;
        }
        if (side == 1) {
            totalCals += 100;
        }
        if (side == 2) {
            totalCals += 57;
        }
        if (side == 3) {
            totalCals += 70;
        }
        if (dessert == 1) {
            totalCals += 167;
        }
        if (dessert == 2) {
            totalCals += 266;
        }
        if (dessert == 3) {
            totalCals += 75;
        }
        System.out.println("Your total Calorie count is " + totalCals + ".");
        }
    }
