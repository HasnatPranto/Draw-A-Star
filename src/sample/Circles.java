package sample;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Circles implements ishape{

    int a,b,rad;

    public Circles(int a, int b, int rad) {
        this.a = a;
        this.b = b;
        this.rad = rad;
    }
    public Circle draw(){

        Circle circle= new Circle(a,b,rad,Color.RED);
        return circle;
    }
}
