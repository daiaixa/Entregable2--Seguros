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
	
	
}
