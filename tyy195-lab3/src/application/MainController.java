package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController implements EventHandler{

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
	public void btnTopLeftPress(ActionEvent event) {
    	Avenger a = new Avenger("dummyName");
    	try {
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv");
			textTopLeft.setText(newList.get(0).toString());
			textTopLeft.setEditable(false);
			textTopLeft.isEditable();
			textTopRight.clear();
			textBottomLeft.clear();
			textBottomRight.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
    @FXML
    public void btnTopRightPress(ActionEvent event) {
    	Avenger a = new Avenger("dummyName");
    	try {
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv");
			textTopRight.setText(newList.get(1).toString());
			textTopRight.setEditable(false);
			textTopLeft.clear();
			textBottomLeft.clear();
			textBottomRight.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }

    @FXML
    public void btnBottomLeftPress(ActionEvent event) {
    	Avenger a = new Avenger("dummyName");
    	try {
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv");
			textBottomLeft.setText(newList.get(2).toString());
			textBottomLeft.setEditable(false);
			textTopLeft.clear();
			textTopRight.clear();
			textBottomRight.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    public void btnBottomRightPress(ActionEvent event) {
    	Avenger a = new Avenger("dummyName");
    	try {
    		ArrayList<Avenger> newList = a.loadAvengers("data.csv");
			textBottomRight.setText(newList.get(3).toString());
			textBottomRight.setEditable(false);
			textTopLeft.clear();
			textTopRight.clear();
			textBottomLeft.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
