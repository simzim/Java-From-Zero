package lt.simzim.part_1;
/**
 * @author simzim
 */
public class Line extends Point {
    Point start;
    Point end;

    /**
     * Empty constructor
     */
    public Line(){}

    /**
     * Creates a line with the specified 4 integer (x1, y1, x2, y2)
     * @param x1 The coordinate of the start point on the x-axis
     * @param y1 The coordinate of the start point on the y-axis
     * @param x2 The coordinate of the end point on the x-axis
     * @param y2 The coordinate of the end point on the y-axis
     */
    public Line(int x1, int y1, int x2, int y2){
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    /**
     * Creates a line with the specified 2 points
     * @param start point of line
     * @param end point of line
     */
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    /**
     * @return get start point of line
     */
    public Point getStart() {
        return start;
    }
    /**
     * @return get end point of line
     */
    public Point getEnd() {
        return end;
    }

    /**
     * Set a start point of line
     * @param start point of line
     */
    public void setStart(Point start) {
        this.start = start;
    }

    /**
     * Set an end point of line
     * @param end point of line
     */
    public void setEnd(Point end) {
        this.end = end;
    }

    /**
     * @return string start ir end point  of line
     */
    public String toString() {
        return "Line start point " + start + ", end point " + end;
    }

     /**
     * use Point's distance() method
     * @return the length of this line
     */
    public double getLength() {
        return start.distance(end);
    }

}
