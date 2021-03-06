package assignment1;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegHexagonTest {
    
    /**
     * Test of containsPoint method, of class RegHexagon.
     * Checks true for its center point.
     */  
    @Test
    public void testContainsCenterPoint() {
        RegHexagon c =  new RegHexagon(new Point(16,-15), 3);
        Point x = new Point(16,-15);
        assertTrue(c.containsPoint(x));
    }
    
    /**
     * Test of containsPoint method, of class RegHexagon.
     * Checks true for four random points inside.
     */  
    @Test
    public void testContainsWithinPoints() {
        RegHexagon c =  new RegHexagon(new Point(0,0), 5);
        Point x = new Point(3,2);
        Point y = new Point(-3,-2);
        Point z = new Point(2,4);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
    }
    
    /**
     * Test of containsPoint method, of class RegHexagon.
     * Checks true for four border points.
     */   
    @Test
    public void testContainsBorderPoints() {
        RegHexagon c =  new RegHexagon(new Point(0,0), 5);
        double height = c.getHeight();
        Point x = new Point(0,height/2);
        Point y = new Point(height/2,0);
        Point z = new Point(-height/2,0);
        Point w = new Point(0,-height/2);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
        assertTrue(c.containsPoint(w));
    }
    
     /**
     * Test of containsPoint method, of class RegHexagon.
     * Checks false for four random points outside.
     */   
    @Test
    public void testNotContainsOutsidePoints() {
        RegHexagon c =  new RegHexagon(new Point(0,0), 5);
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
