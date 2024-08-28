package modelo;

public class Persona {

	private DocIdentidad docIdentidad;
	private String nombre;
	private String apellido;

// CONSTRUCTOR

	
	public Persona(String apellido, DocIdentidad docu) {
		this.apellido = apellido;
		this.docIdentidad = docu;
	}
	

// GETTERS Y SETTERS
	public DocIdentidad getDocIdentidad() {
		return docIdentidad;
	}

	public void setDocIdentidad(DocIdentidad docIdentidad) {
		this.docIdentidad = docIdentidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



//METODOS 

	
	
	
	/*
	 * Persona pers = new Persona();
	 *utilizamos el enumerado:
	 * pers.setTipoDocumento(TipoDocumento.DNI);
	 * 
	 * pero necesariamente necesito crear un documennto para setear la informacion de la persona
	 * Documento docu = new Documento();
	 * 
	 * docu.setTipoDocumento(DNI)
	 * docu.setNroDocumento(12) 
	 * 
	 * pers.setDocumento(docu) o tambien se puede hacer:
	 * pers.getDocumento().getTipo / o setTipo() o buen getNumero() o setNumero()
	 * 
	 * 
	 * */
	
	
	
}
