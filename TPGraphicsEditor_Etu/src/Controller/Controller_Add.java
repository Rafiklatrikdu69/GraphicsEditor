/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import Model.Shape;

import java.awt.*;
import java.util.Random;

/**
 *
 * @author adrien.peytavie
 */
public class Controller_Add {
    private final ShapeManager data;
    private ShapeFactory factory;
    
    public Controller_Add(ShapeManager d)
    {
        data = d;
        factory = new ShapeFactory();
    }
    
    public void control(String name, Color color)
    {
      Shape shape = factory.creationForme((name));

      data.add(shape);
    }
}
