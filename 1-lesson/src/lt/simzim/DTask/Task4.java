package lt.simzim.DTask;
import java.util.Scanner;

public class Task4 {
    public static void EvenOddDigits(int number){
        int even = 0;
        int odd = 0;
        while (number != 0) {
            int n = number % 10;
            if (n % 2 == 0)
                even++;
            else
                odd++;
            number /= 10;
        }
        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
    public static void main(String[] args) {
        // 4 task
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("You added number: " + number);
        EvenOddDigits(number);
    }
}
