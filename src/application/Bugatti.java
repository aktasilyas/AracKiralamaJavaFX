package application;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Bugatti {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane homeferrari;

    @FXML
    private JFXButton ferrari812;

    @FXML
    private FontAwesomeIconView close;

    @FXML
    void Chiron2017(ActionEvent event) {
    	 Alert alert=new Alert(AlertType.CONFIRMATION);
         alert.setTitle("Chiron ");
         alert.setHeaderText("Chiron Ozellikleri");
         alert.setContentText("Marka	Bugatti\r\n" + 
         		"Model	Chiron\r\n" + 
         		"Nesil	Chiron\r\n" + 
         		"Modifikasyonu (Motor)	8.0 W16 (1500 Hp) AWD DSG\r\n" + 
         		"Üretim baþlangýç yýlý	2016 yýl\r\n" + 
         		"Güç ünitesi mimarisi	Ýçten yanmalý motor\r\n" + 
         		"Gövde tipi	Coupe\r\n" + 
         		"Koltuk	2\r\n" + 
         		"Kapý	2\r\n" + 
         		"");
         alert.show();
    }

    @FXML
    void Chiron2020(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Chiron ");
        alert.setHeaderText("Chiron Ozellikleri");
        alert.setContentText("Marka	Bugatti\r\n" + 
        		"Model	Chiron\r\n" + 
        		"Nesil	Chiron\r\n" + 
        		"Modifikasyonu (Motor)	8.0 W16 (1500 Hp) AWD DSG\r\n" + 
        		"Üretim baþlangýç yýlý	2016 yýl\r\n" + 
        		"Güç ünitesi mimarisi	Ýçten yanmalý motor\r\n" + 
        		"Gövde tipi	Coupe\r\n" + 
        		"Koltuk	2\r\n" + 
        		"Kapý	2\r\n" + 
        		"");
        alert.show();
    }

    @FXML
    void Close(MouseEvent event) {
    	close.getScene().getWindow().hide();
    }

    @FXML
    void Veyron2010(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Chiron ");
        alert.setHeaderText("Chiron Ozellikleri");
        alert.setContentText("Marka	Bugatti\r\n" + 
        		"Model	Chiron\r\n" + 
        		"Nesil	Chiron\r\n" + 
        		"Modifikasyonu (Motor)	8.0 W16 (1500 Hp) AWD DSG\r\n" + 
        		"Üretim baþlangýç yýlý	2016 yýl\r\n" + 
        		"Güç ünitesi mimarisi	Ýçten yanmalý motor\r\n" + 
        		"Gövde tipi	Coupe\r\n" + 
        		"Koltuk	2\r\n" + 
        		"Kapý	2\r\n" + 
        		"");
        alert.show();
    }


    @FXML
    void veyron2005(ActionEvent event) {
    	 Alert alert=new Alert(AlertType.CONFIRMATION);
         alert.setTitle("Veyron ");
         alert.setHeaderText("Veyron Ozellikleri");
         alert.setContentText("Bugatti Veyron 16.4 aðýrlýk : 1888000 g.\r\n" + 
         		"Bugatti Veyron 16.4 geniþlik : 1998 mm.\r\n" + 
         		"Bugatti Veyron 16.4 yükseklik : 1159 mm.\r\n" + 
         		"Bugatti Veyron 16.4 Çift-debriyaj transmisyonu vardýr : Mevcut.\r\n" + 
         		"Bugatti Veyron 16.4 silindir sayýsý : 16.\r\n" + 
         		"Bugatti Veyron 16.4 Bluetooth mevcut : Mevcut.\r\n" + 
         		"Bugatti Veyron 16.4 hýzlanma (0-100) : 2,5 s.");
         alert.show();
    }

    @FXML
    void initialize() {
      

    }
}
