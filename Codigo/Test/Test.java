import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

//VERSION DESACTUALIZADA DE TESTEO

public class Test {
	
	public static void main (String[] args) throws Exception{
		
		
		ListaUsuarios lista = new ListaUsuarios ();
		ListaViviendas lista2 = new ListaViviendas ();
		ListaReserva lista3 = new ListaReserva ();
		Usuario x = new Usuario (1234, "Borja", "2179N", "calle", "numerocuenta1", "email@email.com", "hombre");
		Usuario y = new Usuario (9876, "Carlos", "7189J", "avenida", "2numerocuenta2", "2email@email.com2", "HOMBRE");
		Vivienda casa1 = new Vivienda (50.21, "Casa Pedro", "120 m2", "camino1", "ocupado", "descripcion1");
		Vivienda casa2 = new Vivienda (60.09, "Casa Borja", "110 m2", "camino2", "listo", "descripcion2");
		Vivienda casa3 = new Vivienda (41.88, "Apartemento Alto", "115 m2", "camino3", "listo", "descripcion3");
		Reserva reserva1 = new Reserva ("Online", "detalles1", casa1);
		Reserva reserva2 = new Reserva ("Efectivo", "detalles2", casa2);
		
		lista.anyadir(x);
		lista.anyadir(y);
		lista.buscarID(1).anyadirViv(casa1);
		y.anyadirViv(casa2);
		y.anyadirViv(casa3);
		lista2.anyadir(casa1);
		lista2.anyadir(casa2);
		lista2.anyadir(casa3);
		lista3.anyadir(reserva1);
		lista3.anyadir(reserva2);
		
		System.out.println("");
		System.out.println(lista.mostrarLU());
		System.out.println("");
		
		System.out.println("");
		System.out.println(x.mostrarVU());
		System.out.println("");
		
		System.out.println("");
		System.out.println(lista2.mostrarLV());
		System.out.println("");
		
		Usuario buscar = lista.buscarID(2);
		Usuario buscar2 = lista.buscarNombre("borja");
		boolean buscar3 = lista.eliminarID(1);
		boolean buscar4 = lista.eliminarNombre("holas");
		int aux = 2;
		boolean buscar5 = lista.borrarVivUs(aux);
		
		System.out.println("");
		if (buscar != null){
			
			System.out.println(buscar);
		
		}else
		
			System.out.println("No existe ID");
		
		System.out.println("");	
		if (buscar2 != null){
			
			System.out.println(buscar2);
		
		}else
		
			System.out.println("No existe Nombre");
		
		System.out.println("");	
		if (buscar3 != false){
			
			System.out.println("Borrado con exito ID");
		
		}else
		
			System.out.println("No se ha podido borrar ID");
		
		System.out.println("");	
		if (buscar4 != false){
			
			System.out.println("Borrado con exito Nombre");
		
		}else
			
			System.out.println("No se ha podido borrar Nombre");
			
			
		//IMPORTANTE: Método para borrar vivienda en la lista de viviendas y de su respectivo usuario	
		System.out.println("");	
		if (buscar5 != false){
			
			lista2.eliminarCodViv2(aux);
			System.out.println("Borrado con exito ID");
		
		}else
		
			System.out.println("No se ha podido borrar ID");
			
		System.out.println("");	
		System.out.println("");
		System.out.println("");
		System.out.println(lista.mostrarLU());
		
		System.out.println("");
		System.out.println(lista2.mostrarLV());
		System.out.println("");
		
		System.out.println("");
		System.out.println(lista3.mostrarLR());
		System.out.println("");
		
		reserva1.setInicio("27/09/2022");
		lista3.buscarCodReserva(2).setInicio("15/06/2020");
		lista3.buscarCodReserva(1).setFinal("10/10/2022");
		reserva2.setFinal("01/07/2020");
		
		System.out.println(reserva1.getInicio());
		System.out.println(reserva1.getFinal());
		System.out.println(reserva2.getInicio());
		System.out.println(reserva2.getFinal());
		
		lista3.buscarCodReserva(1).setDuracion();
		reserva2.setDuracion();
		reserva1.setImporte();
		lista3.buscarCodReserva(2).setImporte();
		System.out.println("");
		System.out.println(lista3.mostrarLR());
		System.out.println("");
		
	}
	
}

