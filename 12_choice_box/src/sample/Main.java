package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("choicebox");

        button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<String>();

        // getItems returns an ObservableList
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");

        choiceBox.setValue("Apples");

        // listen for selection change
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(oldValue + "->" + newValue));

//        button.setOnAction(e -> getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));;
        layout.getChildren().addAll(choiceBox, button);

        scene = new Scene(layout);
        window.setScene(scene);
        window.show();

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }

//    private void getChoice(ChoiceBox<String> choiceBox) {
//        String food = choiceBox.getValue();
//        System.out.println(food);
//    }


    public static void main(String[] args) {
        launch(args);
    }
}
