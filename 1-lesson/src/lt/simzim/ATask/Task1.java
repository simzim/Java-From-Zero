package lt.simzim.ATask;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1 task
        System.out.println("Enter the three sides of the triangle: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // check triangle is valid or not
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("You added: " + a + ", " + b + ", " + c);
            // calculations according to Heron's
            // p - semi-perimeter
            double p = (a + b + c) / 2.0;
            double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("The area of a triangle: " + result);
        } else {
            System.out.println("Triangle invalid");
        }
    }
}
