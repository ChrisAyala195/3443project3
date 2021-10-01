package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public interface EventHandler{

    @FXML
    void btnTopLeftPress(ActionEvent event);
    
    @FXML
    void btnTopRightPress(ActionEvent event);
    
    @FXML
    void btnBottomLeftPress(ActionEvent event);
    
    @FXML
    void btnBottomRightPress(ActionEvent event);
    
    
}
