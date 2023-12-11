/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author adrien.peytavie
 */
public class ShapeManager extends Observable {

    ArrayList<Shape> shapes;
    
    public ShapeManager()
    {
        shapes = new ArrayList<>();
    }
    
    public void init()
    {
    }
    
    public void add(Shape circle)
    {
        shapes.add(circle);

        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Data{\n" + "  shape{\n" + shapes.toString() + "  }\n}";
    }

    public void draw(Graphics graphics) {
        for (Shape circle : shapes)
            circle.draw(graphics);
    }
    
    public DefaultTreeModel getTreeModel() {
        
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode("Circles");
        
        for (Shape circle : shapes)
            treeNode.add(circle.getJTreeNodes());
        
        return new DefaultTreeModel(treeNode);
    }
}
