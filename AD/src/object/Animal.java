package object;
import java.io.Serializable;

public class Animal {
	int Edad;
	String nombre;
	String raza;
	
	
	public Animal(int edad, String nombre, String raza) {
		super();
		Edad = edad;
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	
}
