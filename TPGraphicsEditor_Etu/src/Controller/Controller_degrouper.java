/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import Model.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author adrien.peytavie
 */
public class Controller_degrouper {
    private final ShapeManager data;


    public Controller_degrouper(ShapeManager d) {
        data = d;

    }

    public void control(int selection[]) {
        Group GroupeParent = null;
        Group root = data.getRoot();
        ArrayList<Integer> hauteurs = new ArrayList<>();

        for (int i = selection.length - 1; i >= 0; i--) {
            ShapeManager.hauteur = 0;
            ShapeManager.cpt = 0;
            int h1 = data.Hauteur(selection[i], root);
            hauteurs.add(h1);
        }

        int indexMinHauteur = 0;
        for (int i = 0; i < hauteurs.size(); i++) {

            if (hauteurs.get(i) < hauteurs.get(indexMinHauteur)) {
                indexMinHauteur = i;
            }

        }

        for (int i = selection.length - 1; i >= 0; i--) {
            Arrays.sort(selection);
            if (i == selection.length - 1) {
                ShapeManager.hauteur = 0;
                ShapeManager.cpt = 0;
                GroupeParent = data.rechercheGroupe(selection[indexMinHauteur], data.getRoot());
                System.out.println("Le groupe rechercher : "+GroupeParent.getName());
            }
            ShapeManager.cpt = 0;
            Shape shape = data.recherche(selection[i], root);
            if(shape.isGroup()) {
                for (Shape shapes : ((Group)shape).getShape()) {

                    GroupeParent.add(shapes);
                }
            }else{
                //joption pane a faire
            }
            System.out.println(shape.toString(2));
           // GroupeParent.add(shape);
            data.remove(selection[i]);
        }


        data.MajGroup();
    }
}
