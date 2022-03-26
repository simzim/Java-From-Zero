package lt.simzim.part_2;

/**
 * @author simzim
 */
public class Employee {
    private String lastName;
    private String firstName;
    private Double salary;

    Employee(){}

    Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     * get employee's last name
     * @return employee's last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * get employee's first name
     * @return employee's first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * get employee's salary
     * @return employee's salary
     */
    public double getSalary(){
        return salary;
    }

    /**
     * calculate tax from salary
     * the amount of tax 15%
     * @return tax from employee's salary
     */
    public double taxGPM(){
        return salary * 0.15;
    }
    /**
     * calculate tax from salary
     * the amount of tax 9%
     * @return tax from employee's salary
     */
    public double taxSodra(){
        return salary * 0.09;
    }

    /**
     * convert Employee data to string format (firstName lastName salary)
     *  Override toString method
     * @return string Employee data
     */
    public String toString() {
        String out = "";
        out = firstName + " " + lastName + " " + salary;
        return out;
    }
}
