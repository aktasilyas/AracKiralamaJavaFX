package application;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Hyundai {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane homeferrari;

 

    @FXML
    private FontAwesomeIconView close;

    @FXML
    void Close(MouseEvent event) {
    	close.getScene().getWindow().hide();
    }


    @FXML
    void h2010(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("(Accent. (1.033)  ");
        alert.setHeaderText("Accent. (1.033)  Ozellikleri");
        alert.setContentText("MOTOR. Motor Hacmi. 1.5 LT. Maksimum G�� Maksimum Tork. 133. Maksimum H�z. 181. 0-100 KM H�zlanma. 10.5 sn. ...\r\n" + 
        		"EKONOM� Yak�t T�ketim (�ehir ��i) 9.4 LT. Yak�t T�ketim (�ehir D���) 5.6 LT. Yak�t T�ketim (Ortalama) 7 LT. CO2 Sal�n�m� 168 g/km.\r\n" + 
        		"BOYUTLAR. Dingil Mesafesi. 2440 cm. Uzunluk. 4235 cm. Geni�lik. 1670 cm. Y�kseklik. 1395 cm.");
        alert.show();
    }

    @FXML
    void h2020(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Excel. (52) ");
        alert.setHeaderText("Excel. (52) Ozellikleri");
        alert.setContentText("\r\n" + 
        		"# 1.4 DOCH 16 V MPi\r\n" + 
        		"1399 cc.\r\n" + 
        		"97 beygir (6.000 dv.-dk.)\r\n" + 
        		"128 nm tork (4.700 dv.-dk.)\r\n" + 
        		"0-100 : 12.3 - Otomatik �anz�man (14.5)\r\n" + 
        		"�ehir ��i yak�t t�ketimi : 8.0 - O.� (9.5)\r\n" + 
        		"�ehir d��� yak�t t�ketimi : 5.1 O.� (5.4)\r\n" + 
        		"Karma t�ketim : 6.2 - O.� (6.9)\r\n" + 
        		"\r\n" + 
        		"# 1.5 CRDi 16 V - VGT\r\n" + 
        		"1493 cc.\r\n" + 
        		"110 beygir (4.000 dv.-dk.)\r\n" + 
        		"235 nm tork (1900-2.750 dv.-dk.)\r\n" + 
        		"0-100 : 11.5 ( Defalarca zaman tuttum 10.4-10.5 civar� ��k�yor) O.� (12.7)\r\n" + 
        		"�ehir i�i yak�t t�ketimi : 5.6 - O.� (7.7)\r\n" + 
        		"�ehir d��� yak�t t�ketimi : 4.0 - O.� (4.8)\r\n" + 
        		"Karma t�ketim : 4.6 - O.� (5.9)");
        alert.show();
    }
    



    @FXML
    void initialize() {
       

    }
}
