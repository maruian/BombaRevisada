public class Bomba {

	
	String paraula;
	String paraulaEncriptada;
	
	public Bomba(){
		paraula="Miguel";
		paraulaEncriptada="";
	}
	
	
	private String encriptador(String paraula){
		boolean esPrimo=true;
		int resto=0;
		int j=1;
		int l=0;
		int i=2;
		int last=0;
		int posicio=0;
		int primoenPos=0;
		String encriptada="";
		
		for (posicio=0; posicio<paraula.length(); posicio++){
			primoenPos=paraula.charAt(posicio);  
				
			do{
				for (i=2; i<=(j/2)+1; i++){
					resto=j%i;
				
					if (resto==0) {
						esPrimo=false;
					} 
				}
				if ((j==2)||(esPrimo==true)) { 
					l++;
					last=j;
				} 						
				j++;
				esPrimo=true;
			}while(l<=primoenPos); 
			
			encriptada = encriptada+(char)last;
		}
		
		return encriptada;
	}
	
		
	public static void main(String[] args) {
				
		Bomba a = new Bomba();
		a.paraulaEncriptada = a.encriptador(a.paraula);
		System.out.println("Cadena: "+a.paraula);
		System.out.println("Cadena encriptada: "+a.paraulaEncriptada);
						

	}

}
