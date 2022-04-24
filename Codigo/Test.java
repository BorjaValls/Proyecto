import java.util.*;
import java.io.*;

public class Test {
	
	public static void main (String[] args) {
		
		
		ListaUsuarios lista = new ListaUsuarios ();
		ListaViviendas lista2 = new ListaViviendas ();
		Usuario x = new Usuario (1234, "Borja", "2179N", "calle", "numerocuenta1", "email@email.com", "hombre");
		Usuario y = new Usuario (9876, "Carlos", "7189J", "avenida", "2numerocuenta2", "2email@email.com2", "HOMBRE");
		Vivienda casa1 = new Vivienda (50.21, "120 m2", "camino1", "ocupado", "descripcion1");
		Vivienda casa2 = new Vivienda (60.09, "110 m2", "camino2", "listo", "descripcion2");
		Vivienda casa3 = new Vivienda (41.88, "115 m2", "camino3", "listo", "descripcion3");
		
		x.anyadirViv(casa1);
		y.anyadirViv(casa2);
		y.anyadirViv(casa3);
		lista.anyadir(x);
		lista.anyadir(y);
		lista2.anyadir(casa1);
		lista2.anyadir(casa2);
		lista2.anyadir(casa3);
		
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
		boolean buscar5 = lista.prueba(aux);
		
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
		
	}
	
	/*public static void elimUsviv (int id){
		
		
		
	}*/
	
}

