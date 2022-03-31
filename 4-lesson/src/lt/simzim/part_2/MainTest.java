package lt.simzim.part_2;

public class MainTest {
    public static void main(String[] args) {

        Staff Sar = new Staff();
        Employee obj = new Employee("Brisius", "Galiauskas", "860000000", "123456", 3000);
        Sar.addStaffMember(obj);
        Employee obj1 = new Employee("Leopoldas", "Katinas", "860000000", "987456", 2000);
        Sar.addStaffMember(obj1);
        Trainee obj2 = new Trainee("Baronas", "Miunchauzenas", "8611111111");
        Sar.addStaffMember(obj2);
        Executive obj3 = new Executive("Vytautas", "Dydisis", "8677777777", "9874563", 4000);
        Sar.addStaffMember(obj3);
        Sar.addStaffMember(obj3);
        Hourly obj4 = new Hourly("Bitutė", "Radvilaitė", "868888888", "85274196", 0);
        Sar.addStaffMember(obj4);
        Hourly obj5 = new Hourly("Kaštonas", "Medinis", "868888888", "85274196", 0);
        Sar.addStaffMember(obj5);

        obj3.awardBonus(150);
        obj4.addHours(10);
        obj5.addHours(20);

        System.out.println("Viso reiks sumokėti algoms: " + Sar.payDay());
    }
}
