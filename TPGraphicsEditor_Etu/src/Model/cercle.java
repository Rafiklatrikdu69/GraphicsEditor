package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

/**
 * La class Circle represent un circle géométrique.
 */
public class cercle extends Shape {
    private Point center;
    private double radius;
    Color color;

    /**
     * Constructeur de la classe Circle.
     *
     * @param p     Le point central du cercle.
     * @param color La couleur du cercle.
     */
    public cercle(Point p, Color color) {
        center = p;
        radius = 100;
        this.color = color;
    }

    /**
     * Modifie le centre du cercle.
     *
     * @param center Le nouveau centre du cercle.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Retourne le centre du cercle.
     *
     * @return Le centre du cercle.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Retourne le rayon du cercle.
     *
     * @return Le rayon du cercle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Retourne la couleur du cercle.
     *
     * @return La couleur du cercle.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Modifie le rayon du cercle.
     *
     * @param radius Le nouveau rayon du cercle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Modifie la couleur du cercle.
     *
     * @param color La nouvelle couleur du cercle.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Retourne la boîte englobante du cercle sous forme de rectangle.
     *
     * @return Le rectangle englobant le cercle.
     */


    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString(int padding) {
        return getType() + "(" + center + ")";
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(center.x, center.y, (int) radius, (int) radius);
        g.setColor(Color.black);
        g.drawOval(center.x, center.y, (int) radius, (int) radius);
    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {
        return new DefaultMutableTreeNode(getType() + "(Center[" + center.x + ", " + center.y + "], R[" + radius + "])");
    }

    @Override
    public boolean isGroup() {
        return false;
    }
}
