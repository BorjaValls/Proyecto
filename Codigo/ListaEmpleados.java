import java.util.*;
import java.io.*;

public class ListaEmpleados {
	
	private ArrayList <Empleado> empleado;
	
	public ListaEmpleados (){
		
		empleado = new ArrayList ();
		
	}
	
	public void anyadir (Empleado x){
		
		empleado.add(x);
		
	}
	
	public Empleado buscarNombre (String nombre){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Empleado buscarDni (String dni){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Empleado buscarID (int id){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getID() == id){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarID (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getID() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			empleado.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarNombre (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			empleado.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarDni (String dni){
		
		int posicion = -1;
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			empleado.remove(posicion);
		
			return true;
		
	}
	
	public String mostrarLE(){
		
		String cadena = "";
		
		for (int i = 0; i < empleado.size(); i++){
			
			cadena += empleado.get(i).mostrarEmpleado() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
}

