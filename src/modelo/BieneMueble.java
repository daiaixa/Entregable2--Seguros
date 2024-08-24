package modelo;

public class BieneMueble extends Poliza {

	
// CONSTRUCTOR
	public BieneMueble(Persona beneficiario) {
		super(beneficiario);
	}


// METODOS 
	@Override
	public double calcularCuota() {
		return this.getSumaAsegurada()/96;
	}


	@Override
	public void calcularSumaAsegurada() {
		// TODO Auto-generated method stub
		
	}
	

	
}
