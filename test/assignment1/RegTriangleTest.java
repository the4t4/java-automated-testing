package assignment1;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegTriangleTest {
    
    /**
     * Test of containsPoint method, of class RegTriangle.
     * Checks true for its center point.
     */  
   @Test
    public void testContainsCenterPoint() {
        RegTriangle c =  new RegTriangle(new Point(16,-15), 3);
        Point x = new Point(16,-15);
        assertTrue(c.containsPoint(x));
    }
    
    /**
     * Test of containsPoint method, of class RegTriangle.
     * Checks true for three random points inside.
     */  
    @Test
    public void testContainsWithinPoints() {
        RegTriangle c =  new RegTriangle(new Point(0,0), 5);
        Point x = new Point(1,1);
        Point y = new Point(-1,1);
        Point z = new Point(0,2);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
    }
    
    /**
     * Test of containsPoint method, of class RegTriangle.
     * Checks true for four border points.
     */ 
    @Test
    public void testContainsBorderPoints() {
        RegTriangle c =  new RegTriangle(new Point(0,0), 5);
        double apothem = c.getApothem();
        Point x = new Point(0,-apothem);
        Point y = new Point(0,2*apothem);
        Point z = new Point(-2.5, -apothem);
        Point w = new Point(2.5, -apothem);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
        assertTrue(c.containsPoint(w));
    }
    
    /**
     * Test of containsPoint method, of class RegTriangle.
     * Checks false for four random points outside.
     */
    @Test
    public void testNotContainsOutsidePoints() {
        RegTriangle c =  new RegTriangle(new Point(0,0), 5);
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
