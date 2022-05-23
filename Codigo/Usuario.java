import java.util.*;
import java.io.*;

public class Usuario extends Persona{
	
	private ArrayList <Vivienda> viviendas;
	
	public Usuario (int telefono, String nombre, String dni, String direccion, String cuentaBancaria, String email, String sexo){
		super(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		viviendas = new ArrayList ();
		
	}
	
	public void anyadirViv (Vivienda x){
		
		viviendas.add(x);
		
	}
	
	public Vivienda buscarCodViv (String nombre){
		
		for (int i = 0; i < viviendas.size(); i++){
			
			if (viviendas.get(i).getNombre().equals(nombre)){
				
				return viviendas.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarCodViv (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < viviendas.size(); i++){
			
			if (viviendas.get(i).getNombre().equals(nombre)){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			viviendas.remove(posicion);
		
			return true;
		
	}
	
	public String mostrarVU(){
		
		String cadena = "Usuario: " +toString() +"\n\n" +"VIVIENDAS DEL USUARIO:\n\n";
		
		for (int i = 0; i < viviendas.size(); i++){
			
			cadena += viviendas.get(i).mostrarViv() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
}

