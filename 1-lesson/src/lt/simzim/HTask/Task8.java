package lt.simzim.HTask;

import java.util.Scanner;

public class Task8 {
    public static void round(double number, int precision){
        number = number * Math. pow(10, precision) + 0.5;
        int IntValue = (int) number;
        number = (double)IntValue / Math. pow(10, precision);
        System.out.println("Rounded result: " + number);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number and number of decimal places: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        int precision = in.nextInt();
        round(number, precision);
    }
}
