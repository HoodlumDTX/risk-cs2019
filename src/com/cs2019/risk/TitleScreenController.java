package com.cs2019.risk;



import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TitleScreenController {
    
    @FXML
    private Button exitButton;
    
    @FXML
    private Button startButton;
    
    @FXML
    protected void handleExitButtonAction(ActionEvent action){
	Platform.exit();
    }
    
    @FXML
    protected void handleStartButtonAction(ActionEvent action) throws IOException{
	Parent riskViewParent = FXMLLoader.load(getClass().getResource("Risk.fxml"));
	Scene riskViewScene = new Scene(riskViewParent);
	
	Stage window = (Stage) (((Node) action.getSource()).getScene().getWindow());
	window.setScene(riskViewScene);
	window.show();
    }
    
   
}
