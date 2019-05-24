package com.cs2019.risk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application{

    public void start(Stage stage) throws Exception {

	FXMLLoader loader = new FXMLLoader(getClass().getResource("title.fxml"));
	Parent root = loader.load();
	Scene scene = new Scene(root, 640, 480);
	stage.setTitle("START SCREEN");
	stage.setScene(scene);
	stage.show();
	}




    }
