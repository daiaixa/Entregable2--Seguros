package modelo;

import java.text.NumberFormat;
import java.util.Locale;

public class EmpresaSeguros {

	private Poliza[] listaPolizas;

// CONSTRUCTOR
	public EmpresaSeguros(Poliza[] lista) {
		this.listaPolizas = lista;
	}

	
// GETTERS Y SETTERS 
	public Poliza[] getListaPolizas() {
		return listaPolizas;
	}
	
	public void setListaPolizas(Poliza[] listaNueva) {
		this.listaPolizas = listaNueva;
	}
	
	
// METODOS 
// ITERACION DE LA LISTA DE POLIZAS
	public void listarPolizas() {
		// UTILIZO LA CLASE NumberFormat PARA MEJORAR SU VISUALIZACIÓN
		NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US);
		double total = 0;
		for (Poliza poliza : this.listaPolizas) {		
			System.out.println(String.format("El cliente n°: %d; Poliza n°: %d; Suma asegurada: %s; Cuota: %s",
					poliza.getBeneficiario().getCodigoCliente(), poliza.getCodigo(),
					formatoMoneda.format(poliza.getSumaAsegurada()), formatoMoneda.format(poliza.calcularCuota())));
			total += poliza.calcularCuota();
		}
		
		System.out.println(String.format("El total a recaudar es %s", formatoMoneda.format(total)));
	}

}
