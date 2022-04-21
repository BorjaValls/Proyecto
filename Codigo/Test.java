import java.util.*;
import java.io.*;

public class Test {
	
	public static void main (String[] args) {
		
		//(int telefono, String nombre, String dni, String direccion, 
		//String cuentaBancaria, String email, String sexo);
		ListaUsuarios lista = new ListaUsuarios ();
		Usuario x = new Usuario (1234, "Borja", "2179N", "calle", "numerocuenta1", "email@email.com", "hombre");
		Usuario y = new Usuario (9876, "Carlos", "7189J", "avenida", "2numerocuenta2", "2email@email.com2", "HOMBRE");
		Vivienda casa1 = new Vivienda (50.21, "120 m2", "camino1", "ocupado", "descripcion1");
		Vivienda casa2 = new Vivienda (60.09, "110 m2", "camino2", "listo", "descripcion2");
		Vivienda casa3 = new Vivienda (41.88, "115 m2", "camino3", "listo", "descripcion3");
		//(double precio, String dimensiones, 
		//String direccion, String estado, String descripcion){
		x.anyadirViv(casa1);
		y.anyadirViv(casa2);
		y.anyadirViv(casa3);
		lista.anyadir(x);
		lista.anyadir(y);
		
		System.out.println("");
		System.out.println(lista.mostrarLU());
		System.out.println("");
		
		Usuario buscar = lista.buscarID(2);
		Usuario buscar2 = lista.buscarNombre("borja");
		boolean buscar3 = lista.eliminarID(1);
		boolean buscar4 = lista.eliminarNombre("holas");
		
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
			
		System.out.println("");	
		System.out.println("");
		System.out.println("");
		System.out.println(lista.mostrarLU());
		
	}
}

