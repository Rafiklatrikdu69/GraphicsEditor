package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.ArrayList;

/**
 * La classe Group représente un groupe de formes géométriques.
 */
public class Group extends Shape {
    private ArrayList<Shape> shape;
    private String name;

    /**
     * Constructeur de la classe Group.
     *
     * @param name   Le nom du groupe.
     * @param shapes La liste des formes du groupe.
     */
    public Group(String name, ArrayList<Shape> shapes) {
        this.name = name;
        this.shape = shapes;
    }

    /**
     * Retourne le nom du groupe.
     *
     * @return Le nom du groupe.
     */
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "Group";
    }

    @Override
    public String toString(int padding) {
        return null;
    }

    @Override
    public void draw(Graphics g) {
        for (Shape shape : this.shape)
            shape.draw(g);
    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(getName());

        for (Shape shape : this.shape)
            treeNode.add(shape.getJTreeNodes());

        return treeNode;
    }

    @Override
    public boolean isGroup() {
        return true;
    }

    /**
     * Ajoute une forme au groupe.
     *
     * @param shape La forme à ajouter.
     */
    public void add(Shape shape) {
        this.shape.add(shape);
    }

    /**
     * Supprime une forme du groupe.
     *
     * @param index L'indice de la forme à supprimer.
     */
    public void remove(int index) {
        if (index >= 0 && index < this.shape.size()) {
            this.shape.remove(index);
        }
    }

    /**
     * Retourne la forme à l'indice spécifié dans le groupe.
     *
     * @param index L'indice de la forme.
     * @return La forme à l'indice spécifié ou null si l'indice est invalide.
     */
    public Shape getShapeAtIndex(int index) {
        if (index >= 0 && index < this.shape.size()) {
            return this.shape.get(index);
        } else {
            return null;
        }
    }

    /**
     * Retourne le nombre de formes dans le groupe.
     *
     * @return Le nombre de formes dans le groupe.
     */
    public int getTaille() {
        return this.shape.size();
    }

    /**
     * Retourne la liste des formes dans le groupe.
     *
     * @return La liste des formes dans le groupe.
     */
    public ArrayList<Shape> getShape() {
        return this.shape;
    }
}
