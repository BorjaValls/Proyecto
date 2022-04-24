import java.util.*;
import java.io.*;

public class ListaClientes {
	
	private ArrayList <Cliente> cliente;
	
	public ListaClientes (){
		
		cliente = new ArrayList ();
		
	}
	
	public void anyadir (Cliente x){
		
		cliente.add(x);
		
	}
	
	public Cliente buscarNombre (String nombre){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Cliente buscarDni (String dni){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Cliente buscarID (int id){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getID() == id){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarID (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getID() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			cliente.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarNombre (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			cliente.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarDni (String dni){
		
		int posicion = -1;
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			cliente.remove(posicion);
		
			return true;
		
	}
	
	public String mostrarLE(){
		
		String cadena = "";
		
		for (int i = 0; i < cliente.size(); i++){
			
			cadena += cliente.get(i).mostrarCliente() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
}
