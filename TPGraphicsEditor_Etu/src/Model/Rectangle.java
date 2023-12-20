package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.tree.DefaultMutableTreeNode;

public class Rectangle extends Shape {
    private Point upperLeft;
    private int width;
    private int height;
    private Color color;

    public Rectangle(Point upperLeft, int width, int height, Color color) {
        super();
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString(int padding) {
        return getType() + "(UpperLeft[" + upperLeft.x + ", " + upperLeft.y + "], W[" + width + "], H[" + height + "])";
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(upperLeft.x, upperLeft.y, width, height);
        g.setColor(Color.black);
        g.drawRect(upperLeft.x, upperLeft.y, width, height);
    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {
        return new DefaultMutableTreeNode(getType() + "(UpperLeft[" + upperLeft.x + ", " + upperLeft.y + "], W[" + width + "], H[" + height + "])");
    }

    @Override
    public boolean isGroup() {
        return false;
    }
}
