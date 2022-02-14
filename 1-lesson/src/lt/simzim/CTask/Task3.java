package lt.simzim.CTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        // 3 task
        Scanner read = new Scanner(new File("data3.txt"));
        int end = read.nextInt();
        System.out.println("Range from " + 100 + " to " + end);
        int total = 0;
        for (int current = 100; current <= end; current++) {
            int n1 = current / 100;
            int n2 = (current % 100) / 10;
            int n3 = current % 10;

            if (current == Math.pow(n1, 3) + Math.pow(n2, 3) + Math.pow(n3, 3)) {
                total++;
                System.out.print(current + ", ");
            }
        }
        System.out.println('\n' + "We found " + total + " Armstrong numbers");

    }
}
