package Controller;

import Model.ShapeManager;

/**
 * La classe Controller_Supp gère la suppression de formes dans le modèle ShapeManager.
 */
public class Controller_Suppression {
    private ShapeManager data;

    /**
     * Constructeur de la classe Controller_Supp.
     *
     * @param d Le gestionnaire de formes (ShapeManager) à utiliser.
     */
    public Controller_Suppression(ShapeManager d) {
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
