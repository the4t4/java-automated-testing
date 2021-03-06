package assignment1;

public abstract class Shape {
    protected Point center;
    protected double sideLength;
    
    /**
     * Constructs a Shape object using a center point and side length. 
     * In case of a circle, the length will represent its radius.
     * 
     * @param center     the center point
     * @param sideLength the length of each side 
     */
    public Shape(Point center, double sideLength){
        this.center = center;
        this.sideLength = sideLength;
    }
    
    /**
     * Method for deciding if a given point lies inside the shape.
     * Should return true if it lies on the border.
     * 
     * @param x the point to be evaluated
     */
    public abstract boolean containsPoint(Point x);
}
