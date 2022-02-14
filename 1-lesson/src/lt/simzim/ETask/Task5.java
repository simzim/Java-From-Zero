package lt.simzim.ETask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        // 5 task

        Scanner read = new Scanner(new File("data5.txt"));
        int count = 0;
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n0;
        n1 = n2 = n3 = n4 = n5 = n6 = n7 = n8 = n9 = n0 = 0;
        while (read.hasNext()) {
            int n = read.nextInt();
            count++;
            switch (n) {
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
                case 6:
                    n6++;
                    break;
                case 7:
                    n7++;
                    break;
                case 8:
                    n8++;
                    break;
                case 9:
                    n9++;
                    break;
                case 0:
                    n0++;
                    break;
            }
        }
        System.out.println("Ones: " + n1);
        System.out.println("Twos: " + n2);
        System.out.println("Threes: " + n3);
        System.out.println("Fours: " + n4);
        System.out.println("Fives: " + n5);
        System.out.println("Sixes: " + n6);
        System.out.println("Sevens: " + n7);
        System.out.println("Eights: " + n8);
        System.out.println("Nines: " + n9);
        System.out.println("Zeros: " + n0);
        System.out.println("The total number of digits in the file : " + count);
    }
}
