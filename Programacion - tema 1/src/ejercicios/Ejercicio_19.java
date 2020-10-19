package ejercicios;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		double num_meses = 12;
		double mes = 10;
		
		if (mes > num_meses | mes <= 0) {
			 System.out.println("Error");
		}else {
			System.out.println("Mes "+(int)mes +" de " +(int)num_meses);
			System.out.println("Porcentaje transcurrido: " +(mes/num_meses)*100+"%");
		}
	}
}
