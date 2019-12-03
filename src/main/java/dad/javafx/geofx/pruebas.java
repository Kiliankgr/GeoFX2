package dad.javafx.geofx;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class pruebas {
public static void main(String[] args) throws UnknownHostException {

	try {
		String latitud=Unirest.get("http://api.ipapi.com/193.146.93.30?access_key=405b402f71d9153c402ce063abbedd3f&fields=latitude")
		.asObject(String.class).getBody();
		int i,pos;
		String aux="";
		for(i=0;latitud.charAt(pos=i)!=':' ;i++) {
			
		}
		for(i=pos+1;i<latitud.length()-1;i++) {
			if(latitud.charAt(i)!='\"')
			aux+=latitud.charAt(i);
		}
		System.out.println(aux);
		
	} catch (UnirestException e) {
		e.printStackTrace();
	}
}
	
}
