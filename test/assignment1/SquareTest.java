package assignment1;

import org.junit.Test;
import static org.junit.Assert.*;


public class SquareTest {
    
    /**
     * Test of containsPoint method, of class Square.
     * Checks true for its center point.
     */ 
    @Test
    public void testContainsCenterPoint() {
        Square c =  new Square(new Point(16,-15), 3);
        Point x = new Point(16,-15);
        assertTrue(c.containsPoint(x));
    }
    
    /**
     * Test of containsPoint method, of class Square.
     * Checks true for three random points inside.
     */ 
    @Test
    public void testContainsWithinPoints() {
        Square c =  new Square(new Point(0,0), 5);
        Point x = new Point(2,2);
        Point y = new Point(-2,-2);
        Point z = new Point(0,1);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
    }
    
    /**
     * Test of containsPoint method, of class Square.
     * Checks true for four border points.
     */ 
    @Test
    public void testContainsBorderPoints() {
        Square c =  new Square(new Point(0,0), 5);
        Point x = new Point(2.5,2.5);
        Point y = new Point(2.5,0);
        Point z = new Point(-2.5,2.5);
        Point w = new Point(0,-2.5);
        assertTrue(c.containsPoint(x));
        assertTrue(c.containsPoint(y));
        assertTrue(c.containsPoint(z));
        assertTrue(c.containsPoint(w));
    }
    
    /**
     * Test of containsPoint method, of class Square.
     * Checks false for four random points outside.
     */ 
    @Test
    public void testNotContainsOutsidePoints() {
        Square c =  new Square(new Point(0,0), 5);
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
