import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int [][]lista= new int [3][4];
		
		int num_mayor=0,num_menor=0,acum=0;
		float promedio=0;
		
		for (int f=0; f<=2;f++) {
			for(int c=0; c<=3;c++) {
				System.out.print("Fila "+(f+1)+" Columna "+(c+1)+" :");
				lista[f][c]=sc.nextInt();
				
				acum=acum+lista[f][c];
				
				if(f==0 && c==0) 
					num_mayor=lista[0][0];
				
				if(lista[f][c]>num_mayor) 
					num_mayor=lista[f][c];
				
				if(f==0 && c==0) 
					num_menor=lista[0][0];
				
				if(lista[f][c]<num_menor) 
					num_menor=lista[f][c];
				
				}
		}
		
		promedio=acum/12;
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("N�mero mayor: "+num_mayor);
		System.out.println("N�mero menor: "+num_menor);
		System.out.println("La sumatoria es: "+acum);
		System.out.println("El promedio es: "+promedio);
		
	}

}