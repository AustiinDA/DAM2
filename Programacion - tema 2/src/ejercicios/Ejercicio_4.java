package ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
	

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	
		System.out.println("Ingrese un número: ");
		int n1 = s.nextInt();
		System.out.println("Ingrese un número: ");
		int n2 = s.nextInt();
		System.out.println("Ingrese un número: ");
		int n3 = s.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("El mayor número es: " + n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("El mayor número es: " + n2);
		}else if(n3>n1 && n3>n2) {
			System.out.println("El mayor número es: " + n3);
		}
		
			
	}
}