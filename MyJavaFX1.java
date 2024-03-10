package myjavafx1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyJavaFX1 extends Application {

public void start(Stage primaryStage) {
Button btn = new Button(); //create a button.
btn.setText("Say 'Hello World'");
Scene scene = new Scene(btn, 200, 250); //create a scene

primaryStage.setTitle("MyJavaFX"); //set stage title
primaryStage.setScene(scene); //place scene in the stage
primaryStage.show(); //Display the scene
}
public static void main(String[] args) {
Application.launch(args);
}

}