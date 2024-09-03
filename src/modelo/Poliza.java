package modelo;

public abstract class Poliza {

	private int codigo;
	private double sumaAsegurada;
	private Cliente beneficiario;
	
	private static int id; //para generar el codigo unico y secuencial

	
// CONSTRUCTOR
	public Poliza(Cliente beneficiario) {		
		id ++;
		this.beneficiario = beneficiario;
		this.codigo = id;
	}

	
//GETTERS Y SETTERS 
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}


	public Cliente getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Cliente beneficiario) {
		this.beneficiario = beneficiario;
	}

	public static int getId() {
		return id;
	}
	

// METODOS	
	public abstract double calcularCuota(); // cada uno va a calcularlo como le corresponde...	
}
