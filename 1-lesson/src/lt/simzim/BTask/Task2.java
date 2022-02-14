package lt.simzim.BTask;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2 task
        System.out.print("Enter Year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - is a leap year");
        } else
            System.out.println( year + " - is not leap year");
    }
}
