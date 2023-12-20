package Controller;

import Model.Group;
import Model.Shape;
import Model.ShapeManager;

import java.util.ArrayList;
import java.util.Arrays;
<<<<<<< HEAD
=======
import java.util.Collections;
>>>>>>> main

public class Controller_Groupe {
    private ShapeManager data;

    public Controller_Groupe(ShapeManager d) {
        this.data = d;
    }

    public void control(int selection[]) {
        Group newGroup = new Group("group", new ArrayList<>());
        Group GroupeParent = null;
        Group root = data.getRoot();
<<<<<<< HEAD

        for (int i = selection.length - 1; i >= 0; i--) {

            if (i ==  selection.length-1) {
                Arrays.sort(selection);
                ShapeManager.cpt = 1;
                    GroupeParent = data.rechercheGroupe(selection[selection.length-1],data.getRoot());
=======
        ArrayList<Integer> hauteurs = new ArrayList<>();

        for(int i = selection.length - 1; i >= 0; i--){
            ShapeManager.hauteur = 0;
            ShapeManager.cpt = 1;
            int h1 = data.Hauteur(selection[i], root);
            hauteurs.add(h1);
        }

        int indexMinHauteur = 0;
        for(int i = 0; i < hauteurs.size(); i++){

            if(hauteurs.get(i) < hauteurs.get(indexMinHauteur)){
                indexMinHauteur = i;
            }

        }

        for (int i = selection.length - 1; i >= 0; i--) {
            Arrays.sort(selection);
            if (i ==  selection.length-1) {

                ShapeManager.hauteur=0;
                ShapeManager.cpt = 1;
                GroupeParent = data.rechercheGroupe(selection[indexMinHauteur],data.getRoot());
>>>>>>> main
            }
            ShapeManager.cpt = 1;
            Shape shape = data.recherche(selection[i], root);
            System.out.println(shape.toString(2));
            newGroup.add(shape);
            data.remove(selection[i]);
        }
        //root.add(newGroup);
        GroupeParent.add(newGroup);
<<<<<<< HEAD
    }
}
=======
        data.MajGroup();

    }
}
>>>>>>> main
