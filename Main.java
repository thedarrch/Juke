import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class Main extends Application {

    // create button object(s)
    Button button1;

     public static void main(String [] args) {

          // allows program to be javaFX application
          // from Application class
          // calls Start method
          launch(args);
     }

     @Override
     public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("DarryBoi.exe");

         // instantinaitae...(welp can't spell).. button
         button1 = new Button();

         // initialize button with a string object
         button1.setText("I'm a miz");

         // before displaying anything, we
         // need a layout + scene

         // positions button in the middle
         Pane layout1 = new Pane();


         // scene dimensions
         short WIDTH = 500;
         short HEIGHT = 500;
        Scene scene1 = new Scene(layout1, WIDTH, HEIGHT);

         layout1.getChildren().add(button1);
         button1.setLayoutX(WIDTH/2f - 25);
         button1.setLayoutY(150f);


         // place scene in stage
         primaryStage.setScene(scene1);
         // display window/stage
         primaryStage.show();

         // new canvas
         Circle darryboi = new Circle(10, 10, 10,Color.BLUEVIOLET);
         darryboi.setLayoutX(WIDTH/2f);
         darryboi.setLayoutY(HEIGHT/2f);
         darryboi.setRadius(50.0f);
         layout1.getChildren().add(darryboi);
         primaryStage.show();
         



    //

     }




}
