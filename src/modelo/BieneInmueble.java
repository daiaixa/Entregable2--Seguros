package modelo;

public class BieneInmueble extends Poliza {


	private double metrosCuadrados;

	
// CONSTRUCTOR
	public BieneInmueble(Persona beneficiario) {
		super(beneficiario);
	}

	
	
// GETTERS Y SETTERS
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}



	@Override
	public double calcularCuota() { //EPA, NO TOMA LOS PARAMETROS....	
		return this.getSumaAsegurada()*this.getMetrosCuadrados();
	}



	@Override
	public void calcularSumaAsegurada() {
		// TODO Auto-generated method stub
		
	}


	
	
}
