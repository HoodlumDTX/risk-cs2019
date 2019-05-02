package com.cs2019.risk;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private StackPane stackPane;
    private Game risk;
    private Button closeButton;
    Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
      Button p = new Button();
      p.setText("hehehe");
      VBox change = new VBox();
      StackPane stackPane2 = new StackPane();
      stackPane2.getChildren().add(p);
      change.getChildren().add(stackPane2);
      final Scene scene2 = new Scene(change);
        VBox title = new VBox();
        Button h = new Button();
        h.setText("Change");
        h.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                changeScene(scene2);
            }
        });
        // StackPane
        closeButton = new Button();
        closeButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                closeButtonAction();
            }
        });

        stackPane = new StackPane();
       title.getChildren().add(stackPane);
       stackPane.getChildren().add(closeButton);
       stackPane.getChildren().add(h);
       Scene scene = new Scene(title);
       primaryStage.setTitle("Hello World!");
       primaryStage.setScene(scene);
       primaryStage.show();

    }

    private void closeButtonAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) closeButton.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}

    private void changeScene(Scene x) {
          primaryStage.setScene(x);

        }

    public static void main(String[] args) {
        launch(args);
    }

}
