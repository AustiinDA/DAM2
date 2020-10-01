package leerLibro;

import java.io.*;
import java.util.Random;

public class PruebaLibro {

	public static void main(String[] args) {
			
			File fichero_obj = new File("C:\\Users\\alumnoFP\\AD\\fich_obj.dat");
	}
	
	
		
			public static void EscribirEnFichero(File fichero) {
				
				try {
					
					FileOutputStream FileOS = new FileOutputStream(fichero, true);
					ObjectOutputStream objOS = new ObjectOutputStream(FileOS);
					
					System.out.println("1. Añadiendo un objeto al fichero: " + fichero.getName());
					
					Libro unLibro = new Libro("Jacky", "Frederick Tatum", "La costa oscura", 432);
					
					objOS.writeObject(unLibro);
					
					Libro otroLibro = new Libro("Las historias de John Truman", "Joseph Kavstovsky", "Sirious Signature", 321);
					
					objOS.writeObject(otroLibro);
					
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
			
		
		}
			
			public void añadirObjEnFichero(File fichero) {
				System.out.println("");
				try {
					
					Random edadRandom=new Random();
					String[] autores = {"Toby Mcwire", "John Carpenter", "Lenny J. O'donnel", "Stravinsky", "Killian Hatori", "Gustavo Díaz", "Jacky Chan", };
					String[] nombres = {"La estación de la costa", "Razones de la muerte", "Camino a santuario", "Los muertos vivientes", "La casa del terror", "Casa de maníacos"};
					String[] editoriales = {"Ediciones Goodman", "Virign Signature", "La casa del panfleto", "Historias no corrientes", "Huang Ki Moon Editions", "La vida de 3.1416"};
					
					ObjectOutputStream miObjOS = new ObjectOutputStream(new FileOutputStream(fichero, true));
					System.out.println("2. Añadiendo otros objetos al fichero: " + fichero.getName());
					
					for(int i=0; i<nombres.length; i++) {}
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		
		
	}


