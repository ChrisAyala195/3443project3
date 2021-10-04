/******************************************************************************
 * 	       	          	   	Chris Ayala                     			      *
 * 								Tyy195	    								  *
 * 								Lab 3										  *
 * 				Contains 2 versions. One of them is commented out.			  *
 * 	I left comments which lines would need to be changed to change versions.  *
 ******************************************************************************/
package application.controller;

import java.io.IOException;
import java.util.ArrayList;

import application.model.Avenger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    private Button btnTopLeft;

    @FXML
    private TextArea textBottomLeft;

    @FXML
    private TextArea textTopLeft;

    @FXML
    private Button btnTopRight;

    @FXML
    private TextArea textTopRight;

    @FXML
    private Button btnBottomRight;

    @FXML
    private TextArea textBottomRight;

    @FXML
    private Button btnBottomLeft;

    @FXML
    //handle method for the top left button. Currently holding captain america's image.
    //when the button is clicked, the avenger information is output to the text area below it
	public void btnTopLeftPress(ActionEvent event) {
    	
    	//instantiate a new avenger object so i can access its methods
    	Avenger a = new Avenger("");
    	
    	try {
    		
    		//creates an arraylist an uses list returned by the loadAvengers method
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv"); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION*****************
    		//outputs the data from list index 0 to the text box under the image
			textTopLeft.setText(newList.get(0).toString()); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION*********************
			
			//uses avenger object a to return a specific avenger in the csv file matched by the name parameter passed
    		//a = a.loadAvengers("data.csv", "captain america"); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION*******************
			//the proper avenger object is then output to the text area below the image
    		//textTopLeft.setText(a.toString()); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION*****************
			
			//makes the text-area non-editable once the data is output into it
			textTopLeft.setEditable(false);
			
			//when the button is clicked, all other text areas are cleared
			textTopRight.clear();
			textBottomLeft.clear();
			textBottomRight.clear();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
    //handle method for the top right button. Currently holding hulk's image.
    //when the button is clicked, the avenger information is output to the text area below it
    @FXML
    public void btnTopRightPress(ActionEvent event) {
    	
    	//instantiate a new avenger object so i can access its methods
    	Avenger a = new Avenger("");
    	
    	try {
    		
    		//creates an arraylist an uses list returned by the loadAvengers method
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv"); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION**********************
    		
    		//outputs the data from list index 1 to the text box under the image
			textTopRight.setText(newList.get(1).toString()); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION******************
			
			//uses avenger object a to return a specific avenger in the csv file matched by the name parameter passed
    		//a = a.loadAvengers("data.csv", "hulk"); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION**********************
			//the proper avenger object is then output to the text area below the image
    		//textTopRight.setText(a.toString()); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION********************
			
			//makes the text-area non-editable once the data is output into it
			textTopRight.setEditable(false);
			
			//when the button is clicked, all other text areas are cleared
			textTopLeft.clear();
			textBottomLeft.clear();
			textBottomRight.clear();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }

    //handle method for the bottom left button. Currently holding Thor's image.
    //when the button is clicked, the avenger information is output to the text area below it
    @FXML
    public void btnBottomLeftPress(ActionEvent event) {
    	
    	//instantiate a new avenger object so i can access its methods
    	Avenger a = new Avenger("");
    	
    	try {
    		
    		//creates an arraylist an uses list returned by the loadAvengers method
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv"); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION***********************
    		
    		//outputs the data from list index 2 to the text box under the image
			textBottomLeft.setText(newList.get(2).toString()); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION************************
			
			//uses avenger object a to return a specific avenger in the csv file matched by the name parameter passed
    		//a = a.loadAvengers("data.csv", "god of thunder"); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION***********************
			//the proper avenger object is then output to the text area below the image
    		//textBottomLeft.setText(a.toString()); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION****************************
			
			//makes the text-area non-editable once the data is output into it
			textBottomLeft.setEditable(false);
			
			//when the button is clicked, all other text areas are cleared
			textTopLeft.clear();
			textTopRight.clear();
			textBottomRight.clear();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    //handle method for the bottom right button. Currently holding Black Widow's image.
    //when the button is clicked, the avenger information is output to the text area below it
    @FXML
    public void btnBottomRightPress(ActionEvent event) {
    	
    	//instantiate a new avenger object so i can access its methods
    	Avenger a = new Avenger("");
    	
    	try {
    		
    		//creates an arraylist an uses list returned by the loadAvengers method
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv"); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION**********************
    		
    		//outputs the data from list index 3 to the text box under the image
			textBottomRight.setText(newList.get(3).toString()); //COMMENT THIS LINE OUT TO CHANGE TO OTHER VERSION*************************
			
			//uses avenger object a to return a specific avenger in the csv file matched by the name parameter passed
    		//a = a.loadAvengers("data.csv", "black widow"); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION*********************
			//the proper avenger object is then output to the text area below the image
    		//textBottomRight.setText(a.toString()); //UN-COMMENT THIS LINE TO CHANGE TO OTHER VERSION***************************
			
			//makes the text-area non-editable once the data is output into it
			textBottomRight.setEditable(false); 
			
			//when the button is clicked, all other text areas are cleared
			textTopLeft.clear();
			textTopRight.clear();
			textBottomLeft.clear();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
