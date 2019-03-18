package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    BorderPane layout;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("Making Menus");

        // file manu
        Menu fileMenu = new Menu("_File");

        //menu items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("Create a new File..."));

        fileMenu.getItems().add(newFile);
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit..."));

        MenuItem copyMenuItem = new MenuItem("_Copy");
        copyMenuItem.setOnAction(e -> System.out.println("Copy"));
        MenuItem pasteMenuItem = new MenuItem("Pa_ste");
        pasteMenuItem.setOnAction(e -> System.out.println("Paste"));
        pasteMenuItem.setDisable(true);

        //edit menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(copyMenuItem);
        editMenu.getItems().add(pasteMenuItem);

        //help menu
        Menu helpMenu = new Menu("_Help");
        CheckMenuItem showLineNumbersMenuItem = new CheckMenuItem("Show _Line Numbers");
        showLineNumbersMenuItem.setOnAction(e -> {
            if(showLineNumbersMenuItem.isSelected())
                System.out.println("Program will now display line numbers");
            else
                System.out.println("Program will stop displaying line numbers");
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable au_tosave");
        autoSave.setSelected(true);
        autoSave.setOnAction(e -> {
            if(autoSave.isSelected())
                System.out.println("autoSave on");
            else
                System.out.println("autoSave off");
        });
        helpMenu.getItems().addAll(showLineNumbersMenuItem, autoSave);

        //radio menu items
        Menu difficultyMenu = new Menu("_Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();
        RadioMenuItem easyMenuItem = new RadioMenuItem("_Easy");
        RadioMenuItem mediumMenuItem = new RadioMenuItem("_Medium");
        RadioMenuItem hardMenuItem = new RadioMenuItem("_Hard");
//        difficultyToggle.getToggles().addAll(easyMenuItem, mediumMenuItem, hardMenuItem);
        easyMenuItem.setToggleGroup(difficultyToggle);
        mediumMenuItem.setToggleGroup(difficultyToggle);
        hardMenuItem.setToggleGroup(difficultyToggle);
        difficultyMenu.getItems().addAll(easyMenuItem, mediumMenuItem, hardMenuItem);

        //main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 300, 400);
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
