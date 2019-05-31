package Negocio.ComprobadorSintactico;

public class ComprobadorSintacticoImp extends ComprobadorSintactico {

	@Override
	public boolean idCorrect(String id) {
		
		if(isNumeric(id)){
			return true;
		}else return false;
	}

	@Override
	public boolean nombreCorrect(String nombre) {

		if(isAlphabetic(nombre)){
			return true;
		}else return false;
	}

	@Override
	public boolean DNICorrect(String DNI) {

		if(isValidoDNI(DNI)){
			return true;
		}else return false;
	}



	public  boolean isNumeric(String cadena){

		boolean okele = false;
			try {
				Integer.parseInt(cadena);
				okele = true;
			
		}catch(NumberFormatException e){
			okele=false;

		}

		return okele;

	}
	
	public  boolean isAlphabetic(String cadena){
		return !cadena.equals("") && cadena !=null && cadena.matches("^[a-zA-Z]*$");
	}
	
	public boolean isValidoDNI(String cadena){
		String letraMayus="";
		
		if(cadena.length()!=9 || Character.isLetter(cadena.charAt(8))==false){
			return false;
		}
		letraMayus= cadena.substring(8).toUpperCase();
		
		if(soloNumeros(cadena)== true && letraDNI(cadena).equals(letraMayus)){
			return true;
		}else
			return false;
		
		
	}

	private Object letraDNI(String cadena) {
		int miDNI = Integer.parseInt(cadena.substring(0, 8));
		int resto =0;
		String miLetra="";
		String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		resto=miDNI %23;
		
		miLetra=letra[resto];
		
		return miLetra;
	}

	private boolean soloNumeros(String cadena) {
		// TODO Auto-generated method stub
		int i, j =0;
		String numero ="";
		String miDNI="";
		String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};
		
		
		for(i=0; i< cadena.length();i++){
			numero = cadena.substring(i, i+1);
			
			for(j=0; j < unoNueve.length; j++){
				if(numero.equals(unoNueve[j])){
					miDNI += unoNueve[j];
				}
				
			}
		}
		if(miDNI.length() != 0){
			return false;
		}else
			return true;
	}
	


}
