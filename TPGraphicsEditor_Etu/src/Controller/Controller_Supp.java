package Controller;

import Model.Shape;
import Model.ShapeFactory;
import Model.ShapeManager;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller_Supp {
    private ShapeManager data;
    public Controller_Supp(ShapeManager d)
    {
        this.data = d;
    }
    public void control(int selection[]){
<<<<<<< HEAD
        Arrays.sort(selection);
=======

>>>>>>> main
        for(int i = selection.length-1;i>=0 ;i--) {
            data.remove(selection[i]);
        }
    }
}
