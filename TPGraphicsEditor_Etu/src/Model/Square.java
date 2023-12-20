package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

/**
 * La classe Square représente un carré dans l'application.
 */
public class Square extends Shape {

    /** Le centre du carré. */
    private Point center;

    /** Le rayon du carré (la moitié de la longueur d'un côté). */
    private double radius;

    /** La couleur du carré. */
    private Color color;

    /**
     * Constructeur de la classe Square.
     *
     * @param p     Le point central du carré.
     * @param c     La couleur du carré.
     */
    public Square(Point p, Color c) {
        center = p;
        radius = 100;
        color = c;
    }

    /**
     * Obtient le centre du carré.
     *
     * @return      Le centre du carré.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Définit le centre du carré.
     *
     * @param center    Le nouveau centre du carré.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Obtient le rayon du carré.
     *
     * @return      Le rayon du carré.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Définit le rayon du carré.
     *
     * @param radius    Le nouveau rayon du carré.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Obtient la couleur du carré.
     *
     * @return      La couleur du carré.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Définit la couleur du carré.
     *
     * @param color     La nouvelle couleur du carré.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Obtient le type de la forme (ici, "Square").
     *
     * @return      Le type de la forme.
     */
    public String getType() {
        return "Square";
    }

    /**
     * Retourne une représentation textuelle du carré.
     *
     * @param padding   L'espacement pour l'indentation.
     * @return          Une chaîne représentant le carré.
     */
    @Override
    public String toString(int padding) {
        String str = getType() + "(" + center + ")";
        return str;
    }

    /**
     * Dessine le carré sur un objet Graphics.
     *
     * @param g     L'objet Graphics sur lequel dessiner.
     */
    public void draw(Graphics g) {
        int x = (int) (center.x - radius / 2);
        int y = (int) (center.y - radius / 2);

        g.setColor(color);
        g.fillRect(x, y, (int) radius, (int) radius);

        g.setColor(Color.black);
        g.drawRect(x, y, (int) radius, (int) radius);
    }

    /**
     * Obtient les nœuds de l'arbre pour le carré.
     *
     * @return      Le nœud de l'arbre représentant le carré.
     */
    public DefaultMutableTreeNode getJTreeNodes() {
        return new DefaultMutableTreeNode(getType() + "(Center[" + center.x + ", " + center.y + "], R[" + radius + "]");
    }

    /**
     * Vérifie si la forme est un groupe.
     *
     * @return      true si la forme est un groupe, sinon false.
     */
    @Override
    public boolean isGroup() {
        return false;
    }
}
