package ejercicios;
import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		
		int i,g,t = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir el numero de grados Fahrenheit: ");
		int gradosF = s.nextInt();
		
		 i = gradosF-32;
		 g = i/9;
		 t = 5 * g;
		 
		 System.out.println(t + "Cº");


	}

}
