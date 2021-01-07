package application;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Ferrari {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private AnchorPane homeferrari;
    @FXML
    private FontAwesomeIconView close;
    
    @FXML
    private JFXButton ferraripista;

    @FXML
    private JFXButton ferrariportofino;

    @FXML
    private JFXButton ferrarif12;

    @FXML
    private JFXButton ferrari812;
    @FXML
    private Label lblpista;

    @FXML
    void Close(MouseEvent event) {
    	close.getScene().getWindow().hide();

    }
    @FXML
    void fPista(MouseEvent event) {
         Alert alert=new Alert(AlertType.CONFIRMATION);
         alert.setTitle("Ferrari F8");
         alert.setHeaderText("F8 Ozellikleri");
         alert.setContentText("\"8.575.000 TL\n" + 
         		"		\"MARKA	: FERRARI\n" + 
         		"		\"MODEL	: 488\n" + 
         		"		\"MODEL YILI	: 2020\n" + 
         		"		\"K�LOMETRE	: 0 KM\n" + 
         		"		\"MOTOR HACM�	: 3902\n" + 
         		"		\"MOTOR G�C�	: 720\n" + 
         		"		\"YAKIT	: BENZ�N\n" + 
         		"		\"TORK	: 770\n" + 
         		"		\"V�TES	: OTOMAT�K\n" + 
         		"		\"G�VDE T�P�	: SPOR ARA�LAR\n" + 
         		"		\"DI� RENK	: ROSSO CORSA\n" + 
         		"		\"�� RENK	: NERO\n" + 
         		"		\"D��EME	: ALCANTARAr\n" + 
         		"		\"KAPLAMA	: CARBON\n" + 
         		"		\"KONUMU	: YEN�K�Y SHOWROOM\"");
         alert.show();
    }
    @FXML
    void f12Berlinetta(ActionEvent event) {
    	 Alert alert=new Alert(AlertType.CONFIRMATION);
         alert.setTitle("Berlinetta ");
         alert.setHeaderText("Berlinetta Ozellikleri");
         alert.setContentText("2.800.000 TL\r\n" + 
         		"MARKA	: FERRARI\r\n" + 
         		"MODEL	: F12\r\n" + 
         		"MODEL YILI	: 2012\r\n" + 
         		"K�LOMETRE	: 18.000 KM\r\n" + 
         		"MOTOR HACM�	: 6262\r\n" + 
         		"MOTOR G�C�	: 740\r\n" + 
         		"YAKIT	: BENZ�N\r\n" + 
         		"TORK	: 690\r\n" + 
         		"V�TES	: OTOMAT�K\r\n" + 
         		"G�VDE T�P�	: SPOR ARA�LAR\r\n" + 
         		"DI� RENK	: NERO DAYTONA\r\n" + 
         		"�� RENK	: TABA\r\n" + 
         		"D��EME	: DER�\r\n" + 
         		"KAPLAMA	: ALUMINYUM\r\n" + 
         		"KONUMU	: �ZM�R SHOWROOM");
         alert.show();

    }
    @FXML
    void portofino(MouseEvent event) {
    	 Alert alert=new Alert(AlertType.CONFIRMATION);
         alert.setTitle("Portoforino ");
         alert.setHeaderText("Portoforino Ozellikleri");
         alert.setContentText("4.625.000 TL\r\n" + 
         		"MARKA	: FERRARI\r\n" + 
         		"MODEL	: PORTOFINO\r\n" + 
         		"MODEL YILI	: 2020\r\n" + 
         		"K�LOMETRE	: 0 KM\r\n" + 
         		"MOTOR HACM�	: 3855\r\n" + 
         		"MOTOR G�C�	: 600\r\n" + 
         		"YAKIT	: BENZ�N\r\n" + 
         		"TORK	: 760\r\n" + 
         		"V�TES	: OTOMAT�K\r\n" + 
         		"G�VDE T�P�	: SPOR ARA�LAR\r\n" + 
         		"DI� RENK	: NERO DAYTONA\r\n" + 
         		"�� RENK	: KAHVE\r\n" + 
         		"D��EME	: DER�\r\n" + 
         		"KAPLAMA	: ALUMINYUM\r\n" + 
         		"KONUMU	: YEN�K�Y SHOWROOM");
         alert.show();

    }

    @FXML
    void initialize() {
    	

    }
   
}
