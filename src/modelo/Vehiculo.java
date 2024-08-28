package modelo;

public class Vehiculo extends Poliza {

	private String marca;
	private int modelo;
	
	final int ANIO_ACTUAL = 2024;
	
// CONSTRUCTOR	
	public Vehiculo(Cliente beneficiario, int modelo, double valorVehiculo) {
		super(beneficiario);
		this.modelo = modelo;
		this.setSumaAsegurada(valorVehiculo);
		this.calcularCuota();
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


	@Override
	public double calcularCuota() {

		int antiguedad = ANIO_ACTUAL - this.getModelo();
		double porcentajeADescontar = antiguedad * 2;		
		
		double cuota = (this.getSumaAsegurada() * porcentajeADescontar)/100;
		this.setCuotaMensual(cuota);
		
		return cuota;
	}



	/*  Para vehículos: Los vehículos, son un caso particular de los bienes muebles, en donde
además se desea conocer la marca y modelo (año de patentamiento). En este caso la
cuota mensual será igual que para los bienes muebles menos un 2% por año de
antigüedad del vehículo.  */


}
