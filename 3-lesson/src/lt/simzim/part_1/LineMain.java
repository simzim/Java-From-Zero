package lt.simzim.part_1;

public class LineMain{

    public static void main(String[] args) {
        // Test constructor and toString()
        Line l1 = new Line(2,4,8,12);
        Line l2 = new Line(new Point(5,6), new Point(7,8));
        Line l3 = new Line();
        System.out.println(l1);
        System.out.println(l2);

        // Test Setters and Getters
        l3.setStart(new Point(11, 20));
        l3.setEnd(new Point(-2, -6));
        System.out.println(l3.getStart());
        System.out.println(l3.getEnd());

        // Test getLength()
        System.out.println("Line length is: " + l1.getLength());
    }
}
