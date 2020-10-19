package ejercicios;
import java.util.Scanner;
public class Ejercicio_14 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir su nota: ");

		int nota = s.nextInt();
		
		if (nota<5 & nota >= 0) {
			System.out.println("Tienes un supenso");
		}else if (nota==5) {
			System.out.println("Tienes un suficiente");
		}else if(nota==6) {
			System.out.println("Tienes un bien");
		}else if (nota>=7 & nota<=8) {
			System.out.println("Tienes un notable");
		}else if(nota>=9 & nota <=10) {
			System.out.println("Tienes un sobresaliente");
		}else {
			System.out.println("Nota incorrecta, vuelva a introducir valor.");
		}

		
		
	}

}
