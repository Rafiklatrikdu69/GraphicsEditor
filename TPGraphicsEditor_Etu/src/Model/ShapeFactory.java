package Model;

import java.awt.*;
import java.util.Random;

public class ShapeFactory {
    public ShapeFactory(){

    }
    public Shape creationForme(String  forme){
        Shape shape=null;
        Random rand= new Random(System.currentTimeMillis());
        if(forme.equals("Circle")) {

            System.out.println("le cercle");
             shape = new Circle(new Point(rand.nextInt(200), rand.nextInt(200)), Color.BLACK);


        }else if(forme.equals("Square")){
             shape = new Square(new Point(rand.nextInt(200), rand.nextInt(200)), Color.BLUE);
        }
        else if(forme.equals("Rectangle")){
            shape = new Rectangle(new Point(rand.nextInt(200), rand.nextInt(200)),100,150, Color.BLUE);
        }
        return shape;
    }
}
