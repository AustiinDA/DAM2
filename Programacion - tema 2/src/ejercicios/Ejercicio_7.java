package ejercicios;
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int i = 1; 
		int a;
		
		System.out.println("Introduce un numero para mostrar su tabla de multiplicar: ");
		
		int m = s.nextInt();
		
		while(i<=10) {
			
			a=m*i;
			System.out.println(m+"X"+i+"="+a);
			i=i+1;
		}
		
		
	}

}
