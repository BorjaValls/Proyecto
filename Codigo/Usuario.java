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
	
	public Vivienda buscarCodViv (int cv){
		
		for (int i = 0; i < viviendas.size(); i++){
			
			if (viviendas.get(i).getCodViv() == cv){
				
				return viviendas.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarCodViv (int cv){
		
		int posicion = -1;
		
		for (int i = 0; i < viviendas.size(); i++){
			
			if (viviendas.get(i).getCodViv() == cv){
				
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
		
		String cadena = "Usuario: " +"\n" +toString() +"\n\n";
		
		for (int i = 0; i < viviendas.size(); i++){
			
			cadena += viviendas.get(i).mostrarViv() +"\n";
			
		}
		
		return cadena;
		
	}
	
}

