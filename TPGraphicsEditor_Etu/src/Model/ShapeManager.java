package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ShapeManager extends Observable {
    private static int cpt;

    private Shape root;

    public ShapeManager() {
        init();
    }

    private void init() {
        root = new Group("Root", new ArrayList<>());
        System.out.println(root.toString(2));

    }

    public void parcourt(int index, Group groupe) {
        for (int i = 0; i < groupe.getTaille(); i++) {
            cpt++;
            System.out.println("i  : " + i);
            if (index == cpt) {
                groupe.getShape().remove(i);
                setChanged();
                notifyObservers();
                break;
            } else {
                if (groupe.getShapeAtIndex(i).isGroup()) {
                    parcourt(i, groupe);
                }
            }
        }
    }

    public void remove(int index) {
        cpt = 1;
        parcourt(index, ((Group) root));

    }

    public void groupSelectedShapes(ArrayList<Integer> selectedIndices) {
        if (selectedIndices.size() < 2) {

            return;
        }

        Group newGroup = new Group("New Group", new ArrayList<>());


        for (int index : selectedIndices) {
            Shape selectedShape = ((Group) root).getShapeAtIndex(index);
            if (selectedShape != null) {
                newGroup.add(selectedShape);
            }
        }


        for (int i = selectedIndices.size() - 1; i >= 0; i--) {
            int indexToRemove = selectedIndices.get(i);
            ((Group) root).remove(indexToRemove);
        }

        add(newGroup);


        setChanged();
        notifyObservers();
    }


    public void add(Shape shape) {

        ((Group) root).add(shape);
        setChanged();
        notifyObservers();
        System.out.println("c'est un groupe ");

    }

    public void draw(Graphics graphics) {
        root.draw(graphics);
    }

    public DefaultTreeModel getTreeModel() {
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode("ShapesRafik");
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
