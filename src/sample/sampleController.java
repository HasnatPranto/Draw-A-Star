package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class sampleController {

    Group group;

    @FXML
    private TextField textField_x1;
    @FXML
    private TextField textField_y1;
    @FXML
    private TextField textField_x2;
    @FXML
    private TextField textField_y2;
    @FXML
    private TextField textField_a;
    @FXML
    private TextField textField_b;
    @FXML
    private TextField textField_rad;
    @FXML
    private TextField textField_base;
    @FXML
    private TextField textField_heightTri;
    @FXML
    private TextField textField_width;
    @FXML
    private TextField textField_heightFlag;
    @FXML
    private TextField textField_apexX;
    @FXML
    private TextField textField_apexY;
    @FXML
    private TextField textField_apexXstar;
    @FXML
    private TextField textField_apexYstar;
    @FXML
    private TextField textField_topleftX;
    @FXML
    private TextField textField_topleftY;

    public void setTextField_apexX(TextField textField_apexX) {
        this.textField_apexX = textField_apexX;
    }

    public void setTextField_apexY(TextField textField_apexY) {
        this.textField_apexY = textField_apexY;
    }

    public void setTextField_topleftX(TextField textField_topleftX) {
        this.textField_topleftX = textField_topleftX;
    }

    public void setTextField_topleftY(TextField textField_topleftY) {
        this.textField_topleftY = textField_topleftY;
    }

    public void setTextField_x1(TextField textField_x1) {
        this.textField_x1 = textField_x1;
    }

    public void setTextField_y1(TextField textField_y1) {
        this.textField_y1 = textField_y1;
    }

    public void setTextField_x2(TextField textField_x2) {
        this.textField_x2 = textField_x2;
    }

    public void setTextField_y2(TextField textField_y2) {
        this.textField_y2 = textField_y2;
    }

    public void setTextField_a(TextField textField_a) {
        this.textField_a = textField_a;
    }

    public void setTextField_b(TextField textField_b) {
        this.textField_b = textField_b;
    }

    public void setTextField_rad(TextField textField_rad) {
        this.textField_rad = textField_rad;
    }

    public void setTextField_base(TextField textField_base) {
        this.textField_base = textField_base;
    }

    public void setTextField_heightTri(TextField textField_heightTri) {
        this.textField_heightTri = textField_heightTri;
    }

    public void setTextField_width(TextField textField_width) {
        this.textField_width = textField_width;
    }

    public void setTextField_heightFlag(TextField textField_heightFlag) {
        this.textField_heightFlag = textField_heightFlag;
    }

    public void setTextField_apexXstar(TextField textField_apexXstar) {
        this.textField_apexXstar = textField_apexXstar;
    }

    public void setTextField_apexYstar(TextField textField_apexYstar) {
        this.textField_apexYstar = textField_apexYstar;
    }

    public void display(Group g){
        Stage secondStage= new Stage();
        Scene scene = new Scene(group, 550, 550);
        secondStage.setScene(scene);
        secondStage.show();
    }
    public void drawLine(){

        int x1,x2,y1,y2;
        group=new Group();

        x1=Integer.parseInt(textField_x1.getText());
        y1=Integer.parseInt(textField_y1.getText());
        x2=Integer.parseInt(textField_x2.getText());
        y2=Integer.parseInt(textField_y2.getText());

        ishape line=new Lines(x1,x2,y1,y2);

        group.getChildren().add(line.draw());
        display(group);
    }
    public void drawCircle(){

        int a,b,rad;
        group=new Group();

        a=Integer.parseInt(textField_a.getText());
        b=Integer.parseInt(textField_b.getText());
        rad=Integer.parseInt(textField_rad.getText());

        ishape circles=new Circles(a,b,rad);
        group.getChildren().add(circles.draw());
        display(group);
    }

    public void drawTriangle(){
        group=new Group();

        int base,height,x,y;
        x=Integer.parseInt(textField_apexX.getText());
        y=Integer.parseInt(textField_apexY.getText());
        base=Integer.parseInt(textField_base.getText());
        height=Integer.parseInt(textField_heightTri.getText());

        ishape triangle= new Triangle(x,y,base,height);
        group=(Group) triangle.draw();
        display(group);
    }
    public void drawFlag(){

        group=new Group();

        int width,height,x,y;
        width=Integer.parseInt(textField_width.getText());
        height=Integer.parseInt(textField_heightFlag.getText());
        x=Integer.parseInt(textField_topleftX.getText());
        y=Integer.parseInt(textField_topleftY.getText());

        ishape flag= new Flag(width,height,x,y);
        group= (Group) flag.draw();
        display(group);
    }

    public void drawStar(){
        group=new Group();
        int x,y;
        x=Integer.parseInt(textField_apexXstar.getText());
        y=Integer.parseInt(textField_apexYstar.getText());

        ishape star= new Star(x,y);
        group= (Group) star.draw();
        display(group);
    }
}
