package modelo;

public class PolizaVehiculo extends BienMueble {

	private String marca;
	private int modelo;
	
	private final int ANIO_ACTUAL = 2024;
	
// CONSTRUCTOR	
	public PolizaVehiculo(Cliente cliente, Persona beneficiario, double valorBien, int modelo) {
		super(cliente, beneficiario, valorBien);
		this.modelo = modelo;
	}

	
// GETTERS Y SETTERS 
	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


// METODOS
	@Override
	public double calcularCuota() {

		int antiguedad = ANIO_ACTUAL - this.getModelo();
		double porcentajeADescontar = antiguedad * 2;		
		
		double cuota = (this.getValorBien() * porcentajeADescontar)/100;

		return cuota;
	}

}
