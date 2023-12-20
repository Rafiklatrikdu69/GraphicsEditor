package Controller;

import Model.Shape;
import Model.ShapeFactory;
import Model.ShapeManager;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * La classe Controller_Supp gère la suppression de formes dans le modèle ShapeManager.
 */
public class Controller_Supp {
    private ShapeManager data;

    /**
     * Constructeur de la classe Controller_Supp.
     *
     * @param d Le gestionnaire de formes (ShapeManager) à utiliser.
     */
    public Controller_Supp(ShapeManager d) {
        this.data = d;
    }

    /**
     * Contrôle la suppression des formes en fonction des indices fournis.
     *
     * @param selection Un tableau d'indices représentant les formes à supprimer.
     */
    public void control(int selection[]) {
        // Parcourt les indices de manière inversée pour éviter les problèmes de décalage lors de la suppression
        for (int i = selection.length - 1; i >= 0; i--) {
            data.remove(selection[i]);
        }
    }
}
