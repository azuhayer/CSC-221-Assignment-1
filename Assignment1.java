import javafx.application.Application;
import java.lang.Math;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Assignment1 extends Application
{

    @Override
    public void start(Stage stage)
    {

        int x = 600;            //length of canvas
        int y = 600;            //width of canvas

        double w = 400;         //Width of Oval
        double h = 400;         //Height of Oval

        stage.setTitle("CSC221 Assignment 1 By Zuhayer Alvi");

        //Creating new Canvas
        Canvas cv = new Canvas(x,y);
        GraphicsContext GC = cv.getGraphicsContext2D();
        Pane root = new Pane();
        root.getChildren().add(cv);
        stage.setScene(new Scene(root));
        stage.show();

        //Point Creations for shapes
        MyPoint p1 = new MyPoint(x / 2, y / 2, MyColor.BLACK);
        MyPoint p2 = new MyPoint((x / 2) - ((w / 2) / Math.sqrt(2)), (y / 2) - ((h / 2) / Math.sqrt(2)), MyColor.BLACK);
        MyPoint p3 = new MyPoint((x / 2) - ((w / 2) / 2), (y / 2) - ((h / 2) / 2), MyColor.BLACK);

        //Rectangle Creations
        MyRectangle r1 = new MyRectangle(p2, (w / 2) * Math.sqrt(2), (h / 2) * Math.sqrt(2), MyColor.VERYSOFTCYAN);
        MyRectangle r2 = new MyRectangle(p3, w/2, h/2, MyColor.MOSTLYDESATURATEDDARKBLUE);

        //Oval Creations
        MyOval o1 = new MyOval(h, w, p1, MyColor.VERYDARKGRAYISHRED);
        MyOval o2 = new MyOval(h / Math.sqrt(2), w / Math.sqrt(2), p1, MyColor.SLIGHTLYDESATURATEDCYAN);
        MyOval o3 = new MyOval(h/2, w/2 , p1, MyColor.LIGHTGRAYISHCYAN);

        //Draw the shapes onto the canvas in respective order:
        o1.draw(GC);
        r1.draw(GC);
        o2.draw(GC);
        r2.draw(GC);
        o3.draw(GC);

    }

    public static void main(String[] args)
    {
        launch();
    }
}
