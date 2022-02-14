package lt.simzim.FTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws FileNotFoundException {
        // 6 task
        Scanner read = new Scanner(new File("data6.txt"));
        int count = 0;
        double sum = 0.0;
        while (read.hasNext()) {
            int n = read.nextInt();
            sum += n;
            count++;
        }
        read.close();
        int[] allNumbers = new int[count];
        count = 0;

        Scanner read1 = new Scanner(new File("data6.txt"));
        while (read1.hasNext()) {
            allNumbers[count] = read1.nextInt();
            count++;
        }
        Arrays.sort(allNumbers);
        double mean = sum / count;
        double median = (count % 2 != 0) ? allNumbers[count / 2] : ((allNumbers[(count - 1) / 2] + allNumbers[count / 2]) / 2.0);

        System.out.println("Mean : " + mean);
        System.out.println("Median : " + median);
    }
}
