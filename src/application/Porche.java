package application;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;


public class Porche {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private FontAwesomeIconView close;

    @FXML
    void Close(MouseEvent event) {
    	close.getScene().getWindow().hide();
    }

    @FXML
    void Porche911(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("(911 s ");
        alert.setHeaderText("911 S Ozellikleri");
        alert.setContentText("Versiyon Adý	911 S\\r\\n\" + \r\n" + 
        		"        		\"Motor Tipi	Dizel\\r\\n\" + \r\n" + 
        		"        		\"Vites Tipi	Manuel\\r\\n\" + \r\n" + 
        		"        		\"Kasa Tipi	Coupe\\r\\n\" + \r\n" + 
        		"        		\"Motor Hacmi	3.8\\r\\n\" + \r\n" + 
        		"        		\"Segment	S Segmenti\\r\\n\" + \r\n" + 
        		"        		\"Yakýt Tüketimi	11.5 lt / 100km\\r\\n\" + \r\n" + 
        		"        		\"Güç	261 Kw\\r\\n\" + \r\n" + 
        		"        		\"Tork	400\\r\\n\" + \r\n" + 
        		"        		\"Çekiþ	Arkadan Ýtiþ\\r\\n\" + \r\n" + 
        		"        		\"Aðýrlýk	1495 Kg\\r\\n\" + \r\n" + 
        		"        		\"Yük kapasitesi	1820 Kg\\r\\n\" + \r\n" + 
        		"        		\"Son Sürat	293 km/s\\r\\n\" + \r\n" + 
        		"        		\"0-100 hýzlanma deðeri	4.8 sn\\r\\n\" + \r\n" + 
        		"        		\"CO2 emisyon deðeri	250 g/km");
        alert.show();
    }

    @FXML
    void PorcheCarrera(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Carera ");
        alert.setHeaderText("Carera Ozellikleri");
        alert.setContentText("Versiyon Adý	CARRERA S\r\n" + 
        		"Motor Tipi	Benzin\r\n" + 
        		"Vites Tipi	Manuel\r\n" + 
        		"Kasa Tipi	Coupe\r\n" + 
        		"Motor Hacmi	3.8\r\n" + 
        		"Segment	S Segmenti\r\n" + 
        		"Yakýt Tüketimi	11.5 lt / 100km\r\n" + 
        		"Güç	261 Kw\r\n" + 
        		"Tork	400\r\n" + 
        		"Çekiþ	Arkadan Ýtiþ\r\n" + 
        		"Aðýrlýk	1495 Kg\r\n" + 
        		"Yük kapasitesi	1820 Kg\r\n" + 
        		"Son Sürat	293 km/s\r\n" + 
        		"0-100 hýzlanma deðeri	4.8 sn\r\n" + 
        		"CO2 emisyon deðeri	250 g/km");
        alert.show();
    }



    @FXML
    void initialize() {
       

    }
}
