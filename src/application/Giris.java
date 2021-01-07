package application;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

import javafx.util.Duration;

public class Giris {
	String sql="";
	Connection baglanti=null;
	PreparedStatement sorguifadesi=null;
	ResultSet resultSet=null;
	
	public Giris() {
		
		baglanti=Connections.Baglan();
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneGiris;

    @FXML
    private JFXTextField adi;

    @FXML
    private JFXPasswordField sifre;
    @FXML
    private ImageView progres;
    @FXML
    void login(ActionEvent event) {
    	
    progres.setVisible(true);
 
    	PauseTransition pauseTransition=new PauseTransition();
    	pauseTransition.setDuration(Duration.seconds(3));
    	pauseTransition.setOnFinished(e->{
    		
    		
    	});
    	pauseTransition.play();
   
		
    	sql="select *from login where Adi=? and Sifre=?";
    	
    	
	   try {
		sorguifadesi=baglanti.prepareStatement(sql);
		
		sorguifadesi.setString(1, adi.getText().trim());
		sorguifadesi.setString(2, sifre.getText().trim());
		
		resultSet=sorguifadesi.executeQuery();
		
		
		while(resultSet.next()) {
		
			if (resultSet.getString("Adi").equals(adi.getText())&&resultSet.getString("Sifre").equals(sifre.getText())) {
				try {
		     		paneGiris.getScene().getWindow().hide();
					FXMLLoader loader=new FXMLLoader(getClass().getResource("HomePage.fxml"));
					AnchorPane parent=loader.load();
					HomePage nesneHomePage=loader.getController();
					nesneHomePage.gelen(adi.getText());
					Stage login=new Stage();
					Scene scene=new Scene(parent,770,577);
					login.setScene(scene);
					login.setResizable(false);
					login.show();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	
	
    	
    	
	 
    }

    @FXML
    void signup(ActionEvent event) {
    	 progres.setVisible(true);
    	 
     	PauseTransition pauseTransition=new PauseTransition();
     	pauseTransition.setDuration(Duration.seconds(3));
     	pauseTransition.setOnFinished(ev->{
     		
     		
     		
     		
     	});
     	pauseTransition.play();
     
 		
     	try {
     		paneGiris.getScene().getWindow().hide();
			Parent parent=FXMLLoader.load(getClass().getResource("UyeOl.fxml"));
			Stage signup=new Stage();
			Scene scene=new Scene(parent);
			signup.setScene(scene);
			signup.setResizable(false);
			signup.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	

    }

    @FXML
    void initialize() {
    	progres.setVisible(false);
       

    }
}
