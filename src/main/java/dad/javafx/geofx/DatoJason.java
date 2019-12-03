package dad.javafx.geofx;

public class DatoJason {
	public static String compilar(String texto) {
		int i,pos;
		String aux="";
		for(i=0;texto.charAt(pos=i)!=':' ;i++) {
			
		}
		for(i=pos+1;i<texto.length()-1;i++) {
			if(texto.charAt(i)!='\"')
			aux+=texto.charAt(i);
		}
		return aux;
	}
	public static String compilar(String texto,int contador) {
		int i,pos=0,cont=0;
		String aux="";
		for(i=0;cont<contador;i++) {
			if(texto.charAt(pos=i)==':' )
				cont++;
		}
		
		for(i=pos+1;i<texto.length()-cont;i++) {
			if(texto.charAt(i)!='\"')
			aux+=texto.charAt(i);
		}
		return aux;
	}
	public static String compilar(String texto,String buscado,int contador) {
		int i,pos=0,cont=0;
		String aux="";
		for(i=0;cont<contador;i++) {
			if(texto.charAt(pos=i)==':' )
				cont++;
		}
		
		for(i=pos+1;i<texto.length()-cont;i++) {
			if(texto.charAt(i)!='\"')
			aux+=texto.charAt(i);
		}
		return aux;
	}
	
}
