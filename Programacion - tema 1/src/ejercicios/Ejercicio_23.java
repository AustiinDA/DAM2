package ejercicios;
import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int var1,var2, var3;

		System.out.println("Introducir variable: ");
		 var1 = s.nextInt();
		System.out.println("Introducir segunda variable: ");
		 var2 = s.nextInt();
		
		System.out.println("Resultado sin intercambiar: Variable 1= "+var1 +(" variable 2= ")+ var2);
		var3 = var1;
		var1 = var2 ;
		var2 = var3;
		
		
		System.out.println("Resultado intercambiado: Variable 1= "+var1 +(" variable 2= ") +var2);



		

		
	}

}
