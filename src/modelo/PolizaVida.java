package modelo;

public class PolizaVida extends Poliza {

	private double sueldo;

	private final int MULTIPLICADOR = 20;
	private final int INCREMENTADOR = 50;
	private final double PORCENTAJE_CUOTA = 0.01;

// CONSTRUCTOR
	public PolizaVida(Cliente cliente, Persona beneficiario, double sueldo) {
		super(cliente,beneficiario);
		this.sueldo = sueldo;
	}
	

// GETTERS Y SETTERS
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
// METODOS
	@Override
	public double calcularCuota() {
		double cuota = calcularSumaAsegurada();
		cuota -= cuota*PORCENTAJE_CUOTA;

		if (this.getCliente().getEdad() > 60) { 
			cuota += INCREMENTADOR;
		}
		return cuota;
	}


	@Override
	public double calcularSumaAsegurada() {
		double sumaAsegurada = sueldo * 20;
		
		return sumaAsegurada;
	}


}
