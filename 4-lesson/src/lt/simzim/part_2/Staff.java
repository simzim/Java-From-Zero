package lt.simzim.part_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Staff {
//    ArrayList<StaffMember> staffList = new ArrayList<StaffMember>();
    StaffMember[] staffListArr = new StaffMember[0];

    public Staff(){}
    public void addStaffMember(StaffMember person){
//      staffList.add(person);
        this.staffListArr = Arrays.copyOf(this.staffListArr, this.staffListArr.length + 1);
        this.staffListArr[staffListArr.length - 1] = person;
    }

    public double payDay(){
        double total = 0;
        double sal = 0;
        for(StaffMember person:  staffListArr) {
            sal  = person.pay();
            total += sal;
            System.out.println(person.name + " " + person.surname + " \t\t\t "+  sal);
            sal = 0;
        }
        return total;
    }
}
