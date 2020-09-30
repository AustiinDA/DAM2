package binarios;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ficheros_binarios {
		
		public static void main(String [] args) throws IOException {
			
			//Creamos objeto file
			File fichero=new File("C:\\Users\\alumnoFP\\AD\\fich_binario.ddr");
			File fichero2=new File("C:\\Users\\alumnoFP\\AD\\fichero.txt");
			File directorio=new File("C:\\Users\\alumnoFP\\AD\\directorio");
			File directorio2=new File("C:\\Users\\alumnoFP\\AD\\directorio2");
			
			//Creo los ficheros y directorios
			fichero.createNewFile();
			fichero2.createNewFile();
			directorio.mkdir();
			directorio2.mkdir();
			
		try {
			FileInputStream lecturaIS = new FileInputStream(fichero2);
			DataInputStream dataIS = new DataInputStream(lecturaIS);
			
			System.out.println("Leyendo desde el fichero con readInt:");
			dataIS.read();
			int i = dataIS.readInt();
			while (i != -1) {
				System.out.println((int) i);
				i = dataIS.readInt();
				
			}
			
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
