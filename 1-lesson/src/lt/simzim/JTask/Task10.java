package lt.simzim.JTask;

import java.io.File;
import java.util.Scanner;

public class Task10 {
    public static void findFile(String path, String fName) {
        File f = new File(path);
        for (String n : f.list()) {
            if (n.equals(fName)) {
                System.out.println("the path where the file is located: " + f);
                System.out.println("the file name: " + n);
            } else {
                File sub = new File(path + n);
                if (sub.isDirectory()) {
                    findFile(path + n + "/", fName);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("The name of the file we are looking for: ");
        Scanner in = new Scanner(System.in);
        String title = in.next();
        String p = "C:/Users/simon/IdeaProjects/";
        findFile(p, title);
        }
    }

