package Model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ShapeManager extends Observable {

    /** Compteur utilisé pour les opérations sur les formes. */
    public static int cpt;

    /** Hauteur utilisée pour les opérations sur les formes. */
    public static int hauteur;

    /** La racine de la hiérarchie des formes. */
    private Shape root;
    /**
     * Initialise la racine de la hiérarchie des formes.
     */
    public ShapeManager() {
        init();
    }

    /**
     * Recherche un groupe dans la hiérarchie des formes.
     *
     * @param index     L'indice de recherche.
     * @param groupe    Le groupe dans lequel effectuer la recherche.
     * @return          Le groupe trouvé ou null s'il n'est pas trouvé.
     */
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
                }

            }
        }
        return null;
    }
    /**
     * Recherche une forme dans la hiérarchie des formes.
     *
     * @param index     L'indice de recherche.
     * @param groupe    Le groupe dans lequel effectuer la recherche.
     * @return          La forme trouvée ou null si elle n'est pas trouvée.
     */
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
    /**
     * Parcourt la hiérarchie des formes pour supprimer une forme à un certain indice.
     *
     * @param index     L'indice de la forme à supprimer.
     * @param groupe    Le groupe dans lequel effectuer la suppression.
     * @return          La forme supprimée ou null si elle n'est pas trouvée.
     */
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


    /**
     * Supprime une forme à un certain indice dans la hiérarchie des formes.
     *
     * @param index     L'indice de la forme à supprimer.
     */
    public void remove(int index ) {

        cpt = 0;
        parcourt(index, ((Group) root));
        setChanged();
        notifyObservers();
    }

    /**
     * Ajoute une forme à la hiérarchie des formes.
     *
     * @param shape     La forme à ajouter.
     */
    public void add(Shape shape) {

        ((Group) root).add(shape);
        setChanged();
        notifyObservers();
        System.out.println("c'est un groupe ");

    }
    /**
     * Dessine toutes les formes dans la hiérarchie.
     *
     * @param graphics  L'objet Graphics sur lequel dessiner.
     */
    public void draw(Graphics graphics) {
        root.draw(graphics);
    }
    /**
     * Obtient le modèle d'arbre par défaut pour la hiérarchie des formes.
     *
     * @return          Le modèle d'arbre par défaut.
     */
    public DefaultTreeModel getTreeModel() {
    DefaultMutableTreeNode roote = ((Group)root).getJTreeNodes();
        return new DefaultTreeModel(roote);
    }
    /**
     * Obtient la racine de la hiérarchie des formes.
     *
     * @return          La racine de la hiérarchie.
     */
    public Group getRoot(){
        return (Group) this.root;
    }
    /**
     * Notifie les observateurs d'une mise à jour dans la hiérarchie des formes.
     */
    public void MajGroup(){
        setChanged();
        notifyObservers();
    }
    /**
     * Obtient la hauteur d'une forme à un certain indice dans la hiérarchie.
     *
     * @param index     L'indice de la forme.
     * @param groupe    Le groupe dans lequel effectuer le calcul de hauteur.
     * @return          La hauteur calculée ou -1 si la forme n'est pas trouvée.
     */
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