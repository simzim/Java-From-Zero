package lt.simzim.part_2;

public class Employee extends StaffMember {
    private String socialNumber;
    private double salary;

    public Employee(String _name, String _surname, String _phone, String _socialNumber, double _salary){
        super(_name, _surname, _phone);
        this.socialNumber = _socialNumber;
        this.salary = _salary;
    }

    public String toString(){
        return name + "\t " + surname + ",\t\t " + phone +  ",\t\t " + salary ;
    }

    public double getSalary(){
        return salary;
}
    public double pay(){
        return salary;
    }

}
