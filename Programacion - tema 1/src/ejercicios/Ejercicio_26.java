package ejercicios;

import java.util.Scanner;

public class Ejercicio_26 {

	public static void main(String[] args) {
		
		double  a, longitud, anchura = 0.0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir la longitud de la habitaci�n: ");
		longitud = s.nextInt();
		System.out.println("Introducir la anchura de la habitaci�n: ");
		anchura = s.nextInt();
		
		a = longitud * anchura;
		System.out.printf("%.4f", a);
		System.out.print(" m2");
	}

}
