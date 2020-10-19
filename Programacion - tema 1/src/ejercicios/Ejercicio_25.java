package ejercicios;
import java.util.Scanner;

public class Ejercicio_25 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introducir el número de segundos: ");
		int segundos = s.nextInt();
		
		int sec = segundos % 60; //calcula los segundos obteniendo resto 
        int h = segundos / 60; //calcula la hora dividiendo los segundos con el cociente
        int m = h % 60; //calcula los minutos cogiendo el resto de la hora de la operacion anterior
        h = h / 60; //calcula la hora final, en caso de ser menor a 60 lo dejara a 0, si es igual o mayor dara mas de 0.
        System.out.print( h + " horas " + m + " minutos " + sec+" segundos");
		
		
			
		}
		

		
		
	}


