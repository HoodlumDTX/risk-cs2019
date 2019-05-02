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

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();

        // StackPane
        stackPane = new StackPane();

    }

    private void changeTop() {
        ObservableList<Node> childs = this.stackPane.getChildren();

        if (childs.size() > 1) {
            //
            Node topNode = childs.get(childs.size()-1);
            topNode.toBack();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
