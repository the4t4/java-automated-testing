package assignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        fh.ReadFromFile(shapes);
        
        System.out.println("Give the x and y coordinates of the point.");
        System.out.print("x: ");
        Double x = sc.nextDouble();
        System.out.print("y: ");
        Double y = sc.nextDouble();
        Point p = new Point(x,y); 

        int answer = 0;
        for(Shape o : shapes){
            if (o.containsPoint(p))
                    answer++;
        }

        System.out.println( "Number of shapes that contain the given point: " + answer);
    }
}
