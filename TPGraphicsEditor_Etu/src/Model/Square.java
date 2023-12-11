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

    public Rectangle getBox()
    {
        return new Rectangle((int)(center.x), (int)(center.y ), (int)(radius), (int)( radius));
    }

    public String getType()
    {
        return "Circle";
    }



    @Override
    public String toString(int padding) {
        String str = new String();

        str += getType() + "(" + center +")";

        return str;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(center.x,center.y,(int)radius,(int)radius);
        g.setColor(Color.black);
        g.drawOval(center.x,center.y,(int)radius,(int)radius);
    }

    public DefaultMutableTreeNode getJTreeNodes() {

        return new DefaultMutableTreeNode(getType()+ "(Center["+center.x+", "+center.y +"], R["+radius+"]");
    }
}
