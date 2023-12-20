package Controller;

import Model.Group;
import Model.Shape;
import Model.ShapeManager;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller_Groupe {
    private ShapeManager data;

    public Controller_Groupe(ShapeManager d) {
        this.data = d;
    }

    public void control(int selection[]) {
        Group newGroup = new Group("group", new ArrayList<>());
        Group GroupeParent = null;
        Group root = data.getRoot();

        for (int i = selection.length - 1; i >= 0; i--) {

            if (i ==  selection.length-1) {
                Arrays.sort(selection);
                ShapeManager.cpt = 1;
                    GroupeParent = data.rechercheGroupe(selection[selection.length-1],data.getRoot());
            }
            ShapeManager.cpt = 1;
            Shape shape = data.recherche(selection[i], root);
            System.out.println(shape.toString(2));
            newGroup.add(shape);
            data.remove(selection[i]);
        }
        //root.add(newGroup);
        GroupeParent.add(newGroup);
    }
}
