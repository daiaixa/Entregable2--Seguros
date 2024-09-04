package modelo;

public class BienMueble extends Poliza {

	
// CONSTRUCTOR
	public BienMueble(Cliente beneficiario, double valorProducto) {
		super(beneficiario);
		this.setSumaAsegurada(valorProducto);
		this.calcularCuota();
	}

// METODOS 
	@Override
	public double calcularCuota() {
		double cuota = this.getSumaAsegurada()/96;
		return cuota;
	}
	
}
