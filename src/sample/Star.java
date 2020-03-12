package sample;

public class Star extends Composite {
    int x,y;

    public Star(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void buildShape() {
        shapes.add(new Triangle(x,y,100,80));
        shapes.add(new Triangle(x,y+100,100,80));
    }
}
