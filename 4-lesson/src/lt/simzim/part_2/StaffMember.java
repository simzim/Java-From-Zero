package lt.simzim.part_2;

public class StaffMember extends Staff {
    protected String name;
    protected String surname;
    protected String phone;

    public StaffMember(String _name, String _surname, String _phone){
        this.name = _name;
        this.surname = _surname;
        this.phone = _phone;
    }
    public String toString(){
        return name + "\t " + surname + ",\t\t " + phone;
    }
    public double pay(){
        return 0;
    }
}
