package lt.simzim.GTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner read = new Scanner(new File("data7.txt"));
        int subjects = read.nextInt();
        int students = read.nextInt();
        int[][] marks = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = read.nextInt();
            }
        }

        double allgroup = 0;
        double mean = 0;
        int bestStudent = 0;
        double bestMean = 0;
        int[] badStudents = new int[students];

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                sum += marks[i][j];
                if (marks[i][j] < 5) {
                    badStudents[i]++;
                }
            }
            mean = (double) sum / subjects;
            if (bestMean < mean) {
                bestMean = mean;
                bestStudent = i + 1;
            }
            System.out.println(i + 1 + " students - the mean of marks: " + mean);
            allgroup += mean;
        }
        System.out.println("All Group - the mean of marks: " + (allgroup / students));
        System.out.println("Best student No: " + bestStudent);
        System.out.print("Bed students No: ");
        for (int i = 0; i < badStudents.length; i++) {
            if (badStudents[i] != 0)
                System.out.print(i + 1 + ", ");
        }
    }
}
