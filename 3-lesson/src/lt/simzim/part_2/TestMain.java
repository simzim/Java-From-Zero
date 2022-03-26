package lt.simzim.part_2;

import java.util.Scanner;
import static java.lang.System.exit;

public class TestMain {

//Function to print menu
    public static void printMenu(String[] options){
        System.out.println("---------------------");
        for (String option : options){
            System.out.println(option);
        }
        System.out.println("---------------------");
        System.out.print("Choose your option : ");
    }



    public static void main(String[] args) {
        String[] options = {
                "1- Company details",
                "2- Hire an employee",
                "3- Dismiss an employee",
                "4- Detailed information about the Company",
                "5- Exit",
        };
        int num = 1;
        System.out.print("Enter the Company name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print("Enter the Company code: ");
        String code = in.nextLine();

//      Create Company object
        Company firm = new Company(name, code);
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=5){
//          Print Menu
            printMenu(options);
            try {
                option = scanner.nextInt();
                System.out.println("---------------------");
                switch (option){
                    case 1:
                        System.out.println(firm);
                        break;
                    case 2:
                        System.out.print("Enter the Employee First name: ");
                        String fname = in.next();
                        System.out.print("Enter the Employee Last name: ");
                        String lname = in.next();
                        System.out.print("Enter the Employee Last Salary: ");
                        double money = in.nextDouble();
                        Employee p1 = new Employee(fname, lname, money);
                        firm.EmployeeList.add(p1);
                        break;
                    case 3:
                        System.out.print("Enter the name of the employee who is leaving: ");
                        name = in.next();
                        int count = 0;
                        for (Employee emp : firm.EmployeeList) {
                            if (emp.getFirstName().equals(name) ) {
                                System.out.print(emp.getFirstName() + " is leaving our Company\n");
                                firm.EmployeeList.remove(count);
                                break;
                            }
                            count++;
                        }
                        break;
                    case 4:
                        System.out.println(firm);
                        for (Employee emp : firm.EmployeeList) {
                            System.out.println(emp);
                        }
                        break;
                    case 5:
                        System.out.println("exit pasirinkimas");
                        exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }
}
