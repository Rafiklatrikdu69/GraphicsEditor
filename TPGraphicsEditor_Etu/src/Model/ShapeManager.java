package Model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ShapeManager extends Observable {
    public static int cpt;
    public static int hauteur;

    private Shape root;

    public ShapeManager() {
        init();
    }


    public Group rechercheGroupe(int index, Group groupe){
        for (int i = 0; i < groupe.getTaille(); i++) {
            cpt++;
            if (index == cpt) {
                return groupe;
            } else {
                if (groupe.getShapeAtIndex(i).isGroup()) {
                    Group shape = rechercheGroupe(index, (Group)groupe.getShapeAtIndex(i));
                    if(shape!=null){
                        return shape;
                    }
                    // return  recherche(i, groupe);
                }

            }
        }
        return null;
    }
    public Shape recherche(int index, Group groupe) {
        for (int i = 0; i < groupe.getTaille(); i++) {
            cpt++;
            if (index == cpt) {
                return groupe.getShape().get(i);
            } else {
                if (groupe.getShapeAtIndex(i).isGroup()) {
                    Shape shape = recherche(index, (Group)groupe.getShapeAtIndex(i));
                    if(shape!=null){
                        return shape;
                    }
                    // return  recherche(i, groupe);
                }

            }
        }
        return null;
    }

    private void init() {
        root = new Group("Root", new ArrayList<>());
    }

    public Shape parcourt(int index, Group groupe) {
        for (int i = 0; i < groupe.getTaille(); i++) {
            cpt++;
            System.out.println("i  : " + i);
            if (index == cpt) {
                groupe.getShape().remove(i);
                setChanged();
                notifyObservers();
                break;
            } else {
                if (groupe.getShapeAtIndex(i).isGroup()) {
                    Shape shape = parcourt(index, (Group)groupe.getShapeAtIndex(i));
                    if(shape!=null){
                        return shape;
                    }
                }
            }
        }
        return null;
    }

    public void parcourArbre(int index) {
        cpt = 1;
        System.out.println("La shape : " + recherche(index, ((Group) root)).toString(1));
    }

    public void remove(int index ) {

        cpt = 0;
        parcourt(index, ((Group) root));
        setChanged();
        notifyObservers();
    }


    public void add(Shape shape) {

        ((Group) root).add(shape);
        setChanged();
        notifyObservers();
        System.out.println("c'est un groupe ");

    }

    public void draw(Graphics graphics) {
        root.draw(graphics);
    }

    public DefaultTreeModel getTreeModel() {
    DefaultMutableTreeNode roote = ((Group)root).getJTreeNodes();
        return new DefaultTreeModel(roote);
    }

    @Override
    public String toString() {
        return "ShapeManager{" +
                "root=" + root +
                '}';
    }
    public Group getRoot(){
        return (Group) this.root;
    }

    public void MajGroup(){
        setChanged();
        notifyObservers();
    }

    public int Hauteur(int index, Group groupe){
        for (int i = 0; i < groupe.getTaille(); i++) {
            cpt++;
            if (index == cpt) {
                return hauteur;
            } else {
                if (groupe.getShapeAtIndex(i).isGroup()) {
                    hauteur++;
                    int hauteur = Hauteur(i, (Group)groupe.getShapeAtIndex(i));
                    if(hauteur!=0){
                        return hauteur;
                    }
                }

            }
        }
        return -1;

    }
}