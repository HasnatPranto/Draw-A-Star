package sample;

public class Rectangle extends Composite{

    int x,y,height,width;

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    void buildShape() {
        shapes.add(new Lines(x,x+width,y,y));
        shapes.add(new Lines(x+width,x+width,y,y+height));
        shapes.add(new Lines(x,x+width,y+height,y+height));
        shapes.add(new Lines(x,x,y,y+height));

    }
}
