public class Caso1 {

	public static void main(String[] args) {
		// Declaracion 
		
		String nombre[];
		nombre = new String[4];
		//asignacion
		
		nombre[0]= "Juan";
		nombre[1]= "Joe";
		nombre[2]= "Tifany";
		nombre[3]= "Ronaldo";
		
	
		for (int i=0; i<=3; i++) {	
			System.out.println("RESULTADO");
			System.out.println("===========");
			System.out.println("Nombre "+(i+1)+": "+nombre[i]);
		}
	}
	

}