
public class Desempleado extends Persona {

	private double prestacion;

	public double getPrestacion() {
		return prestacion;
	}

	public Desempleado(int id, String nombre, String apellido, double prestacion) {
		super(id, nombre, apellido);
		this.prestacion = prestacion;
	}
	
	Persona p2 = new Desempleado(2, "Manuel", "Cerezo", 300);
}
