package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.util.ArrayList;

public class Group extends  Shape{
    private ArrayList<Shape> shape;
    private String name;

    Group(String name , ArrayList<Shape> shapes) {
        this.name = name;
        this.shape = shapes;
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
        return   treeNode;
    }




    public void add(Shape shape) {
        this.shape.add(shape);
    }


}
