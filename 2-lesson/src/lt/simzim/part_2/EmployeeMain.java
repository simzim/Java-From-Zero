package lt.simzim.part_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author simzim
 */

public class EmployeeMain {

    /**
     * Calculate average salary of employees
     * @param EmployeeList array of objects of class Employee
     * @return Average salary of employees
     */
    static double getAverage(Employee[] EmployeeList){
        double sum = 0;
        for(int i=0; i<EmployeeList.length; i++ ) {
            sum += EmployeeList[i].getSalary();
        }
        return sum / EmployeeList.length;
    }

    /**
     * Calculate and print data
     * amount of Employies
     * the amount of salary paid by the company
     * amount of Income tax paid
     * amount of other tax paid
     * @param EmployeeList array of objects of class Employee
     */
    static void printInfo(Employee[] EmployeeList){
        System.out.println("Total employees in the company: " + EmployeeList.length);
        double totalSalary = 0;
        double totalTax = 0;
        double totalSodra = 0;
        for(int i=0; i<EmployeeList.length; i++ ) {
            totalSalary += EmployeeList[i].getSalary();
            totalTax += EmployeeList[i].taxGPM();
            totalSodra += EmployeeList[i].taxSodra();
        }
        System.out.println("The amount of salary paid by the company: " + totalSalary);
        System.out.println("Income tax paid: " + totalTax);
        System.out.println("Other tax paid: " + totalSodra);
    }

    /**
     * print array
     * @param EmployeeList array of objects of class Employee
     */
    static void printList(Employee[] EmployeeList){
        for(int i=0; i<EmployeeList.length; i++ ) {
            System.out.println((i+1)+ ". " + EmployeeList[i].getFirstName() + " " + EmployeeList[i].getLastName() + " "+ EmployeeList[i].getSalary());
        }
    }

    /**
     * read data from the data.txt file, create array from objects and print
     * @throws FileNotFoundException
     */
    static void readInfo() throws FileNotFoundException {
        Scanner read = new Scanner(new File("data.txt"));
        int number = read.nextInt();
        Employee[] EmployeeList = new Employee[number];
        for (int i = 0; i < number; i++) {
           String fName = read.next();
           String lName = read.next();
           double money = Double.parseDouble(read.next());
           EmployeeList[i] = new Employee(fName, lName, money);
        }
        printList(EmployeeList);
        printInfo(EmployeeList);
    }

    public static void main(String[] args) throws FileNotFoundException {

        Employee[] EmployeeList = new Employee[3];
        EmployeeList[0] = new Employee("Leopoldas", "Katinauskas", 2500);
        EmployeeList[1] = new Employee("Eglė", "Karalaitė", 2000);
        EmployeeList[2] = new Employee("Tadas", "Blinda", 1000);

        System.out.println("List of Employee in Array EmployeeList");
        System.out.println(Arrays.toString(EmployeeList));
        printList(EmployeeList);
        System.out.println("----------------------------------------------");
        System.out.println("Average of salary :" + getAverage(EmployeeList));
        printInfo(EmployeeList);
        System.out.println("----------------------------------------------");
        System.out.println("read data from the data.txt file");
        readInfo();

    }
}
