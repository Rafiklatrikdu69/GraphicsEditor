package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Component extends Shape{

    protected List<Shape> children = new ArrayList<>();
    public void add(Shape component) {
        children.add(component);
    }

    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) {
        children.remove(child);
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String toString(int padding) {
        return null;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {
        return null;
    }
}
