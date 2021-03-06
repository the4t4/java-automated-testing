package assignment1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {
    
    /**
     * Test of containsPoint method, of class Circle.
     * Checks true for its center point.
     */
    @Test
    public void testContainsCenterPoint() {
        Circle c =  new Circle(new Point(16,-15), 3);
        Point x = new Point(16,-15);
        assertTrue(c.containsPoint(x));
    }
    /**
     * Test of containsPoint method, of class Circle.
     * Checks true for three random points within.
     */
    @Test
    public void testContainsWithinPoints() {
        Circle c =  new Circle(new Point(0,0), 5);
        Point x = new Point(3,2);
        Point y = new Point(-3,-2);
        Point z = new Point(2,4);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
    }
    
    /**
     * Test of containsPoint method, of class Circle.
     * Checks true for four border points.
     */    
    @Test
    public void testContainsBorderPoints() {
        Circle c =  new Circle(new Point(0,0), 5);
        Point x = new Point(0,5);
        Point y = new Point(5,0);
        Point z = new Point(-5,0);
        Point w = new Point(0,-5);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
        assertTrue(c.containsPoint(w));
    }
    
    /**
     * Test of containsPoint method, of class Circle.
     * Checks false for four random points outside.
     */
    @Test
    public void testNotContainsOutsidePoints() {
        Circle c =  new Circle(new Point(0,0), 5);
        Point x = new Point(0,7);
        Point y = new Point(5,15);
        Point z = new Point(4,5);
        Point w = new Point(-24,-7);
        assertFalse(c.containsPoint(x));
        assertFalse(c.containsPoint(y));
        assertFalse(c.containsPoint(z));
        assertFalse(c.containsPoint(w));
    }
    
}
