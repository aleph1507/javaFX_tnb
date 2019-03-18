package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Button btn1 = new Button("go to scene 2");
        Button btn2 = new Button("go to scene 1");

        Label label1 = new Label("The first scene");
        Label label2 = new Label("The second scene");

        btn1.setOnAction(e -> window.setScene(scene2));

        //layout 1 - vertical column

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, btn1);

        scene1 = new Scene(layout1, 200, 200);

        btn2.setOnAction(e -> window.setScene(scene1));

        //layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(label2, btn2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Title");
        window.show();

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
