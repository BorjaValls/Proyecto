import java.util.*;
import java.io.*;

public class ListaReserva {
	
	private ArrayList <Reserva> reserva;
	
	public ListaReserva (){
		
		reserva = new ArrayList ();
		
	}
	
	public void anyadir (Reserva x){
		
		reserva.add(x);
		
	}
	
	public Reserva buscarCodReserva (int id){
		
		for (int i = 0; i < reserva.size(); i++){
			
			if (reserva.get(i).getCodRerserva() == id){
				
				return reserva.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarCodReserva (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < reserva.size(); i++){
			
			if (reserva.get(i).getCodRerserva() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			reserva.remove(posicion);
		
			return true;
		
	}
	
	public String mostrarLR(){
		
		String cadena = "";
		
		for (int i = 0; i < reserva.size(); i++){
			
			cadena += reserva.get(i).mostrarReserva() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
}

