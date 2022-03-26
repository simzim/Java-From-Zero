package lt.simzim.part_1;

/**
 * @author simzim
 *
 */

public class PointMain {
    /**
     * @param args the command line arguments - unused
     */
    public static void main(String[] args) {
        /**
         * Create two objects of class Point
         * Object t create with a constructor with parameter
         * Object p create with a constructor without parameters
         */
        Point t = new Point(6,10);
        Point p = new Point();

        /**
         * Testing setX(), setY() methods of class Point
         * Testing getX(), getY() methods of class Point
         */
        p.setX(11);
        p.setY(7);
        System.out.println("Point p x-axis: " + p.getX());
        System.out.println("Point p y-axis: " + p.getY());

        /**
         * Testing distanceFromOrigin, translate and pointToString methods of class Point
         */
        System.out.println("Point t distance from origin [0;0]: " + t.distanceFromOrigin());
        t.translate(3, 4);
        System.out.println("Point t change position x + dx , y + dy:");
        System.out.println("new location of Point t: " + t.ToString());

        /**
         * Testing distance, setLocation methods of class Point
         */

        System.out.println("Point t distance from Point p:" + t.distance(p));
        System.out.println("Set location to [4, 2] of Point p");
        p.setLocation(4, 2);
        System.out.println("new location of Point p: " + p.ToString());
    }
}
