package sample;

public class Triangle extends Composite{
    int x,y,base,height;
    static boolean ul=false;

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    void buildShape() {
        if(ul){
            buildShapeUlta();
        }
        else {
            shapes.add(new Lines(x, (x - base / 2), y, y + height));
            shapes.add(new Lines(x, x + base / 2, y, y + height));
            shapes.add(new Lines(x - base / 2, x + base / 2, y + height, y + height));
            ul = true;
        }
    }
    void buildShapeUlta(){

        shapes.add(new Lines(x,(x-base/2),y,y-height));
        shapes.add(new Lines(x,x+base/2,y,y-height));
        shapes.add(new Lines(x-base/2,x+base/2,y-height,y-height));
        ul=false;
    }
}
