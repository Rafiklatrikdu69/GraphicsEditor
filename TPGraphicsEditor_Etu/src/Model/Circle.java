/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author adrien.peytavie
 */
public class Circle  extends  Shape{
    private Point center;
    private double radius;
    Color color;

    
    public Circle(Point p, Color c){
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

    @Override
    public boolean isGroup() {
        return false;
    }
}
