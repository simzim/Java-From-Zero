package lt.simzim.part_2;

public class Trainee extends StaffMember{

    public Trainee(String _name, String _surname, String _phone){
        super(_name, _surname, _phone);
    }

    public String toString(){
        return name + "\t " + surname + ",\t\t " + phone +  ",\t\t " + 0 ;
    }
    public double pay(){
        return 0;
    }
}
