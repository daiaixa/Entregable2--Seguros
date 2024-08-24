package modelo;

public class Vehiculo extends Poliza {

	private String marca;
	private String modelo;
	
	
// CONSTRUCTOR	
	public Vehiculo(Persona beneficiario, String modelo) {
		super(beneficiario);
		this.modelo = modelo;
	}

	
// GETTERS Y SETTERS 
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public double calcularCuota() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void calcularSumaAsegurada() {
		// TODO Auto-generated method stub
		
	}
	
	 

}
