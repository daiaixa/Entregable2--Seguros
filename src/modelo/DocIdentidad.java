package modelo;

public class DocIdentidad {

	private int numDocumento;
	private TipoDocumento tipoDocumento;
	
	
	public DocIdentidad() {
		
	}
	
	
	public DocIdentidad(int numDoc, TipoDocumento tipoDoc) {
		this.numDocumento = numDoc;
		this.tipoDocumento = tipoDoc;
	}


	public int getNumDocumento() {
		return numDocumento;
	}


	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}


	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	
// METODOS
	
	
	
	@Override
	public String toString() {
		return this.numDocumento + " " + this.tipoDocumento;
	}


	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof DocIdentidad) {
			DocIdentidad otroDocu = (DocIdentidad)obj;
			
			return otroDocu.getTipoDocumento() == this.getTipoDocumento() && otroDocu.getNumDocumento() == this.getNumDocumento() ? true : false;
		}
		return super.equals(obj);
	}
	
	
	
	
}
