package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    private static boolean answer;

    public static boolean display(String title, String message) {

        Stage stage = new Stage();
//        Scene scene = new Scene();

        stage.initModality(Modality.APPLICATION_MODAL);
        Button btnY = new Button("yes");
        Button btnN = new Button("no");
        Label lbl = new Label("Are you sure?");

        btnY.setOnAction(e -> {
            answer = true;
            stage.close();
        });

        btnN.setOnAction(e -> {
            answer = false;
            stage.close();
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(lbl, btnY, btnN);
        Scene scene = new Scene(layout, 300, 300);

        stage.setScene(scene);
        stage.showAndWait();

        return answer;
    }
}
