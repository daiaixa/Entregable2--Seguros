package modelo;

public class ClienteVida extends Cliente {


	private double sueldo;
	
	
// COSTRUCTOR
	public ClienteVida(int edad, double sueldo) {
		super(edad);
		this.sueldo = sueldo;
	}
	
	
// GETTERS Y SETTERS
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}

}
