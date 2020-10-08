package ejercicios;
import javax.swing.JOptionPane;
public class Ejercicio_3 {

	public static void main(String[] args) {
		
		double h, b, a;
		
		String dato = JOptionPane.showInputDialog("Introduce la base del triangulo: ");
		
		b = Double.parseDouble(dato);
		
		 dato = JOptionPane.showInputDialog("Introduce la altura del triangulo: ");
		
		h = Double.parseDouble(dato);
		
		a = b*h/2;
		
		JOptionPane.showMessageDialog(null, a);

		
	}

}
