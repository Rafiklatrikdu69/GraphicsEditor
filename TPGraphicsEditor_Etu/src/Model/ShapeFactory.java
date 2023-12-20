package Model;

import java.awt.*;
import java.util.Random;

/**
 * La classe ShapeFactory est responsable de la création des formes.
 */
public class ShapeFactory {

    /**
     * Constructeur de la classe ShapeFactory.
     */
    public ShapeFactory(){

    }

    /**
     * Crée une forme en fonction du type spécifié.
     *
     * @param forme Le type de la forme à créer ("Circle", "Square", "Rectangle").
     * @return      La forme créée.
     */
    public Shape creationForme(String forme) {
        Shape shape = null;
        Random rand = new Random(System.currentTimeMillis());

        if (forme.equals("Circle")) {
            System.out.println("Création d'un cercle");
            shape = new cercle(new Point(rand.nextInt(200), rand.nextInt(200)), Color.BLACK);
        } else if (forme.equals("Square")) {
            System.out.println("Création d'un carré");
            shape = new Square(new Point(rand.nextInt(200), rand.nextInt(200)), Color.BLUE);
        } else if (forme.equals("Rectangle")) {
            System.out.println("Création d'un rectangle");
            shape = new Rectangle(new Point(rand.nextInt(200), rand.nextInt(200)), 100, 150, Color.MAGENTA);
        }

        return shape;
    }
}
