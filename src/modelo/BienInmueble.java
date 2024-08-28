package modelo;

public class BienInmueble extends Poliza {


	private double metrosCuadrados;  // Lo defini como atributo por si en algun momento el inmuble es apliado
	
	final int IMPORTE_MTS2 = 500; 
	final double PORCENTAJE_CUOTA = 0.002;
	final int GASTO_ADM = 250;

	
// CONSTRUCTOR
	public BienInmueble(Cliente beneficiario, double mtsCuadrados) {
		super(beneficiario);
		this.metrosCuadrados = mtsCuadrados;
		this.calcularSumaAsegurada();
		this.calcularCuota();
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
		this.setCuotaMensual(cuota);
		return cuota;
	}


	/*  Para bienes inmuebles: La suma asegurada en los inmuebles (casas, terrenos, campos,
etc.) está definida por un importe fijo por metro cuadrado de la propiedad, y la cuota
mensual es igual al 0.2% de la suma asegurada más un gasto administrativo que es igual
para todas las pólizas de este tipo.
*/

	
	
}
