package ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese una entrada: ");
	      String entrada = s.next();
	      
	      String ej= "^[a-zA-Z0-9]+$";
	      
	      boolean res = entrada.matches(ej);
	      if (res) {
			System.out.println("La entrada "+entrada+" es alfanumérica");
		}else {
			System.out.println("La entrada "+entrada+" no es alfanumérica");
		}
	      }
	}

