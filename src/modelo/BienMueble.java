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

/*   Para bienes muebles: La suma asegurada en los bienes muebles (cualquier producto
que se quiere asegurar, ejemplo una computadora, un televisor, un equipo de música,
etc.) está definida por el valor del producto asegurado declarado por el cliente, y la
cuota mensual será igual al valor de la suma asegurada prorrateada en 8 años (es decir
dividida en 96 meses).   */
	
}
