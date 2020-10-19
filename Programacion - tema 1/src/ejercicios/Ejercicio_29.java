package ejercicios;

import java.util.Scanner;

public class Ejercicio_29 {
	public static void main(String[] args) {
		
		int entero = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir número entero: ");
		entero = s.nextInt();	
		
		if (entero%2 == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	

}
