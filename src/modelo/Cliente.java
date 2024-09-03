package modelo;

public class Cliente extends Persona {
	
	private int codigoCliente;
	private int edad;
	
	private static int id; //para generar el codigo unico y secuencial
	
// COSTRUCTOR
	public Cliente(String apellido, DocIdentidad docu, int edad) {
		super(apellido, docu);

		id ++;
		this.edad = edad;
		this.codigoCliente = id;
	}
	
// GETTERS Y SETTERS
	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Cliente.id = id;
	}
	
//METODOS
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Persona) {
			Persona pers = (Persona) obj;

			//LO MEJOR SERIA QUE LA CLASE DOCUMENTO TENGA SU PROPIO METODO EQUALS Y UTILIZARLO ACA
			return pers.getDocIdentidad().equals(this.getDocIdentidad()) ? true : false;
		}
		return super.equals(obj);
	}

	
	@Override
	public String toString() {
		return String.format("Codigo: %d - Apellido: %s - Numero y tipo de Documento: %s",
				this.codigoCliente,
				this.getApellido(),
				this.getDocIdentidad().toString());   //COMO DEVUELVE EL DOCUMENTO DE IDENTIDAD ? 
	}
	

}
