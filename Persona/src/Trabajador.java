
public class Trabajador extends Persona{
	
	private double sueldo;

	public double getSueldo() {
		return sueldo;
	}
	
	
	
	public Trabajador(int id, String nombre, String apellido, double sueldo) {
		super(id, nombre, apellido);
		this.sueldo = sueldo;
	}



	Persona p = new Trabajador(1, "Pepe", "Garcia", 25 );

}
