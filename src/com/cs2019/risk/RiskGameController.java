package com.cs2019.risk;



import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
public class RiskGameController implements Initializable{

    private int phase = -1;

    private Game risk;

    TextInputDialog dialog = new TextInputDialog();
    
    @FXML
    private StackPane pane = new StackPane();

    @FXML
    private Button Alaska = new Country(1);

    @FXML
    private Button NorthwestTerritory = new Country(2);

    @FXML
    private Button Greenland = new Country(3);

    @FXML
    private Button Alberta = new Country(4);

    @FXML
    private Button Ontario = new Country(5);

    @FXML
    private Button Quebec = new Country(6);

    @FXML
    private Button WesternUnitedStates = new Country(7);

    @FXML
    private Button EasternUnitedStates = new Country(8);

    @FXML
    private Button CentralAmerica = new Country(9);

    @FXML
    private Button Venezuela = new Country(10);

    @FXML
    private Button Peru = new Country(11);

    @FXML
    private Button Brazil = new Country(12);

    @FXML
    private Button Argentina = new Country(13);

    @FXML
    private Button NorthAfrica = new Country(14);

    @FXML
    private Button Egypt = new Country(15 );

    @FXML
    private Button EastAfrica = new Country(16 );

    @FXML
    private Button Congo = new Country(17 );

    @FXML
    private Button SouthAfrica =  new Country(18 );

    @FXML
    private Button Madagascar = new Country(19 );

    @FXML
    private Button Iceland = new Country(20 );

    @FXML
    private Button GreatBritain = new Country(21 );

    @FXML
    private Button Scandinavia = new Country(22 );

    @FXML
    private Button WesternEurope = new Country(23 );

    @FXML
    private Button NorthernEurope = new Country(24 );

    @FXML
    private Button Ukraine = new Country(25 );

    @FXML
    private Button SouthernEurope = new Country(26 );

    @FXML
    private Button Ural = new Country(27 );

    @FXML
    private Button Siberia = 	new Country(28 );

    @FXML
    private Button Yakustk = 	new Country(29 );

    @FXML
    private Button Kamchatka = new Country(30 );

    @FXML
    private Button Irkustk = new Country(31 );

    @FXML
    private Button Afghanistan = new Country(32 );

    @FXML
    private Button Mongolia = new Country(33 );

    @FXML
    private Button MiddleEast = new Country(34 );

    @FXML
    private Button India = new Country(35);

    @FXML
    private Button China = new Country(36);

    @FXML
    private Button Japan = new Country(37);

    @FXML
    private Button Sidin = new Country(38);

    @FXML
    private Button Indonesia = new Country(39);

    @FXML
    private Button NewGuinea = new Country(40);

    @FXML
    private Button WesternAustrailia = new Country(41);

    @FXML
    private Button EasternAustrailia = new Country(42);

    @FXML
    private Button phaseButton = new Button("Start Game");


    @FXML
    private void handlePhaseAction(ActionEvent action){
	if(phase == -1) {
	    update();
	    phaseButton.setText("Next Phase");
	}
	if(phase == 3){
	    phase = 0;
	}
    }

    @FXML
    private void handleCountryAction(ActionEvent action){
	//final Node source = (Node) action.getSource();
	//System.out.println(source.getId());
	System.out.println(Integer.parseUnsignedInt(dialog.getResult()));

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
	dialog.setContentText("Number: ");
	dialog.setHeaderText("Enter how many players you want. (1 - 6)");
	dialog.setTitle("Players?");
	dialog.showAndWait();
	if(Integer.parseUnsignedInt(dialog.getResult()) > 1 && Integer.parseUnsignedInt(dialog.getResult())<= 6){
	    risk = new Game(Integer.parseUnsignedInt(dialog.getResult()));
	    
	}else Platform.exit();
    }

