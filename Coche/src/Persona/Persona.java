package Persona;


public class Persona {

	protected int id;
	protected String nombre;
	protected String apellido;
	
	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	
	Persona p = new Persona(1, "Juan", "Pérez");
	
}


