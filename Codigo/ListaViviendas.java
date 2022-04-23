import java.util.*;
import java.io.*;

public class ListaViviendas {
	
	private ArrayList <Vivienda> viviendas2;
	
	public ListaViviendas (){
		
		viviendas2 = new ArrayList ();
		
	}
	
	public void anyadir (Vivienda x){
		
		viviendas2.add(x);
		
	}
	
	public Vivienda buscarCodViv2 (int id){
		
		for (int i = 0; i < viviendas2.size(); i++){
			
			if (viviendas2.get(i).getCodViv() == id){
				
				return viviendas2.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarCodViv2 (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < viviendas2.size(); i++){
			
			if (viviendas2.get(i).getCodViv() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			viviendas2.remove(posicion);
		
			return true;
		
	}
	
	public String mostrarLV(){
		
		String cadena = "";
		
		for (int i = 0; i < viviendas2.size(); i++){
			
			cadena += viviendas2.get(i).mostrarViv() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
}

