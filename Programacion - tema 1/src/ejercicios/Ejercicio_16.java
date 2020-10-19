package ejercicios;
import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		
		int resultado = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introducir un numero entero: ");
			int entero1 = s.nextInt();
		System.out.println("Introducir otro numero entero: ");
			int entero2 = s.nextInt();

			//Suma
			System.out.println("---------------------------------------------------------------");
			System.out.print("Suma = ");
				resultado = entero1 + entero2;		
			System.out.println(resultado);
			//Resta
			System.out.println("---------------------------------------------------------------");
			System.out.print("Resta = ");
				resultado = entero1 - entero2;		
			System.out.println(resultado);
			System.out.println("---------------------------------------------------------------");
			System.out.print("Multiplicación = ");
				resultado = entero1 * entero2;		
			System.out.println(resultado);
			System.out.println("---------------------------------------------------------------");
			System.out.print("División = ");
				resultado = entero1 / entero2;		
			System.out.println(resultado);
			System.out.println("---------------------------------------------------------------");
			System.out.print("Resto = ");
				resultado = entero1 % entero2;		
			System.out.println(resultado);
			System.out.println("---------------------------------------------------------------");
			System.out.println("Postincremento primer numero = " + (entero1++));
			System.out.println("---------------------------------------------------------------");
			System.out.println("Preincremento primer numero = " + (++entero1));
			System.out.println("---------------------------------------------------------------");
			System.out.println("Postdecremento segundo numero = " + (entero2--));
			System.out.println("---------------------------------------------------------------");
			System.out.println("Predecremento segundo numero = " + (--entero2));


	}

}
