package Coche;

public class Coche {

	private int id;
	private String marca;
	private String modelo;
	
	public Coche(int id, String marca, String modelo) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public int getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	Coche c = new Coche(1, "Toyota", "Corolla");
	
}
