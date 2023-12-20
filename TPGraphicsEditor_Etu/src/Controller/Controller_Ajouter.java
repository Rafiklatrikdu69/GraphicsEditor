/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import Model.Shape;

import java.awt.*;

/**
 * La classe Controller_Add gère l'ajout de nouvelles formes dans le modèle ShapeManager.
 * Elle utilise une ShapeFactory pour créer des instances de formes en fonction du nom et de la couleur spécifiés.
 *
 * @author Rafik Bouchenna
 */
public class Controller_Ajouter {
    private final ShapeManager data;
    private ShapeFactory factory;

    /**
     * Constructeur de la classe Controller_Add.
     *
     * @param d Le gestionnaire de formes (ShapeManager) à utiliser.
     */
    public Controller_Ajouter(ShapeManager d) {
        data = d;
        factory = new ShapeFactory();
    }

    /**
     * Contrôle le processus d'ajout d'une nouvelle forme.
     *
     * @param name  Le nom de la forme à ajouter (par exemple, "Circle", "Square", "Rectangle").
     * @param color La couleur de la nouvelle forme.
     */
    public void control(String name, Color color) {
        // Utilise la ShapeFactory pour créer une nouvelle instance de forme
        Shape shape = factory.creationForme(name);

        // Ajoute la nouvelle forme au modèle
        data.add(shape);
    }
}
