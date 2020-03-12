package sample;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements ishape {

    Group g;
    public List<ishape> shapes=new ArrayList<>();
    abstract void buildShape();

    public Group draw(){
        g=new Group();
        buildShape();
        for(int i=0;i<shapes.size();i++){
            g.getChildren().add((Node) shapes.get(i).draw());
        }
        return g;
    }
}
