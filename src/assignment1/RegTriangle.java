package assignment1;
import java.lang.Math;

public class RegTriangle extends Shape {
    
    private Point a;
    private Point b;
    private Point c;
    private double height;
    private double apothem;
            
    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }
    
    public double getHeight() {
        return height;
    }

    public double getApothem() {
        return apothem;
    }
    
    /**
     * Constructs a Regular Triangle using a center point and side length. 
     * Oriented in such a way that its base is parallel with the horizontal axis.
     * Points a,b,c are labeled in a counter-clockwise order starting from the bottom-leftmost point.
     * Additionally, its height and apothem are calculated.
     * 
     * @param center     the center point
     * @param sideLength the length of each side
     */
    public RegTriangle(Point center, double sideLength){
        super(center,sideLength);
        this.height = sideLength/2 * Math.sqrt(3);
        this.apothem = height/3;
        this.a = new Point(center.getX() - sideLength/2, center.getY() - apothem); 
        this.b = new Point(center.getX(), center.getY() + apothem*2); 
        this.c = new Point(center.getX() + sideLength/2, center.getY() - apothem);
    }
    
    /**
     * Constructs a Triangle using three points.  
     * <strong>Points a,b,c need to be given in a counter-clockwise order starting 
     * from the bottom-leftmost point.</strong>
     * 
     * @param a bottom-leftmost point
     * @param b "middle" point
     * @param c bottom-rightmost point
     */
    public RegTriangle(Point a, Point b, Point c) {
        super(null, 0);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
   /**
     * Calculates the area of a triangle given by three points on the plane.
     */
    private double area(Point x, Point y, Point z) { 
       return Math.abs((x.getX()*(y.getY()-z.getY()) + y.getX()*(z.getY()-x.getY())+ z.getX()*(x.getY()-y.getY()))/2.0); 
    }
    
    /**
     * Decides whether a given point lies inside the regular triangle.
     * Returns true if the point lies on the border.
     * 
     * @param x the point to be evaluated
     */
    @Override
    public boolean containsPoint(Point x) {
        double totalArea = area(a,b,c);
        double PAB = area(x, a, b);
        double PBC = area(x, b, c);
        double PAC = area(x, a, c);
        double totalSlicesArea = PAB + PBC + PAC;
        return (double) Math.round(totalArea * 1000000) / 1000000 ==  (double) Math.round(totalSlicesArea * 1000000) / 1000000;
    }

    @Override
    public String toString() {
        return "Triangle{ " + center + ", " + sideLength + '}';
    }
}
