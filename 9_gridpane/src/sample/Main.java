package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("tnb");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel = new Label("Username: ");
        GridPane.setConstraints(nameLabel,  0, 0);

        TextField nameInput = new TextField("bucky");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel,  0, 1);

        PasswordField passInput = new PasswordField();
//        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid);

        window.setScene(scene);

        window.show();

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }

    private static void confirmClose() {
        boolean answer = ConfirmBox.display("close", "close?");
        if(answer) Platform.exit();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
