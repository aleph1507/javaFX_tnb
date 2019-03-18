package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    TreeView<String> tree;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("treeview");

        TreeItem<String> root = new TreeItem<String>(), branch1, branch2;
        root.setExpanded(true);

        //branch1

        branch1 = makeBranch("Branch1", root);
        makeBranch("thenewboston", branch1);
        makeBranch("youtube", branch1);
        makeBranch("tomatoes", branch1);

        //branch2

        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if(oldValue != null) System.out.println(oldValue.getValue() + " -> " + newValue.getValue());
            else if(newValue != null) System.out.println(newValue.getValue());
        });

        branch2 = makeBranch("Branch2", root);
        makeBranch("glitter", branch2);
        makeBranch("makeup", branch2);

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }

    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<String>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
