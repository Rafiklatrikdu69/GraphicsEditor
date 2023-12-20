package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Square extends  Shape{
    private Point center;
    private double radius;
    Color color;


    public Square(Point p, Color c){
        center = p;
        radius = 100;
        color = c;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType()
    {
        return "Square";
    }



    @Override
    public String toString(int padding) {
        String str = new String();

        str += getType() + "(" + center +")";

        return str;
    }

    public void draw(Graphics g) {
        int x = (int) (center.x - radius / 2);
        int y = (int) (center.y - radius / 2);

        g.setColor(color);
        g.fillRect(x, y, (int) radius, (int) radius);

        g.setColor(Color.black);
        g.drawRect(x, y, (int) radius, (int) radius);
    }

    public DefaultMutableTreeNode getJTreeNodes() {

        return new DefaultMutableTreeNode(getType()+ "(Center["+center.x+", "+center.y +"], R["+radius+"]");
    }

    @Override
    public boolean isGroup() {
        return false;
    }
}
