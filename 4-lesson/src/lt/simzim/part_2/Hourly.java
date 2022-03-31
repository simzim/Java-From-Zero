package lt.simzim.part_2;

public class Hourly extends Employee {
    private int hoursWorked = 0;

    public Hourly(String _name, String _surname, String _phone, String _socialNumber, double _salary){
        super(_name, _surname, _phone, _socialNumber, _salary);
    }

    public void addHours(int _hours){
        hoursWorked += _hours;
    }
    public double pay(){
        double total = 8 * hoursWorked;
        hoursWorked = 0;
        return total;
    }
}
