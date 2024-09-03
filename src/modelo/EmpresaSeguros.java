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

// METODOS 
	// ITERACION DE LA LISTA DE POLIZAS
	public void listarPolizas() {
		for (Poliza poliza : this.listaPolizas) {
			// UTILIZO LA CLASE NumberFormat PARA MEJORAR SU VISUALIZACIÓN
			NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US);

			System.out.println(String.format("El cliente n°: %d; Poliza n°: %d; Suma asegurada: %s; Cuota: %s",
					poliza.getBeneficiario().getCodigoCliente(), poliza.getCodigo(),
					formatoMoneda.format(poliza.getSumaAsegurada()), formatoMoneda.format(poliza.calcularCuota())));
		}

	}

}
