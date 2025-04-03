package Biblioteca;

import java.util.Date;

public class Prestamo {

	private int id;
	private int id_lector;
	private int ISBN_libro;
	private Date fecha_prestamo;
	private Date fecha_devolucion;

	public int getId() {
		return id;
	}

	public int getId_lector() {
		return id_lector;
	}

	public int getISBN_libro() {
		return ISBN_libro;
	}

	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}

	public Date getFecha_devolucion() {
		return fecha_devolucion;
	}

}
