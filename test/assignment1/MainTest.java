package assignment1;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class MainTest {
    FileHandler fh;
    ArrayList<Shape> s;
    Point p;
    String f;
    
    
    @Before
    public void buildUp(){
        fh = new FileHandler();
        s = new ArrayList<>();
    }
    
    @After
    public void breakDown(){
        s.clear();
    }

    /**
     * Testing file test01.
     * Checking if correct objects are being built.
     * Checking if expected value equals answer for center point.
     * 
     */
    @Test
    public void test01() {
        f = "test01.txt";
        p = new Point(0,0);
        double output = fh.run(s, f, p);
        double expected = 4;
        
        assertTrue(s.get(0).toString().contains("Square"));
        assertTrue(s.get(1).toString().contains("Triangle"));
        assertTrue(s.get(2).toString().contains("Circle"));
        assertTrue(s.get(3).toString().contains("Hexagon"));
        assertEquals(output, expected, 0);
    }
    
    /**
     * Testing file test02.
     * Checking if correct objects are being built.
     * Checking if expected value equals answer for outside point.
     * 
     */
    @Test
    public void test02() {
        f = "test02.txt";
        p = new Point(10,-10);
        double output = fh.run(s, f, p);
        double expected = 0;
        
        assertTrue(s.get(0).toString().contains("Square"));
        assertTrue(s.get(1).toString().contains("Triangle"));
        assertTrue(s.get(2).toString().contains("Circle"));
        assertTrue(s.get(3).toString().contains("Hexagon"));
        assertEquals(output, expected, 0);
    }
    
    /**
     * Testing file test03.
     * Checking if expected value equals answer for multiple randomized objects.
     * 
     */
    @Test
    public void test03() {
        f = "test03.txt";
        p = new Point(1,4);
        double output = fh.run(s, f, p);
        double expected = 4;
        
        assertEquals(output, expected, 0);
        assertTrue(s.get(1).containsPoint(p));
        assertTrue(s.get(3).containsPoint(p));
        assertTrue(s.get(4).containsPoint(p));
        assertTrue(s.get(6).containsPoint(p));
    }
    
    /**
     * Testing file test04.
     * Checking output for empty file.
     * 
     */
    @Test
    public void test04() {
        f = "test04.txt";
        p = new Point(1,4);
        double output = fh.run(s, f, p);
        double expected = 0;
        
        assertEquals(output, expected, 0);
    }
    
    /**
     * Testing file test05.
     * Checking output for incomplete file.
     * 
     */
    @Test
    public void test05() {
        f = "test05.txt";
        p = new Point(1,4);
        double output = fh.run(s, f, p);
        double expected = -1;
        
        assertEquals(output, expected, 0);
    }
}
