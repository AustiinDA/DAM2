package ejercicios;

import java.util.Scanner;

public class Ejercicio_28 {

	public static void main(String[] args) {
		int n1, n2, n3 = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir número entero: ");
		n1 = s.nextInt();
		System.out.println("Introducir otro número entero: ");
		n2 = s.nextInt();
		System.out.println("Introducir otro número entero: ");
		n3 = s.nextInt();
		
		if (n1 < n2 & n3 > n2) {
			System.out.print(n1);
			System.out.print("\t"+n2);
			System.out.print("\t"+n2);
			System.out.println(" True");

		}else {
			System.out.print(n1);
			System.out.print("\t"+n2);
			System.out.print("\t"+n3);
			System.out.println(" False");

		}
	}

}
