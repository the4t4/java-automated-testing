package assignment1;

public class Circle extends Shape {

    /**
     * Constructs a Circle using a center point and radius. 
     * 
     * @param center     the center point
     * @param radius the length of each side 
     */
    public Circle(Point center, double radius) {
        super(center, radius);
    }    
    
    /**
     * Decides whether a given point lies inside the circle.
     * Returns true if the point lies on the border.
     * 
     * @param x the point to be evaluated
     */
    @Override
    public boolean containsPoint(Point x) {
        double a = center.getX() - x.getX();
        double b = center.getY() - x.getY();
        double c = sideLength;
        return a*a + b*b <= c*c;
    }

    @Override
    public String toString() {
        return "Circle{ " + center + ", " + sideLength + '}';
    }
    
}
