package ejercicios;
import java.util.Scanner;

public class Ejercicio_12 {
	
	public static void hora(){
	
	Scanner s = new Scanner(System.in);
	
	String tiempo = null;
	
	//Introducimos la hora por teclado
	System.out.println("Introduce la hora deseada: ");
	int hora = s.nextInt();

	
	switch (hora) {
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		tiempo = "Buenos dias";
		break;

	default:
		break;
	}
	}
	

}
