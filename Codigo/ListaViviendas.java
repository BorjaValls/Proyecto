import java.util.*;
import java.io.*;

public class ListaViviendas {
	
	private ArrayList <Vivienda> viviendas;
	
	public ListaViviendas (){
		
		viviendas = new ArrayList ();
		
	}
	
	public void anyadir (Vivienda x){
		
		viviendas.add(x);
		
	}
	
	public Vivienda buscarCodViv (int id){
		
		for (int i = 0; i < viviendas.size(); i++){
			
			if (viviendas.get(i).getCodViv() == id){
				
				return viviendas.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarCodViv (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < viviendas.size(); i++){
			
			if (viviendas.get(i).getCodViv() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			viviendas.remove(posicion);
		
			return true;
		
	}
	
	public String mostrarLV(){
		
		String cadena = "";
		
		for (int i = 0; i < viviendas.size(); i++){
			
			cadena += viviendas.get(i).mostrarViv() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
}

