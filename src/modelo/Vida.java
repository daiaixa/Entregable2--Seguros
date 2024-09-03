package modelo;

public class Vida extends Poliza {

	private double sueldo;

	private final int MULTIPLICADOR = 20;
	private final int INCREMENTADOR = 50;
	private final double PORCENTAJE_CUOTA = 0.01;

// CONSTRUCTOR
	public Vida(Cliente beneficiario, double sueldo) {
		super(beneficiario);
		this.sueldo = sueldo;
		this.setSumaAsegurada(this.sueldo*MULTIPLICADOR);
		this.calcularCuota();
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public double calcularCuota() {
		double cuota = this.getSumaAsegurada() * PORCENTAJE_CUOTA;

		if (this.getBeneficiario().getEdad() > 60) { //No puedo convertir una persona a cliente, no podia acceder a la edad...
			cuota += INCREMENTADOR;
		}
		return cuota;
	}

	/*
	 * Vida: En los seguros de vida, la suma asegurada es igual a 20 sueldos del
	 * cliente, y la cuota mensual es igual al 1% del sueldo declarado. Para los
	 * clientes mayores a 60 años se debe incrementar un valor fijo en la cuota
	 * mensual, este valor es el mismo para todas las pólizas de este tipo.
	 * 
	 */

}
