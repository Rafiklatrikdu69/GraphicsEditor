/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import Model.Shape;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * La classe Controller_degrouper gère le processus de dégroupement des formes dans le modèle ShapeManager.
 * Elle permet de retirer les formes d'un groupe sélectionné et de les ajouter au niveau supérieur de la hiérarchie.
 *
 * @author Rafik Bouchenna
 */
public class Controller_Degroupe {
    private final ShapeManager data;

    /**
     * Constructeur de la classe Controller_degrouper.
     *
     * @param d Le gestionnaire de formes (ShapeManager) à utiliser.
     */
    public Controller_Degroupe(ShapeManager d) {
        data = d;
    }

    /**
     * Contrôle le processus de dégroupement des formes.
     *
     * @param selection Un tableau d'indices représentant les formes à dégrouper.
     */
    public void control(int selection[]) {
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

        // Effectue le dégroupement en retirant les formes du groupe sélectionné
        for (int i = selection.length - 1; i >= 0; i--) {
            Arrays.sort(selection);
            if (i == selection.length - 1) {
                ShapeManager.hauteur = 0;
                ShapeManager.cpt = 0;
                GroupeParent = data.rechercheGroupe(selection[indexMinHauteur], data.getRoot());
                System.out.println("Le groupe recherché : " + GroupeParent.getName());
            }
            ShapeManager.cpt = 0;
            Shape shape = data.recherche(selection[i], root);
            if (shape.isGroup()) {
                // Si la forme est un groupe, ajoute toutes ses formes au niveau supérieur
                for (Shape shapes : ((Group) shape).getShape()) {
                    GroupeParent.add(shapes);
                }
            } else {
                // TODO: Afficher une JOptionPane d'erreur pour les formes non groupes
            }
            System.out.println(shape.toString(2));
            data.remove(selection[i]);
        }

        data.MajGroup();
    }
}
