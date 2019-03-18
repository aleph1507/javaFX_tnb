package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application /*implements EventHandler<ActionEvent>*/ {

    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("title of the window");
        button = new Button("Click me");

//        button.setOnAction(this);

//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("clicked");
//            }
//        });

        button.setOnAction(e -> System.out.println("clicked"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 1000,500);

        primaryStage.setScene(scene);
        primaryStage.show();
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    /*@Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button) {
            System.out.println("IIIIIIIiiiiiiiiiiiiiwaaaaaaaaaaaaaa");
        }
    }*/
}
