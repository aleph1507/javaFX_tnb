package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("CSS themes and styles");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        // name label constraints use child, column, row
        Label nameLabel = new Label("Username: ");
//        nameLabel.setStyle("-fx-text-fill: #E8E8E8");
        nameLabel.setId("bold-label");
        GridPane.setConstraints(nameLabel, 0, 0);

        // name input
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput, 1, 0);

        // password label
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);

        // password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        // login
        Button loginButton = new Button("Log In");
        loginButton.getStyleClass().add("btn");
        GridPane.setConstraints(loginButton, 1, 2);

        //sign up
        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUpButton, 1, 3);

//        loginButton.setOnAction(e -> {
//            setUserAgentStylesheet(STYLESHEET_CASPIAN);
//        });

        //add everything to grid
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signUpButton);

        Scene scene = new Scene(grid, 300, 200);
        scene.getStylesheets().add("sample/Viper.css");
        window.setScene(scene);
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
