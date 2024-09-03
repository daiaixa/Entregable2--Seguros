package programaPrincipal;


import modelo.*;

public class Main {

	public static void main(String[] args) {

	//LOS TRES DISTINTOS DOCUMENTOS PARA LOS TRES DISTINTOS CLIENTES:		
		DocIdentidad docu1 = new DocIdentidad(12662552, TipoDocumento.DNI);
		DocIdentidad docu2 = new DocIdentidad(52441441, TipoDocumento.PASAPORTE);
		DocIdentidad docu3 = new DocIdentidad(25511552, TipoDocumento.LC);
		DocIdentidad docu4 = new DocIdentidad(15511552, TipoDocumento.DNI);
		
		
		
	//LOS TRES CLIENTES DISTINTOS  
		Cliente cliente1 = new Cliente("Jimenez", docu1, 33);
		Cliente cliente2 = new Cliente("Ramon", docu2, 67);
		Cliente cliente3 = new Cliente("Martinez", docu3, 83);
		Cliente cliente4 = new Cliente("Zuzu", docu4, 33);

		
	//PROBAMOS EL METODO toString DE LA CLASE CLIENTE
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		System.out.println(cliente3.toString());
		
		
	//LAS CUATRO POLIZAS DISTINTAS
		Vida polizaVida = new Vida(cliente1, 50000.00); //SI QUIERO USAR pers ME TIRA UN ERROR
		
		BienInmueble polizaBnInmueble = new BienInmueble(cliente2, 150);
		
		BienMueble polizaBnMueble = new BienMueble(cliente3, 1500000);
		
		Vehiculo polizaVehiculo = new Vehiculo(cliente4, 2010, 5500000);
		
		
	//GUARDO LAS POLIZAS EN UNA LISTA PARA LUEGO ITERAR
		Poliza[] listaDePolizas = {polizaBnInmueble, polizaBnMueble, polizaVehiculo, polizaVida};
		
		
	//CREO LA CLASE DE LA EMPRESA ASEGURADORA PARA PASARLE LA LISTA
		EmpresaSeguros empresaSeguros = new EmpresaSeguros(listaDePolizas);
		
		empresaSeguros.listarPolizas();
			
			
	}

}
