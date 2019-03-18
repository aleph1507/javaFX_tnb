package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("checkboxes");

        CheckBox box1 = new CheckBox("ketchup");
        CheckBox box2 = new CheckBox("tomato");
        box2.setSelected(true);

        button = new Button("order now");
        button.setOnAction(e-> handleOptions(box1, box2));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(box1, box2, button);

        scene = new Scene(layout);
        window.setScene(scene);
        window.show();

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }

    private void handleOptions(CheckBox b1, CheckBox b2) {
        String message = "";

        if(b1.isSelected()){
            message += "ketchup\n";
        }

        if(b2.isSelected()){
            message += "tomatoes\n";
        }

        System.out.println(message);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
