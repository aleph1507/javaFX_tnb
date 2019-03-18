package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConfirmBox {

    private static boolean response;

    public static boolean display(String title, String message) {
        Stage stage = new Stage();
        Button yesBtn = new Button("yes");
        Button noBtn = new Button("no");

        yesBtn.setOnAction(e -> {
            response = true;
            stage.close();
        });

        noBtn.setOnAction(e -> {
            response = false;
            stage.close();
        });

        Label label = new Label("Are you sure?");

        VBox layout = new VBox(10);

        layout.getChildren().addAll(label, yesBtn, noBtn);

        stage.setScene(new Scene(layout, 300, 300));
        stage.showAndWait();

        return response;
    }
}
