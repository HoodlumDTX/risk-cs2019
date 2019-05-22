package com.cs2019.risk;


import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;



public class Main extends Application{
    
    public void start(Stage stage) throws Exception {
	    
	FXMLLoader loader = new FXMLLoader(getClass().getResource("title.fxml"));
	Parent root = loader.load();
	Scene scene = new Scene(root, 640, 480);
	URL resource = getClass().getResource("rsc/music/1.mp3");
	Media media = new Media(resource.toString());
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	/*for (int i = 0; i < players.size(); i++) {
	      final MediaPlayer player     = players.get(i);
	      final MediaPlayer nextPlayer = players.get((i + 1) % players.size());
	    mediaPlayer.setVolume(50);
	    mediaPlayer.play();
	    mediaPlayer.setOnEndOfMedia(new Runnable() {
	        @Override public void run() {
	            
	            mediaView.setMediaPlayer(nextPlayer);
	            nextPlayer.play();
	          }
	        });
	}*/
	stage.setTitle("START SCREEN");
	stage.setScene(scene);
	stage.show();
	
	
	
	
    }
    

}
