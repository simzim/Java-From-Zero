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
     * set  employee's first name
     * @param firstName
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * set  employee's last name
     * @param LastName
     */
    public void setLastName(String LastName){
        this.lastName = lastName;
    }

    /**
     * set  employee's salary
     * @param salary
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    /**
     * convert Employee data to string format (firstName lastName salary)
     *  Override toString method
     * @return string Employee data
     */
    public String toString() {
        return  this.firstName + " \t" + this.lastName + ",\t\t\t salary: " + this.salary;
    }
}
