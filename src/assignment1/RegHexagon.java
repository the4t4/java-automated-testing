package assignment1;

public class RegHexagon extends Shape{
    private Point[] points = new Point[6]; 
    private RegTriangle[] triangles = new RegTriangle[6]; 
    private double height;
    
    /**
     * Constructs a Regular Hexagon using a center point and side length. 
     * Oriented in such a way that its base is parallel with the horizontal axis.
     * Points of the hexagon are labeled starting from the bottom-leftmost point in a counter-clockwise order.
     * Additionally, constructs six triangles which the hexagon is composed of.
     * 
     * @param center     the center point
     * @param sideLength the length of each side
     */
    public RegHexagon(Point center, double sideLength) {
        super(center, sideLength);
        this.height = sideLength * Math.sqrt(3); 
        points[0] = new Point(center.getX() - sideLength/2, center.getY() - height/2);
        points[1] = new Point(center.getX() - sideLength, center.getY());
        points[2] = new Point(center.getX() - sideLength/2, center.getY() + height/2);
        points[3] = new Point(center.getX() + sideLength/2, center.getY() + height/2);
        points[4] = new Point(center.getX() + sideLength, center.getY());
        points[5] = new Point(center.getX() + sideLength/2, center.getY() - height/2);
        
        triangles[0] = new RegTriangle(points[0], center, points[5]);
        triangles[1] = new RegTriangle(points[1], center, points[0]);
        triangles[2] = new RegTriangle(points[1], points[2], center);
        triangles[3] = new RegTriangle(points[2], points[3], center);
        triangles[4] = new RegTriangle(center, points[3], points[4]);
        triangles[5] = new RegTriangle(center, points[4], points[5]);
    }
    
    
    public double getHeight() {
        return height;
    }
    
    /**
     * Decides whether a given point lies inside the hexagon (uses Regular Triangle's method).
     * Returns true if the point lies on the border.
     * 
     * @param x the point to be evaluated
     */
    @Override
    public boolean containsPoint(Point x) {
        boolean b = false;
        for (RegTriangle t: triangles){
            if (t.containsPoint(x))
                    b=true;
        }
        return b;
    }
    
    @Override
    public String toString() {
        return "Hexagon{ " + center + ", " + sideLength + '}';
    }
}
