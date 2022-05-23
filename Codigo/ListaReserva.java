import java.util.*;
import java.io.*;

public class ListaReserva {
	
	private ArrayList <Reserva> reserva;
	private static final String RUTA = "./Ficheros/";
	private static final String freservas = "freservas.txt";
	
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
	
	public void guardarReservas () throws Exception{
		
		//Reserva reserva = new Reserva (pago, detalles, buscarVivienda2);
		
		try{
			
			File fs = new File(RUTA+freservas);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < reserva.size(); i++){
				
				bw.write(reserva.get(i).getTipoPago()+"|");
				bw.write(reserva.get(i).getDetalles()+"|");
				bw.write(reserva.get(i).getViv().getNombre()); //que solo me guarde el nombre
				bw.write("\r\n");
				
			}
			
			if (bw != null){
			
				bw.close();
				fw.close();
			
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public void leerReservas (ListaViviendas lista) throws Exception{
		
		//Reserva reserva = new Reserva (pago, detalles, buscarVivienda2);
		
		try{
			
			File fs = new File(RUTA+freservas);
			FileReader fr = new FileReader(fs);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer tokens;
			String cadena, pago, detalles, vivi;
			
			while ( (cadena = br.readLine()) != null){
				
				tokens = new StringTokenizer(cadena, "|");
				
				pago = (String)tokens.nextToken();
				detalles = (String)tokens.nextToken();
				vivi = (String)tokens.nextToken();
				Vivienda vivienda = lista.buscarNombreViv(vivi);
				
				reserva.add(new Reserva(pago, detalles, vivienda));
				
			}
			
			if (br != null){
			
				br.close();
				fr.close();
			
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}
	
}

