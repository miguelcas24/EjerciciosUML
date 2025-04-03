package Biblioteca;

public class Libro {

	private int ISBN;
	private String titulo;
	private String autor;
	private Enum genero;

	public enum genero {
		FICCION, NO_FICCION, MISTERIO, FANTASIA, BIOGRAFIA, HISTORIA
	}

	public int getISBN() {
		return ISBN;
	}


	public String getTitulo() {
		return titulo;
	}


}
