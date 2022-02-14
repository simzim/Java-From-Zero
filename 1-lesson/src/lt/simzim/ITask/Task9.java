package lt.simzim.ITask;

import java.util.Scanner;

public class Task9 {
    public static void numberRevers(int number) {
        if (number < 10) {
            System.out.print(number);
            return;
        } else {
            System.out.print(number % 10);
            numberRevers(number / 10);
        }
    }
    public static void main(String[] args) {
        // 9 task
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Reverse of the number: ");
        numberRevers(number);
    }
}
