import java.util.*;
import java.io.*;

/**
 * Clase ListaClientes
 *
 * Contiene los métodos y las operaciones para la administrar el array de Clientes
 * que utiliza el programa. Entre las operaciones que realiza se encuentran las de añadir,
 * buscar y eliminar por nombre y DNI, mostrar la lista completa de clientes y leer y cargar
 * en fichero los datos del array.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class ListaClientes {

	/**
	 * Array (o lista) donde se almacenan los clientes
	 */
	private ArrayList <Cliente> cliente;

	/**
	 * Carpeta global donde se guardan los ficheros
	 */
	private static final String RUTA = "./Ficheros/";

	/**
	 * Fichero donde se guardan y se leen los datos
	 */
	private static final String fclientes = "fclientes.txt";

	/**
	 * Inicializa el objeto y todos los elementos asociados.
	 */
	public ListaClientes (){
		
		cliente = new ArrayList ();
		
	}

	/**
	 * Guarda el cliente introducido en el array
	 * @param x (Cliente a añadir)
	 *
	 */
	public void anyadir (Cliente x){
		
		cliente.add(x);
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un nombre
	 * @param nombre (Nombre a buscar)
	 * @return (Devuelve el cliente en caso de que lo encuentre y null en el caso contrario)
	 *
	 */
	public Cliente buscarNombre (String nombre){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un DNI
	 * @param dni (DNI a buscar)
	 * @return (Devuelve el cliente en caso de que lo encuentre y null en el caso contrario)
	 *
	 */
	public Cliente buscarDni (String dni){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	/*
	/**
	 * @deprecated
	 *
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
		
	}*/

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un nombre
	 * @param nombre (Nombre a buscar)
	 * @return (Devuelve true si existe el cliente con el nombre introducido y lo elimina,
	 * false si no lo encuentra)
	 *
	 */
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

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un DNI
	 * @param dni (DNI a buscar)
	 * @return (Devuelve true si existe el cliente con el código introducido y lo elimina,
	 * false si no lo encuentra)
	 *
	 */
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

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarLE(){
		
		String cadena = "";
		
		for (int i = 0; i < cliente.size(); i++){
			
			cadena += cliente.get(i).mostrarCliente() +"\n\n";
			
		}
		
		return cadena;
		
	}

	/**
	 * Vuelca el contenido del array en el fichero
	 */
	public void guardarClientes () throws Exception{
		
		//Cliente cliente = new Cliente (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fclientes);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < cliente.size(); i++){
				
				bw.write(cliente.get(i).getTelefono()+"|");
				bw.write(cliente.get(i).getNombre()+"|");
				bw.write(cliente.get(i).getDni()+"|");
				bw.write(cliente.get(i).getDireccion()+"|");
				bw.write(cliente.get(i).getCuentaBancaria()+"|");
				bw.write(cliente.get(i).getEmail()+"|");
				bw.write(cliente.get(i).getSexo());
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
	public void leerClientes () throws Exception{
		
		//Cliente cliente = new Cliente (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fclientes);
			FileReader fr = new FileReader(fs);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer tokens;
			int telefono;
			String cadena, nombre, dni, direccion, cuentaBancaria, email, sexo;
			
			while ( (cadena = br.readLine()) != null){
				
				tokens = new StringTokenizer(cadena, "|");
				
				telefono = Integer.parseInt((String)tokens.nextToken());
				nombre = (String)tokens.nextToken();
				dni = (String)tokens.nextToken();
				direccion = (String)tokens.nextToken();
				cuentaBancaria = (String)tokens.nextToken();
				email = (String)tokens.nextToken();
				sexo = (String)tokens.nextToken();
				
				cliente.add(new Cliente(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo));
				
			}
			
			if (br != null){
			
				br.close();
				fr.close();
			
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}
	
}
