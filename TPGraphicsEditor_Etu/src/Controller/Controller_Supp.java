package Controller;

import Model.Shape;
import Model.ShapeFactory;
import Model.ShapeManager;

import java.util.ArrayList;

public class Controller_Supp {
    private ShapeManager data;
    public Controller_Supp(ShapeManager d)
    {
        this.data = d;
    }
    public void control(int index){
        data.remove(index);
    }
}
