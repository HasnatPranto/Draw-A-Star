package sample;

public class Flag extends Composite{

    int height,width,x,y;

    public Flag(int width,int height,int x, int y){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
    }
    @Override
    void buildShape() {

        shapes.add(new Rectangle(x,y,height,width));
        shapes.add(new Circles(x+(width/2),y+(height/2),width/5));
    }
}
