package ejercicios;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(": ");
		System.out.println(" _______________________________________ ");
		System.out.println("| Elija metodo:							|");
		System.out.println("|										|");
		System.out.println("|  1: for                              	|");
		System.out.println("|  2: do while                          |");
		System.out.println("|  3: while do							|");
		System.out.println("|_______________________________________|");
		
		int entrada = s.nextInt();

		
		int i = 5;
		
		//for (; i <= 100; i +=5) {
		//	System.out.println(i+" es multiplo de 5");

		//}
		
		do {
			System.out.println("Contando "+ (i+0));
			
			i +=5;
			
		} while (i<=100);
		
		
	}
}
