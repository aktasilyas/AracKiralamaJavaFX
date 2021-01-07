package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class HomePage implements Initializable {
	@FXML
	AnchorPane holderpane;
	

    @FXML
    private BorderPane borderpane;
	
	@FXML
	AnchorPane home;
    @FXML
    private Label lblaktar;
	
	public void gelen(String d) {
		lblaktar.setText(d);
		
	}
 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
		CreatePage();
		
	
	
		
	}
	public void setNode(Node node) {
		borderpane.setCenter(home);
		FadeTransition fadeTransition=new FadeTransition(Duration.millis(1500));
		fadeTransition.setNode(node);
		fadeTransition.setFromValue(0.1);
		fadeTransition.setToValue(1);
		fadeTransition.setCycleCount(1);
		fadeTransition.setAutoReverse(false);
		fadeTransition.play();
	}
	public void CreatePage() {
		
		try {
			home=FXMLLoader.load(getClass().getResource("Home.fxml"));
			setNode(home);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
