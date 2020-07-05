import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Integer [] num;
		num = new Integer [5];
		
		for (int i =0; i<=4; i++) {
			System.out.print("Ingrese número "+(i+1)+": ");
			num[i]= sc.nextInt();
		}
		
		Arrays.sort(num);
		System.out.println("Lista en orden Ascendente");
		for (int i =0; i<=4; i++)
			System.out.println("Número "+(i+1)+": "+num[i]);
		
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println("Lista en orden Descendente");
		for (int i =0; i<=4; i++)
			System.out.println("Número "+(i+1)+": "+num[i]);

	}

}
