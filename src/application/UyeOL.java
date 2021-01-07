package application;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;


import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class UyeOL {
	String sql="";
	Connection baglanti=null;
	PreparedStatement sorguifadesi=null;
	
	
	public UyeOL() {
		
		baglanti=Connections.Baglan();
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneSignup;

    @FXML
    private JFXTextField adi;

    @FXML
    private JFXPasswordField sifre;

    @FXML
    private JFXPasswordField sifretekrar;

    @FXML
    private JFXTextField email;
    @FXML
    private ImageView progres;

    @FXML
    void login(ActionEvent event) {
    	 progres.setVisible(true);
    	 
      	PauseTransition pauseTransition=new PauseTransition();
      	pauseTransition.setDuration(Duration.seconds(5));
      	pauseTransition.setOnFinished(ev->{
      		
      		
      		
      		
      	});
      	pauseTransition.play();
      
  		
      	try {
      		paneSignup.getScene().getWindow().hide();
 			Parent parent=FXMLLoader.load(getClass().getResource("Giris.fxml"));
 			Stage login=new Stage();
 			Scene scene=new Scene(parent);
 			login.setScene(scene);
 			login.setResizable(false);
 			login.show();
 			
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	
    	
    	
    	
    }

    @FXML
    void signup(ActionEvent event) {
    	progres.setVisible(true);
    	PauseTransition pauseTransition=new PauseTransition();
      	pauseTransition.setDuration(Duration.seconds(5));
      	pauseTransition.setOnFinished(ev->{
      		
      		
      		
      		
      	});
      	pauseTransition.play();
      	
      	sql="insert into login(Adi,Mail,Sifre) values(?,?,?)";
      	
      	String hataString="";
      	if (!(sifre.getText().equals(sifretekrar.getText()))) {
      		
      		hataString="Sifreler Farkli";
			
		}
      	if (hataString.length()==0) {
      		try {
    			sorguifadesi=baglanti.prepareStatement(sql);
    			sorguifadesi.setString(1, adi.getText().trim());
    			sorguifadesi.setString(2, email.getText().trim());
    			sorguifadesi.setString(3, sifre.getText().trim());
    			sorguifadesi.executeUpdate();
    			Alert mesAlert=new Alert(AlertType.INFORMATION);
    			mesAlert.setContentText("Uye Basarili");
    			mesAlert.show();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
          
        	
		}
      	else {
			Alert mesAlert=new Alert(AlertType.ERROR);
			mesAlert.setContentText(hataString);
			mesAlert.show();
		}
      	
    }

    @FXML
    void initialize() {
    	progres.setVisible(false);
       

    }
}
