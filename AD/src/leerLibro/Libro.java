package leerLibro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public class Libro implements Serializable{
	
	Float precio;
	String nombre;
	String autor;
	String editorial;
	int paginas;
	
	
	//Constructor 

	public Libro(String nombre, String autor, String editorial, int paginas, float precio) {
		super();
		
		this.precio = precio;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.paginas = paginas;
	}
	
	
	//getters y setters 
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	

	
	
}
