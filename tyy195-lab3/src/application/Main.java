/******************************************************************************
 * 	       	          	   	Chris Ayala                     			      *
 * 								Tyy195	    								  *
 * 								Lab 3										  *
 * 				Contains 2 versions. One of them is commented out.			  *
 * 	I left comments which lines would need to be changed to change versions.  *
 ******************************************************************************/
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	//holds the root fxml code used to generate the application view
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//main launches the application view
	public static void main(String[] args) {
		launch(args);
	}
}
