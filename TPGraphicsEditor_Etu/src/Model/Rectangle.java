package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * La classe Rectangle représente un rectangle géométrique.
 */
public class Rectangle extends Shape {
    private Point upperLeft;
    private int width;
    private int height;
    private Color color;

    /**
     * Constructeur de la classe Rectangle.
     *
     * @param upperLeft Le coin supérieur gauche du rectangle.
     * @param width     La largeur du rectangle.
     * @param height    La hauteur du rectangle.
     * @param color     La couleur du rectangle.
     */
    public Rectangle(Point upperLeft, int width, int height, Color color) {
        super();
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /**
     * Retourne le coin supérieur gauche du rectangle.
     *
     * @return Le point représentant le coin supérieur gauche.
     */
    public Point getUpperLeft() {
        return upperLeft;
    }

    /**
     * Modifie le coin supérieur gauche du rectangle.
     *
     * @param upperLeft Le nouveau coin supérieur gauche.
     */
    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    /**
     * Retourne la largeur du rectangle.
     *
     * @return La largeur du rectangle.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Modifie la largeur du rectangle.
     *
     * @param width La nouvelle largeur du rectangle.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Retourne la hauteur du rectangle.
     *
     * @return La hauteur du rectangle.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Modifie la hauteur du rectangle.
     *
     * @param height La nouvelle hauteur du rectangle.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Retourne la couleur du rectangle.
     *
     * @return La couleur du rectangle.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Modifie la couleur du rectangle.
     *
     * @param color La nouvelle couleur du rectangle.
     */
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
