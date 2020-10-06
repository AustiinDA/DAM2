package ejercicios;
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	

		
		System.out.println(" _______________________________________ ");
		System.out.println("| Introducir tipo de operacion: 	|");
		System.out.println("| 					|");
		System.out.println("|  1: Suma                              |");
		System.out.println("|  2: Resta                             |");
		System.out.println("|  3: Multiplicación                    |");
		System.out.println("|  4: División:       		 	|");
		System.out.println("|_______________________________________|");
		
		int entrada = s.nextInt();
		System.out.println("Dame un numero: ");
		int entrada2 = s.nextInt();
		System.out.println("Dame otro numero: ");
		int entrada3 = s.nextInt();
		
		
		switch (entrada) {
		case 1:
			entrada = entrada2 + entrada3; 
			break;
		case 2: 
			entrada = entrada2 - entrada3; 

			break;
			
		case 3:
			entrada = entrada2 * entrada3; 
			break;
		case 4:
			
			if (entrada3 == 0) {
				System.out.println("No se puede dividir para cero según la ciencia moderna que recoge estos datos. Quiza en un universo alternativo o en un futuro distante donde la humanidad descubra nuevos metodos para dar solucion a verdades empíricas como esta misma.");		
			}else {
				entrada = entrada2 / entrada3; 	
			}
			break;
			
		default:
			System.out.println("Entrada incorrecta, introduce valor valido ");
			break;
			
			
		}
		
		if(entrada== 4 & entrada3==0) {
		}else{
			System.out.println("Resultado: "+entrada);
		}
		
  
		
	
	

		
	}

}
