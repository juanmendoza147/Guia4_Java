import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int conpar=0,conimpar=0,acum=0;
		float promedio=0;
		int[] num= new int [5];
		
		for (int i=0; i<=4; i++) {
			System.out.print("Ingrese número " +(i+1)+": ");
			num [i]= sc.nextInt();
			
			acum+=num[i];
			promedio=acum/5;
			
			if(num[i]%2==0) 	
			conpar++;
			 else 
			conimpar++;
			
		}
		
		System.out.println("números pares.......: "+conpar);
		System.out.println("números impares.....: "+conimpar);
		System.out.println("El promedio es....:"+promedio);

	}

}