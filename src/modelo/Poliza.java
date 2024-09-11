package modelo;

public abstract class Poliza {

	private int codigo; 
	private Cliente cliente;
	private Persona beneficiario;
	
	private static int id; //para generar el codigo unico y secuencial

	
// CONSTRUCTOR
	public Poliza() {}
	
	public Poliza(Cliente cliente, Persona beneficiario) {		
		id ++;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setBeneficiario(Persona beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	public Persona getBeneficiario() {
		return beneficiario;
	}

	public static int getId() {
		return id;
	}
	

// METODOS	
	public abstract double calcularCuota(); // cada uno va a calcularlo como le corresponde...	
	public abstract double calcularSumaAsegurada();

}