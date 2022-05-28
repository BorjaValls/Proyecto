import java.util.*;
import java.io.*;

/**
 * Clase ListaViviendas
 *
 * Contiene los métodos y las operaciones para la administrar el array de Viviendas
 * que utiliza el programa. Entre las operaciones que realiza se encuentran las de añadir,
 * buscar y eliminar por nombre, mostrar la lista completa de viviendas y leer y cargar
 * en fichero los datos del array.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class ListaViviendas {

	/**
	 * Array (o lista) donde se almacenan las viviendas
	 */
	private ArrayList <Vivienda> viviendas2;

	/**
	 * Carpeta global donde se guardan los ficheros
	 */
	private static final String RUTA = "./Ficheros/";

	/**
	 * Fichero donde se guardan y se lee los datos
	 */
	private static final String fviviendas = "fviviendas.txt";

	/**
	 * Inicializa el objeto y todos los elementos asociados.
	 */
	public ListaViviendas (){
		
		viviendas2 = new ArrayList ();
		
	}

	/**
	 * Guarda la vivienda introducida en el array
	 * @param x (Vivienda a añadir)
	 *
	 */
	public void anyadir (Vivienda x){
		
		viviendas2.add(x);
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un nombre
	 * @param nombre (Nombre de la vivienda)
	 * @return (Devuelve la vivienda en caso de que la encuentre y null en el caso contrario)
	 *
	 */
	public Vivienda buscarNombreViv (String nombre){
		
		for (int i = 0; i < viviendas2.size(); i++){
			
			if (viviendas2.get(i).getNombre().equals(nombre)){
				
				return viviendas2.get(i);
				
			}
			
		}
		
		return null;
		
	}

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un nombre
	 * @param nombre (Nombre de la vivienda)
	 * @return (Devuelve true si existe la vivienda con el nombre introducido y la elimina,
	 * false si no la encuentra)
	 *
	 */
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

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarLV(){
		
		String cadena = "";
		
		for (int i = 0; i < viviendas2.size(); i++){
			
			cadena += viviendas2.get(i).mostrarViv() +"\n\n";
			
		}
		
		return cadena;
		
	}

	/**
	 * Vuelca el contenido del array en el fichero
	 */
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

	/**
	 * Vuelca el contenido del fichero en el array
	 */
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

