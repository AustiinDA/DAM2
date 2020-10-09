package ejercicios;
import java.util.Scanner;

public class Ejercicio_13 {


	public static void main(String[] args) {
		
		int pagado = 0;


		Scanner s = new Scanner(System.in);
		System.out.println("Introducir el numero de horas trabajadas a la semana: ");
		
		int horas = s.nextInt();
		
		if (horas > 40) { 
			int horasExtra = horas - 40;
			pagado = (40 * 12) + (horasExtra * 16);
			
		}else { 
			 pagado = horas * 12;
			
		}
			System.out.println("Ha cobrado "+ pagado +" €");
			
		}
	
	}


