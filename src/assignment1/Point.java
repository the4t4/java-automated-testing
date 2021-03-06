package assignment1;

public class Point {
    private double x;
    private double y;
    
    /**
     * Constructs a Point object represented on a 2D plane using axis values.
     * 
     * @param x X-axis position
     * @param y Y-axis position
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Default Point constructor. Constructs a Point object at (0,0). 
     */
     public Point(){
         this(0,0);
     }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
