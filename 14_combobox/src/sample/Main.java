package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("ComboBox");
        button = new Button("Submit");

        comboBox = new ComboBox<String>();
        comboBox.getItems().addAll(
                "good will hunting",
                "st. vincent",
                "blackhat"
        );

        comboBox.setPromptText("fuckitty?");

        comboBox.setEditable(true);

        button.setOnAction(e -> printMovie());

        comboBox.setOnAction(e -> System.out.println("user selected: " + comboBox.getValue()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));;
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout);
        window.setScene(scene);
        window.show();

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }

    private void printMovie() {
        System.out.println(comboBox.getValue());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
