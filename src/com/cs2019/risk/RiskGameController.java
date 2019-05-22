package com.cs2019.risk;



import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;
public class RiskGameController {
    
    //private Country;
    @FXML
    private Button Alaska = new Country(1, new ArrayList<Integer>(Arrays.asList(2, 4, 30)), "Alaska");
    
    @FXML
    private Button NorthwestTerritory = new Country(2, new ArrayList<Integer>(Arrays.asList(1, 4, 5, 3)), "Northwest Territiory");
    
    @FXML
    private Button Greenland = new Country(3, new ArrayList<Integer>(Arrays.asList(2, 5, 6, 20)), "Greenland");
    
    @FXML
    private Button Alberta = new Country(4, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7)), "Alberta");
    
    @FXML
    private Button Ontario = new Country(5, new ArrayList<Integer>(Arrays.asList(2, 4, 7, 8, 6, 3)), "Ontario");
    
    @FXML
    private Button Quebec = new Country(6, new ArrayList<Integer>(Arrays.asList(5, 8, 3)), "Quebec");
    
    @FXML
    private Button WesternUnitedStates = new Country(7, new ArrayList<Integer>(Arrays.asList(4, 5, 8, 9)), "Western United States");
    
    @FXML
    private Button EasternUnitedStates = new Country(8, new ArrayList<Integer>(Arrays.asList(5, 6, 7, 9)), "Eastern United States");
    
    @FXML
    private Button CentralAmerica = new Country(9, new ArrayList<Integer>(Arrays.asList(7, 8, 10)), "Central America");
    
    @FXML
    private Button Venezuela = new Country(10, new ArrayList<Integer>(Arrays.asList(9, 11, 12)), "Venezuela");
    
    @FXML
    private Button Peru = new Country(11, new ArrayList<Integer>(Arrays.asList(10, 12, 13)), "Peru");
    
    @FXML
    private Button Brazil = new Country(12, new ArrayList<Integer>(Arrays.asList(10, 11, 13, 14)), "Brazil");
    
    @FXML
    private Button Argentina = new Country(13, new ArrayList<Integer>(Arrays.asList(11, 12)), "Argentina");
    
    @FXML
    private Button NorthAfrica = new Country(14, new ArrayList<Integer>(Arrays.asList(12, 15, 16, 17, 23, 26)), "North Africa");
    
    @FXML
    private Button Egypt = new Country(15, new ArrayList<Integer>(Arrays.asList(14, 16, 26, 34)), "Egypt");
    
    @FXML
    private Button EastAfrica = new Country(16, new ArrayList<Integer>(Arrays.asList(15, 14, 17, 18, 19)), "East Africa");
    
    @FXML
    private Button Congo = new Country(17, new ArrayList<Integer>(Arrays.asList(14, 16, 18)), "Congo");
    
    @FXML
    private Button SouthAfrica =  new Country(18, new ArrayList<Integer>(Arrays.asList(17, 16, 19)), "South Africa");
    
    @FXML
    private Button Madagascar = new Country(19, new ArrayList<Integer>(Arrays.asList(18, 16)), "Madagascar");
    
    @FXML
    private Button Iceland = new Country(20, new ArrayList<Integer>(Arrays.asList(3, 21, 22)), "Iceland");
    
    @FXML
    private Button GreatBritain = new Country(21, new ArrayList<Integer>(Arrays.asList(20, 22, 23, 24)), "Great Britain");
    
    @FXML
    private Button Scandinavia = new Country(22, new ArrayList<Integer>(Arrays.asList(20, 21, 24, 25)), "Scandinavia");
    
    @FXML
    private Button WesternEurope = new Country(23, new ArrayList<Integer>(Arrays.asList(21, 24, 26, 14)), "Western Europe");
    
    @FXML
    private Button NorthernEurope = new Country(24, new ArrayList<Integer>(Arrays.asList(23, 21, 22, 25, 26)), "Northern Europe");
    
    @FXML
    private Button Ukraine = new Country(25, new ArrayList<Integer>(Arrays.asList(22, 24, 26, 34, 32, 27)), "Ukraine");
    
    @FXML
    private Button SouthernEurope = new Country(26, new ArrayList<Integer>(Arrays.asList(23, 24, 25, 34, 15, 14)), "Southern Europe");
    
    @FXML
    private Button Ural = new Country(27, new ArrayList<Integer>(Arrays.asList(25, 32, 36, 28)), "Ural");
    
    @FXML
    private Button Siberia = 	new Country(28, new ArrayList<Integer>(Arrays.asList(27, 36, 33, 31, 29)), "Siberia");
    
    @FXML
    private Button Yakustk = 	new Country(29, new ArrayList<Integer>(Arrays.asList(28, 31, 30)), "Yakutsk");
    
    @FXML
    private Button Kamchatka = new Country(30, new ArrayList<Integer>(Arrays.asList(29, 31, 37, 1)), "Kamchatka");
    
    @FXML
    private Button Irkustk = new Country(31, new ArrayList<Integer>(Arrays.asList(28, 29, 30, 33)), "Irkutsk");
    
    @FXML
    private Button Afghanistan = new Country(32, new ArrayList<Integer>(Arrays.asList(25, 34, 35, 36, 27)), "Afghanistan");
    
    @FXML
    private Button Mongolia = new Country(33, new ArrayList<Integer>(Arrays.asList(36, 28, 31, 30, 37)), "Mongolia");
    
    @FXML
    private Button MiddleEast = new Country(34, new ArrayList<Integer>(Arrays.asList(15, 26, 25, 32, 35)), "Middle East");
    
    @FXML
    private Button India = new Country(35, new ArrayList<Integer>(Arrays.asList(34, 32, 36, 38)), "India");
    
    @FXML
    private Button China = new Country(36, new ArrayList<Integer>(Arrays.asList(35, 32, 27, 28, 33, 38)), "China");
    
    @FXML
    private Button Japan = new Country(37, new ArrayList<Integer>(Arrays.asList(33, 30)), "Japan");
    
    @FXML
    private Button Sidin = new Country(38, new ArrayList<Integer>(Arrays.asList(35, 36, 39)), "Sidin");
    
    @FXML
    private Button Indonesia = new Country(39, new ArrayList<Integer>(Arrays.asList(38, 40, 41)), "Indonesia");
    
    @FXML
    private Button NewGuinea = new Country(40, new ArrayList<Integer>(Arrays.asList(39, 41, 42)), "New Guinea");
    
    @FXML
    private Button WesternAustrailia = new Country(41, new ArrayList<Integer>(Arrays.asList(39, 40, 42)), "Western Australia");
    
    @FXML
    private Button EasternAustrailia = new Country(42, new ArrayList<Integer>(Arrays.asList(40, 41)), "Eastern Australia");
    
    @FXML
    private Button phaseButton;
    
    @FXML
    private void handlePhaseAction(ActionEvent action){
	Platform.exit();
    }
    
    @FXML
    private void handleCountryAction(ActionEvent action){
	System.out.println(action.getClass().getName());
	
    }
    

}
