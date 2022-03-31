package lt.simzim.part_2;

public class Executive extends Employee{

    private double bonus = 0;

    public Executive(String _name, String _surname, String _phone, String _socialNumber, double _salary){
        super(_name, _surname, _phone, _socialNumber, _salary);
    }

    public void awardBonus(double _bonus){
        bonus += _bonus;
    }
    public double pay(){
        double total = getSalary() + bonus;
        bonus = 0;
        return total;
    }
}
