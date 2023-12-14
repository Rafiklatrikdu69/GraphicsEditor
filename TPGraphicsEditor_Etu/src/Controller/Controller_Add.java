/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Circle;
import Model.ShapeManager;
import Model.Square;
import Model.Shape;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author adrien.peytavie
 */
public class Controller_Add {
    private final ShapeManager data;
    
    public Controller_Add(ShapeManager d)
    {
        data = d;
    }
    
    public void control(String name, Color color)
    {
        Random rand= new Random(System.currentTimeMillis());
        if(name.equals("Circle")) {

            System.out.println("le cercle");
           Shape circle = new Circle(new Point(rand.nextInt(200), rand.nextInt(200)), color);

            data.add(circle);
        }else if(name.equals("Square")){
            Shape square = new Square(new Point(rand.nextInt(200), rand.nextInt(200)), color);

            data.add(square);
        }
    }
}
