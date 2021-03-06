package assignment1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    
    /**
     * Method for filling an ArrayList for Shape objects from content of a File.
     * 
     * @param shapes ArrayList\<Shape\> object to be filled
     */
    public void ReadFromFile(ArrayList<Shape> shapes){
        Scanner sc = new Scanner(System.in);
        String fname;
        File file;
        System.out.print("Filename or path: ");
        while(true){
            try {
                fname = sc.nextLine();
                file = new File(fname);
                if(!file.exists()) throw new FileNotFoundException();
                break;
            }
            catch(FileNotFoundException e){
                System.err.println("File not found, please try again.");
            }
            catch(Exception e){
                System.err.println("An unknown error occurred, please try again.");
            }
        }
        int currentLine = 0;
        try(BufferedReader bf = new BufferedReader(new FileReader(fname))){
            String line;
            int length = Integer.parseInt(bf.readLine());
            
            for(int i=0; i<length; i++){
                if( (line = bf.readLine()) == null){
                    throw new NullPointerException();
                }
                String[] info = line.split(" ");
                if(info.length != 4){
                    currentLine = i+2;
                    throw new IndexOutOfBoundsException();
                }
                String sh = info[0].toLowerCase();
                double x = Double.parseDouble(info[1]);
                double y = Double.parseDouble(info[2]);
                double sideLength = Double.parseDouble(info[3]);
                switch (sh){
                        case "c":
                            shapes.add(new Circle(new Point(x,y), sideLength));
                            break;           
                        case "t":
                            shapes.add(new RegTriangle(new Point(x,y), sideLength));
                            break;
                        case "s":
                            shapes.add(new Square(new Point(x,y), sideLength));
                            break;
                        case "h":
                            shapes.add(new RegHexagon(new Point(x,y), sideLength));
                            break;
                        default:
                            currentLine = i+2;
                            throw new IllegalArgumentException();
                }               
            }
        }
        catch(NullPointerException e){
            System.err.println("The number of objects do not match the first number.");
                    
        }
        catch(IllegalArgumentException e){
            System.err.println("Line " + currentLine + " in the file starts with an illegal character."
                    + " It should start with c, t, s or h.");
        }
        catch(IndexOutOfBoundsException e){
            System.err.println("There is something wrong with line " + currentLine + " in the file.");
        }
        catch(IOException e){
            System.err.println("An IO exception occurred.");
        }
    }
    
    /**
     * Method for filling an ArrayList from content of a File. 
     * Does not handle exceptions, it is meant for testing only.
     * 
     * 
     * @param shapes    ArrayList\<Shape\> object to be filled
     * @param fname     Filename
     * @param p         Point to be evaluated
     * @return the number of shapes which contain the given point. Returns -1 if it fails.
     */
     public int run(ArrayList<Shape> shapes, String fname, Point p){
        try(BufferedReader bf = new BufferedReader(new FileReader(fname))){
            String line;
            bf.readLine();
         
            while((line = bf.readLine()) != null){
                String info[] = line.split(" ");
                String sh = info[0].toLowerCase();
                double x = Double.parseDouble(info[1]);
                double y = Double.parseDouble(info[2]);
                double sideLength = Double.parseDouble(info[3]);
                switch (sh){
                        case "c":
                            shapes.add(new Circle(new Point(x,y), sideLength));
                            break;           
                        case "t":
                            shapes.add(new RegTriangle(new Point(x,y), sideLength));
                            break;
                        case "s":
                            shapes.add(new Square(new Point(x,y), sideLength));
                            break;
                        case "h":
                            shapes.add(new RegHexagon(new Point(x,y), sideLength));
                            break;
                }               
            }

            int answer = 0;
            for(Shape o : shapes){
                if (o.containsPoint(p))
                        answer++;
            }
            return answer;            
        }
        catch(Exception e){
        return -1;            
        }
    }
}
