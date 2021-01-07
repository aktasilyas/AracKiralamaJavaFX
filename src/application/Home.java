package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Home implements Initializable {
	@FXML
	private AnchorPane HomeAnchor;
    @FXML
    private BorderPane borderpane;
	@FXML
	private JFXButton  ferrari;
    @FXML
    private AnchorPane homeferrari;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
    @FXML
    void ferrariAction(ActionEvent event) {
    	
    	try {
			AnchorPane pane=FXMLLoader.load(getClass().getResource("Ferrrari.fxml"));
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    @FXML
    void Bugatti(ActionEvent event) {
    	try {
			AnchorPane pane=FXMLLoader.load(getClass().getResource("Bugatti.fxml"));
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void Hyundai(ActionEvent event) {
    	try {
			AnchorPane pane=FXMLLoader.load(getClass().getResource("Hyundai.fxml"));
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void Porche(ActionEvent event) {
    	try {
			AnchorPane pane=FXMLLoader.load(getClass().getResource("Porche.fxml"));
			Stage stage=new Stage();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
   

}
