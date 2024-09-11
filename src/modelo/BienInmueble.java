package modelo;

//NO VAMOS A TENER ATRIBUTOS QUE SEAN CALCULABLES

public class BienInmueble extends Poliza {


	private double metrosCuadrados;  // Lo defini como atributo por si en algun momento el inmuble es apliado
	
	private final int IMPORTE_MTS2 = 500; 
	private final double PORCENTAJE_CUOTA = 0.002;
	private final int GASTO_ADM = 250;

	
// CONSTRUCTOR
	public BienInmueble(Cliente cliente, Persona beneficiario, double mtsCuadrados) {
		super(cliente,beneficiario);
		this.metrosCuadrados = mtsCuadrados;
	}

	
	
// GETTERS Y SETTERS
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
		//TODO porque sino deberia recalcular la suma aca...
	}

	
// METODOS
	public double calcularSumaAsegurada() {
		double sumaAsegurada = this.metrosCuadrados * IMPORTE_MTS2;
		return sumaAsegurada;
	}



	@Override
	public double calcularCuota() { 
		double cuota = calcularSumaAsegurada() + GASTO_ADM;
		return cuota;
	}

}
