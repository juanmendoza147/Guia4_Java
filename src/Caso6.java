public class Caso6 {

	public static void main(String[] args) {
		
		
		String datos[][];
		datos=new String[2][3];
		
		datos[0][0]="Juan Mendoza";
		datos[0][1]="Tifany Barrera";
		datos[0][2]="Eliot Velazques";
		
		datos[1][0]="Los Olivos";
		datos[1][1]="San juan de miraflores";
		datos[1][2]="Puente Piedra";
		
		for (int f=0; f<=1; f++) {
			System.out.println("Fila: "+(f+1));
			System.out.println("========");
			for(int c=0;c<=2;c++) {
				System.out.println("Columna "+(c+1)+":"+datos[f][c]);
			}
		}

	}

}