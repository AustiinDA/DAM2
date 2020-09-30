package leer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Ficheros {

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
		
        //Indica si existen los archivos
	System.out.println("Existencia: ");
	System.out.println("Fichero "+fichero.exists());
	System.out.println("Directorio "+directorio.exists());
	
	System.out.println("");
	
	//Indica si son directorios
	System.out.println("¿Son directorios?: ");
	System.out.println("Fichero "+fichero.isDirectory());
	System.out.println("Directorio "+directorio.isDirectory());
	
	System.out.println("");
	
	//Indica si son ficheros
	System.out.println("¿Son ficheros?: ");
	System.out.println("Fichero "+fichero.isFile());
	System.out.println("Directorio "+directorio.isFile());
	
	System.out.println("");
	
	//Indica la ruta absoluta del fichero o directorio
	System.out.println("Ruta absoluta: ");
	System.out.println("Fichero "+fichero.getAbsolutePath());
	System.out.println("Directorio "+directorio.getAbsolutePath());
	
	System.out.println("");
	
	//Indica si se puede leer
	System.out.println("¿Se pueden leer?:");
	System.out.println("Fichero "+fichero.canRead());
	System.out.println("Directorio "+directorio.canRead());
	
	System.out.println("");
	
	//Indica si se puede escribir
	System.out.println("¿Se pueden escribir?:");
	System.out.println("Fichero "+fichero.canWrite());
	System.out.println("Directorio "+directorio.canWrite());
	
	System.out.println("");
	
	//Indica si se puede ejecutar
	System.out.println("¿Se pueden ejecutar?:");
	System.out.println("Fichero "+fichero.canExecute());
	System.out.println("Directorio "+directorio.canExecute());
	
	System.out.println("");
	
	//Indica el nombre sin rutas
	System.out.println("Nombres sin rutas: ");
	System.out.println("Fichero "+fichero.getName());
	System.out.println("Directorio "+directorio.getName());
	
	System.out.println("");
	
	//Indica el nombre del directorio padre
	System.out.println("Nombre del directorio padre: ");
	System.out.println("Fichero "+fichero.getParent());
	System.out.println("Directorio "+directorio.getParent());
	
	System.out.println("");
	
	//Guarda en un array de File los directorios hijos, solo con directorios
	System.out.println("Nombre de los objetos File dentro de un array");
	File lista[]=directorio.listFiles();
	for(int i=0;i<lista.length;i++){
	    System.out.println(lista[i]);
	}

	System.out.println("");
	
	//Guarda en un array de String los directorios hijos, solo con directorios
	System.out.println("Nombre de los objetos String dentro de un array");
	String listaString[]=directorio.list();
	for(int i=0;i<listaString.length;i++){
	    System.out.println(listaString[i]);
	}
	
	System.out.println("");
	
	//renombrar fichero manejado por fichero2
	fichero2.renameTo(new File("C:\\Users\\alumnoFP\\AD\\fich_binario.ddr"));

	try {
		FileReader lector = new FileReader(fichero2);
		char[] buf = new char[200];
		System.out.println("Fichero:" + fichero2.getAbsolutePath());
		lector.read(buf);
		System.out.println(buf);
		lector.close();
	
	} catch (IOException ey) {
		ey.printStackTrace();
	}
	
	try {
		
		FileReader lector = new FileReader(fichero2);
		BufferedReader lectorLineas = new BufferedReader(lector);
		String linea;
		while ((linea = lectorLineas.readLine()) != null){
			System.out.println(linea);
			
		}
		
		lectorLineas.close();
		
	} catch (FileNotFoundException fn) {
		fn.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	
	BufferedWriter bw;
	try {
		bw = new BufferedWriter(new FileWriter(fichero2, true));
		String cadena = "Hey muye buenas a todos, aqui Willyrex comentando...";
		bw.write(cadena);
		bw.newLine();
		bw.close();
	} catch (Exception e) {
	}
	}
	
	
	
}
