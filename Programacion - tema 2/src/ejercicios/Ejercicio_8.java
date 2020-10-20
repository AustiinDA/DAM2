package ejercicios;
import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int r;
		
		System.out.println("Introduce un numero: ");
		int a = s.nextInt();
		System.out.println("Introduce un numero: ");
		int b = s.nextInt();
		
		r =  a%b;
		
		if (r==0) {
			System.out.println(a+ " es multiplo de "+ b);
			}else {
				System.out.println(a+ " no es multiplo de "+ b);
		}
	}

}
