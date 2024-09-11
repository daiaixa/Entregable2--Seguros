package modelo;

public class BienMueble extends Poliza {
	
	private double valorBien;

	
// CONSTRUCTOR
	public BienMueble(Cliente cliente, Persona beneficiario, double valorBien) {
		super(cliente,beneficiario);
		this.valorBien = valorBien;
	}
	
	
//GETTERS Y SETTERS
	public double getValorBien() {
		return valorBien;
	}
	
	public void setValorBien(double nuevoValor) {
		this.valorBien = nuevoValor;
	}

	
// METODOS 
	@Override
	public double calcularCuota() {
		double cuota = calcularSumaAsegurada()/96;
		return cuota;
	}


	@Override
	public double calcularSumaAsegurada() {
		return valorBien;
	}
	
}
