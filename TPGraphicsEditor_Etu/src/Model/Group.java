package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Group extends Shape {
    private ArrayList<Shape> shape;
    private String name;

    Group(String name, ArrayList<Shape> shapes) {
        this.name = name;
        this.shape = shapes;
    }
    public String getName(){
        return  this.name;
    }

    @Override
    public String getType() {
        return "Group";
    }

    @Override
    public String toString(int padding) {
        return null;
    }

    @Override
    public void draw(Graphics g) {
        for (Shape Shape : shape)
            Shape.draw(g);
    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {

        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode("Shapes");

        for (Shape Shape : shape)
            treeNode.add(Shape.getJTreeNodes());
        System.out.println(shape);
        return treeNode;
    }

    @Override
    public boolean isGroup() {
        return true;
    }


    public void add(Shape shape) {
        this.shape.add(shape);
    }



    public void remove(int indice) {
     this.shape.remove(this.shape.get(indice));
    }
    public Shape getShapeAtIndex(int index) {
        if (index >= 0 && index < shape.size()) {
            return shape.get(index);
        } else {
            return null;
        }
    }
    public int getTaille(){
        return  this.shape.size();
    }
    public ArrayList<Shape> getShape(){
        return  this.shape;
    }
    }




