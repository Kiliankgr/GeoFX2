package dad.javafx.geofx;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;



public class GeoFXConnection {

	public GeoFXConnection() {
		Unirest.setObjectMapper(new UnirestObjectMapper());
	}
	public String Consulta(String fields) throws UnirestException {
		String latitud;
		latitud=Unirest.get("http://api.ipapi.com/check?access_key=405b402f71d9153c402ce063abbedd3f&fields="+fields)
				.asObject(String.class).getBody();//el check comprueba nuestra propia ip de salida
		return latitud;
	}
	public String Consulta(String ip,String fields) throws UnirestException {
		String latitud;
		latitud=Unirest.get("http://api.ipapi.com/"+ip+"?access_key=405b402f71d9153c402ce063abbedd3f&fields="+fields)
				.asObject(String.class).getBody();
		return latitud;
	}
}
