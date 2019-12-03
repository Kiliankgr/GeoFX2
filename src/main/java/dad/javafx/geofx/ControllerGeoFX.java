package dad.javafx.geofx;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

import com.mashape.unirest.http.exceptions.UnirestException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class ControllerGeoFX implements Initializable{
		//Servicio
		GeoFXConnection servicio=new GeoFXConnection();
		
		// vista
		@FXML
		private TabPane view;
		
		@FXML
		private TextField ipText;
		
		@FXML
		private Button comprobarIpButton;
		
		@FXML
		private Label latitudeLabel,longitudeLabel,locationLabel,cityLabel,zipCodeLabel,languageLabel,
		timeZoneLabel,callingCodeLabel,currecyLabel;
		
		@FXML
		private TextField ipText2;
		
		@FXML
		private Button comprobarIpButton2;
		
		@FXML 
		private Label ipAddressLabel,ispLabel,typeLabel,asnLabel,hostNameLabel;
		
		@FXML
		private TextField ipText3;
		
		@FXML
		private Button comprobarIpButton3;
		
		@FXML 
		private Label securityLabel,threatLevelLabel,ThreatTypeLabel;
		
		@FXML
		private CheckBox proxyCheck,torCheck,crawlerCheck;
	public ControllerGeoFX() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/vista.fxml"));
		loader.setController(this);
		loader.load();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			
			latitudeLabel.setText(DatoJason.compilar(servicio.Consulta("latitude")));
			
			longitudeLabel.setText(DatoJason.compilar(servicio.Consulta("longitude")));
			
			locationLabel.setText(DatoJason.compilar(servicio.Consulta("country_name"))
					.concat(" ("+DatoJason.compilar(servicio.Consulta("country_code"))+")"));
			
			cityLabel.setText(DatoJason.compilar(servicio.Consulta("city"))
					.concat(" ("+DatoJason.compilar(servicio.Consulta("region_name"))+")"));
			
			zipCodeLabel.setText(DatoJason.compilar(servicio.Consulta("zip")));
			
			languageLabel.setText(DatoJason.compilar(DatoJason.compilar(servicio.Consulta("location.languages"),2)));
			
			
			timeZoneLabel.setText(DatoJason.compilar(servicio.Consulta("zip")));
			callingCodeLabel.setText("+".concat(DatoJason.compilar(servicio.Consulta("location.calling_code"),"name",2)));
				
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	private String Buscador(String field,String buscado) {//no acabado
		String json;
		int i;
		try {
			json=servicio.Consulta("languages");
			for(i=0;i<json.length();i++) {
				
			}
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public TabPane getView() {
		return view;
	}

}
