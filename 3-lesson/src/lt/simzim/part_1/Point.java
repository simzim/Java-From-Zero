package lt.simzim.part_1;

/**
 * @author simzim
 */
public class Point {
    private int x;
    private int y;

    /**
     * Creates a point without the specified coordinates (0,0)
     */
    Point(){
        x = 0;
        y = 0;
    }

    /**
     * Creates a point with the specified coordinates (x, y)
     * @param x The coordinate of the point on the x-axis
     * @param y The coordinate of the point on the y-axis
     */
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Get the coordinate of the point on the x-axis
     * @return The coordinate of the point on the x-axis
     */
    public int getX(){
        return x;
    }

    /**
     * Get the coordinate of the point on the y-axis
     * @return The coordinate of the point on the y-axis
     */
    public int getY(){
        return y;
    }

    /**
     * Set the coordinate of the point on the x-axis
     * @param x The coordinate of the point on the x-axis
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Set the coordinate of the point on the y-axis
     * @param y The coordinate of the point on the y-axis
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * Calculate the distance from the origin (0,0) to  the current point
     * @return returns the distance from the origin (0,0) to  the current point (x,y)
     */
    public double distanceFromOrigin(){
        double dist = Math.sqrt(x * x + y * y);
        return dist;
    }

    /**
     * shift point by dx and dy units
     * @param dx
     * @param dy
     */
    void translate(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }

    /**
     * convert point location in [x;y] format string
     * @return string point location in [x;y] format
     */

    public String toString() {
        return "[" + this.x + ";" + this.y + "]";
    }


    /**
     * returns the distance to point p from the current point
     * @param p object of class Point
     * @return The distance to point p from the current point (Point p). The value will always be non-negative
     */
    public double distance(Point p){
        double dist = Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
        return dist;
    }
    /**
     * Change the coordinates of the current point
     * @param x new distance of the point along the x-axis
     * @param y new distance of the point along the y-axis
     */
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

}