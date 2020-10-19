package ejercicios;
import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		double PI = 3.1416;
		double area;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Introducir el radio del circulo: ");
			double radio = s.nextInt();
			
		area = PI*Math.pow(radio, 2);
		
		System.out.println("Área del círculo=" + area);


		}

}