    private void update(){
	for(Player x: risk.PS){
	    for(int y = 0; y < x.getCountries().size() - 1; y++){
		if(!(x.getCountries().get(y) == null)){
		if(x.getCountries().get(y).equals(Alaska)) {
		    Alaska = x.getCountries().get(y);
		    Alaska.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		    
		}
		if(x.getCountries().get(y).equals(NorthwestTerritory)) {
		    NorthwestTerritory = x.getCountries().get(y);
		    NorthwestTerritory.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		    
		}
		if(x.getCountries().get(y).equals(Greenland)) {
		    Greenland = x.getCountries().get(y);
		    Greenland.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		    
		}
		if(x.getCountries().get(y).equals(Alberta)) {
		    Alberta = x.getCountries().get(y);
		    Alberta.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		    
		}
		if(x.getCountries().get(y).equals(Ontario)) {
		    Ontario = x.getCountries().get(y);
		    Ontario.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		    
		}
		if(x.getCountries().get(y).equals(Quebec)) {
		    Quebec = x.getCountries().get(y);
		    Quebec.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		    
		}
		if(x.getCountries().get(y).equals(WesternUnitedStates)) {
		    WesternUnitedStates = x.getCountries().get(y);
		    WesternUnitedStates.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		   
		}
		if(x.getCountries().get(y).equals(EasternUnitedStates)) {
		    EasternUnitedStates = x.getCountries().get(y);
		    EasternUnitedStates.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(CentralAmerica)) {
		    CentralAmerica = x.getCountries().get(y);
		    CentralAmerica.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Venezuela)) {
		    Venezuela = x.getCountries().get(y);
		    Venezuela.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Peru)) {
		    Peru = x.getCountries().get(y);
		    Peru.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Brazil)) {
		    Brazil = x.getCountries().get(y);
		    Brazil.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Argentina)) {
		    Argentina = x.getCountries().get(y);
		    Argentina.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(NorthAfrica)) {
		    NorthAfrica = x.getCountries().get(y);
		    NorthAfrica.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Egypt)) {
		    Egypt = x.getCountries().get(y);
		    Egypt.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(EastAfrica)) {
		    EastAfrica = x.getCountries().get(y);
		    EastAfrica.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Congo)) {
		    Congo = x.getCountries().get(y);
		    Congo.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(SouthAfrica)) {
		    SouthAfrica = x.getCountries().get(y);
		    SouthAfrica.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Madagascar)) {
		    Madagascar = x.getCountries().get(y);
		    Madagascar.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Iceland)) {
		    Iceland = x.getCountries().get(y);
		    Iceland.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(GreatBritain)) {
		    GreatBritain = x.getCountries().get(y);
		    GreatBritain.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Scandinavia)) {
		    Scandinavia = x.getCountries().get(y);
		    Scandinavia.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(WesternEurope)) {
		    WesternEurope = x.getCountries().get(y);
		    WesternEurope.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(NorthernEurope)) {
		    NorthernEurope = x.getCountries().get(y);
		    NorthernEurope.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Ukraine)) {
		    Ukraine = x.getCountries().get(y);
		    Ukraine.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(SouthernEurope)) {
		    SouthernEurope = x.getCountries().get(y);
		    SouthernEurope.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Ural)) {
		    Ural = x.getCountries().get(y);
		    Ural.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Siberia)) {
		    Siberia = x.getCountries().get(y);
		    Siberia.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Yakustk)) {
		    Yakustk = x.getCountries().get(y);
		    Yakustk.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Kamchatka)) {
		    Kamchatka = x.getCountries().get(y);
		    Kamchatka.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Irkustk)) {
		    Irkustk = x.getCountries().get(y);
		    Irkustk.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Afghanistan)) {
		    Afghanistan = x.getCountries().get(y);
		    Afghanistan.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Mongolia)) {
		    Mongolia = x.getCountries().get(y);
		    Mongolia.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(MiddleEast)) {
		    MiddleEast = x.getCountries().get(y);
		    MiddleEast.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(India)) {
		    India = x.getCountries().get(y);
		    India.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(China)) {
		    China = x.getCountries().get(y);
		    China.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Japan)) {
		    Japan = x.getCountries().get(y);
		    Japan.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Sidin)) {
		    Sidin = x.getCountries().get(y);
		    Sidin.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(Indonesia)) {
		    Indonesia = x.getCountries().get(y);
		    Indonesia.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(NewGuinea)) {
		    NewGuinea = x.getCountries().get(y);
		    NewGuinea.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(WesternAustrailia)) {
		    WesternAustrailia = x.getCountries().get(y);
		    WesternAustrailia.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
		if(x.getCountries().get(y).equals(EasternAustrailia)) {
		    EasternAustrailia = x.getCountries().get(y);
		    EasternAustrailia.setStyle("-fx-background-color: " + x.getColorHex() + ";");
		}
	    }//closes z
	}//closes y
    }
    }


}
