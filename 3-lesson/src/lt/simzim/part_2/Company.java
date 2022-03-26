package lt.simzim.part_2;
import java.util.ArrayList;

public class Company extends Employee{
    private String companyName;
    private String companyCode;
    ArrayList<Employee> EmployeeList=new ArrayList<Employee>();


    public Company(String companyName, String companyCode){
        this.companyName = companyName;
        this.companyCode = companyCode;
    }

    public String getCompanyName(){
        return companyName;
    }
    public String getCompanyCode(){
        return companyCode;
    }

    /**
     * Add Employee object to Array list
     * @param x Class's Employee object
     */
    public void addEmployee(Employee x){
        EmployeeList.add(x);
    }
    /**
     * Remove Employee object from Array list
     * @param x Class's Employee object
     */
    public void deleteEmployee(Employee x){
        EmployeeList.remove(x);
    }
    public String toString() {
        return """
                --- Company starts work ---
                --- Company Name: """ + companyName + """
                \n--- Company Code: """ + companyCode + """
                \n--- Employee number: """ + EmployeeList.size() + """
                \n-------------------------
                """;
    }
}
