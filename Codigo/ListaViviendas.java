import java.util.*;
import java.io.*;

public class ListaViviendas {
	
	private ArrayList <Vivienda> viviendas2;
	private static final String RUTA = "./Ficheros/";
	private static final String fviviendas = "fviviendas.txt";
	
	public ListaViviendas (){
		
		viviendas2 = new ArrayList ();
		
	}
	
	public void anyadir (Vivienda x){
		
		viviendas2.add(x);
		
	}
	
	public Vivienda buscarNombreViv (String nombre){
		
		for (int i = 0; i < viviendas2.size(); i++){
			
			if (viviendas2.get(i).getNombre().equals(nombre)){
				
				return viviendas2.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarNombreViv (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < viviendas2.size(); i++){
			
			if (viviendas2.get(i).getNombre().equals(nombre)){
				
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
	
	public void guardarViviendas () throws Exception{
		
		//Vivienda vivienda = new Vivienda (precio, nombre2, dimensiones, direccion2, estado, descripcion);
		
		try{
			
			File fs = new File(RUTA+fviviendas);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < viviendas2.size(); i++){
				
				bw.write(viviendas2.get(i).getPrecio()+"|");
				bw.write(viviendas2.get(i).getNombre()+"|");
				bw.write(viviendas2.get(i).getDimensiones()+"|");
				bw.write(viviendas2.get(i).getDireccion()+"|");
				bw.write(viviendas2.get(i).getEstado()+"|");
				bw.write(viviendas2.get(i).getDescripcion());
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
	
	public void leerViviendas () throws Exception{
		
		//Vivienda vivienda = new Vivienda (precio, nombre2, dimensiones, direccion2, estado, descripcion);
		
		try{
			
			File fs = new File(RUTA+fviviendas);
			FileReader fr = new FileReader(fs);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer tokens;
			double precio;
			String cadena, nombre, dimensiones, direccion, estado, descripcion;
			
			while ( (cadena = br.readLine()) != null){
				
				tokens = new StringTokenizer(cadena, "|");
				
				precio = Double.parseDouble((String)tokens.nextToken());
				nombre = (String)tokens.nextToken();
				dimensiones = (String)tokens.nextToken();
				direccion = (String)tokens.nextToken();
				estado = (String)tokens.nextToken();
				descripcion = (String)tokens.nextToken();
				
				viviendas2.add(new Vivienda(precio, nombre, dimensiones, direccion, estado, descripcion));
				
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

