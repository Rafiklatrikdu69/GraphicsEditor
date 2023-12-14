package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ShapeManager extends Observable {

    private Shape root;

    public ShapeManager() {
        init();
    }

    private void init() {
        root = new Group("Root", new ArrayList<>());
        System.out.println(root.toString(2));

    }

    public void add(Shape shape) {
        if(root.getType().equals("Group")){
            ((Group) root).add(shape);
            setChanged();
            notifyObservers();
        }



    }

    public void draw(Graphics graphics) {
        root.draw(graphics);
    }

    public DefaultTreeModel getTreeModel() {
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode("Shapes");
        treeNode.add(root.getJTreeNodes());
        return new DefaultTreeModel(treeNode);
    }

    @Override
    public String toString() {
        return "ShapeManager{" +
                "root=" + root +
                '}';
    }
}
