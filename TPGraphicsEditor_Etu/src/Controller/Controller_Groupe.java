package Controller;

import Model.Group;
import Model.Shape;
import Model.ShapeManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * La classe Controller_Groupe gère la création de groupes dans le modèle ShapeManager.
 */
public class Controller_Groupe {
    private ShapeManager data;

    /**
     * Constructeur de la classe Controller_Groupe.
     *
     * @param d Le gestionnaire de formes (ShapeManager) à utiliser.
     */
    public Controller_Groupe(ShapeManager d) {
        this.data = d;
    }

    /**
     * Contrôle la création d'un groupe à partir d'un ensemble de formes sélectionnées.
     *
     * @param selection Un tableau d'indices représentant les formes à regrouper.
     */
    public void control(int selection[]) {
        Group newGroup = new Group("group", new ArrayList<>());
        Group GroupeParent = null;
        Group root = data.getRoot();
        ArrayList<Integer> hauteurs = new ArrayList<>();

        // Calcule les hauteurs des formes sélectionnées dans l'arbre
        for (int i = selection.length - 1; i >= 0; i--) {
            ShapeManager.hauteur = 0;
            ShapeManager.cpt = 0;
            int h1 = data.Hauteur(selection[i], root);
            hauteurs.add(h1);
        }

        // Trouve l'indice de la forme à la hauteur minimale
        int indexMinHauteur = 0;
        for (int i = 0; i < hauteurs.size(); i++) {
            if (hauteurs.get(i) < hauteurs.get(indexMinHauteur)) {
                indexMinHauteur = i;
            }
        }

        // Crée le groupe et l'ajoute au groupe parent
        for (int i = selection.length - 1; i >= 0; i--) {
            Arrays.sort(selection);
            if (i == selection.length - 1) {
                ShapeManager.hauteur = 0;
                ShapeManager.cpt = 0;
                GroupeParent = data.rechercheGroupe(selection[indexMinHauteur], data.getRoot());
            }
            ShapeManager.cpt = 0;
            Shape shape = data.recherche(selection[i], root);
            newGroup.add(shape);
            data.remove(selection[i]);
        }
        GroupeParent.add(newGroup);
        data.MajGroup();
    }
}
