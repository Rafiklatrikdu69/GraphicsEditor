package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

/**
 * La classe abstraite Shape représente une forme géométrique.
 */
public abstract class Shape {

    /**
     * Retourne le type de la forme.
     *
     * @return Le type de la forme.
     */
    public abstract String getType();

    /**
     * Retourne une représentation textuelle de la forme avec un padding spécifié.
     *
     * @param padding L'espacement utilisé pour l'indentation.
     * @return        Une chaîne de caractères représentant la forme.
     */
    public abstract String toString(int padding);

    /**
     * Dessine la forme sur le contexte graphique spécifié.
     *
     * @param g Le contexte graphique sur lequel la forme sera dessinée.
     */
    public abstract void draw(Graphics g);

    /**
     * Retourne un nœud de l'arbre des formes utilisé pour la représentation visuelle.
     *
     * @return Un nœud de l'arbre des formes.
     */
    public abstract DefaultMutableTreeNode getJTreeNodes();

    /**
     * Indique si la forme est un groupe.
     *
     * @return true si la forme est un groupe, false sinon.
     */
    public abstract boolean isGroup();
}
