package ejercicios;

import java.util.Scanner;

public class Ejercicio_27 {

	public static void main(String[] args) {
		int n1, n2 = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir n�mero entero: ");
		n1 = s.nextInt();
		System.out.println("Introducir otro n�mero entero: ");
		n2 = s.nextInt();
		
		if (n1 < n2) {
			System.out.print(n1);
			System.out.print("\t"+n2);
			System.out.println(" True");

		}else {
			System.out.print(n1);
			System.out.print("\t"+n2);
			System.out.println(" False");

		}
	}

}
