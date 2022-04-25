import java.util.*;
import java.io.*;

public class ListaUsuarios {
	
	private ArrayList <Usuario> usuarios;
	
	public ListaUsuarios (){
		
		usuarios = new ArrayList ();
		
	}
	
	public void anyadir (Usuario x){
		
		usuarios.add(x);
		
	}
	
	public Usuario buscarNombre (String nombre){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Usuario buscarDni (String dni){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Usuario buscarID (int id){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getID() == id){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarID (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getID() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			usuarios.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarNombre (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			usuarios.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarDni (String dni){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			usuarios.remove(posicion);
		
			return true;
		
	}
	
	public boolean borrarVivUs (int aux){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
				
			if (usuarios.get(i).eliminarCodViv(aux)){
					
				posicion = i;
					
			}
				
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			return true;
		
	}
	
	public String mostrarLU(){
		
		String cadena = "";
		
		for (int i = 0; i < usuarios.size(); i++){
			
			cadena += usuarios.get(i).mostrarVU() +"\n";
			
		}
		
		return cadena;
		
	}
	
}

