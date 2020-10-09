package ejercicios;
import javax.swing.JOptionPane;



public class Ejercicio_12 {

	public static void main(String[] args) {
	
	
	String tiempo = null;
	
	//Introducimos la hora por teclado
	int hora= Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora deseada: ")); 
	
	switch (hora) {
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		tiempo = "Buenos dias";
		JOptionPane.showMessageDialog(null, tiempo);
		break;
		
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
	case 18:
	case 19:
	case 20:
	tiempo = "Buenas tardes";
	JOptionPane.showMessageDialog(null, tiempo);
		break;
	case 21:
	case 22:
	case 23:
	case 24:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		tiempo = "Buenas noches";
		JOptionPane.showMessageDialog(null, tiempo);
		break;

	default:
		JOptionPane.showMessageDialog(null, "Error al leer la hora", "ERROR",JOptionPane.ERROR_MESSAGE);
		break;
	}
	}
	

}
