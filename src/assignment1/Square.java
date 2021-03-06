package assignment1;

public class Square extends Shape{
    /**
     * Constructs a Square using a center point and side length. 
     * Oriented in such a way that its base is parallel with the horizontal axis.
     * 
     * @param center     the center point
     * @param sideLength the length of each side
     */
    public Square(Point center, double sideLength) {
        super(center, sideLength);
    }
    
    /**
     * Decides whether a given point lies inside the square.
     * Returns true if the point lies on the border.
     * 
     * @param x the point to be evaluated
     */
    @Override
    public boolean containsPoint(Point x) {
        return x.getX() >= center.getX() - sideLength/2 && x.getX() <= center.getX() + sideLength/2
                && x.getY() >= center.getY() -sideLength/2 && x.getY() <= center.getY() +sideLength/2;
    }
    
    @Override
    public String toString() {
        return "Square{ " + center + ", " + sideLength + '}';
    }
}
