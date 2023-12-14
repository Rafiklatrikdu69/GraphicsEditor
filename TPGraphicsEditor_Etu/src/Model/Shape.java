package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public abstract class Shape {
     public abstract String getType();
    public abstract String toString(int padding);

    public abstract void draw(Graphics g);
    public abstract DefaultMutableTreeNode getJTreeNodes();
}
