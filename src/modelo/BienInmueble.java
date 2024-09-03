package modelo;

public class BienInmueble extends Poliza {


	private double metrosCuadrados;  // Lo defini como atributo por si en algun momento el inmuble es apliado
	
	private final int IMPORTE_MTS2 = 500; 
	private final double PORCENTAJE_CUOTA = 0.002;
	private final int GASTO_ADM = 250;

	
// CONSTRUCTOR
	public BienInmueble(Cliente beneficiario, double mtsCuadrados) {
		super(beneficiario);
		this.metrosCuadrados = mtsCuadrados;
		this.calcularSumaAsegurada();
	}

	
	
// GETTERS Y SETTERS
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	

	public void calcularSumaAsegurada() {
		double sumaAsegurada = this.metrosCuadrados * IMPORTE_MTS2;
		
		this.setSumaAsegurada(sumaAsegurada);
	}



	@Override
	public double calcularCuota() { 
		double cuota = (getSumaAsegurada() * PORCENTAJE_CUOTA) + GASTO_ADM;
		return cuota;
	}

}
