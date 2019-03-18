package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("closing properly");
        button = new Button("Close program");
        button.setOnAction(e->closeProgram());

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }

    private void closeProgram() {
        boolean confirm = ConfirmBox.display("close", "are you sure?");
        if(confirm) {
            System.out.println("File is saved");
            window.close();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
