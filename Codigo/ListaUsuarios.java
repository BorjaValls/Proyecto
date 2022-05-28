import java.util.*;
import java.io.*;

/**
 * Clase ListaUsuarios
 *
 * Contiene los métodos y las operaciones para la administrar el array de Usuarios
 * que utiliza el programa. Entre las operaciones que realiza se encuentran las de añadir,
 * buscar y eliminar por nombre y DNI, mostrar la lista completa de usuarios y leer y cargar
 * en fichero los datos del array.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class ListaUsuarios {

	/**
	 * Carpeta global donde se guardan los ficheros
	 */
	private static final String RUTA = "./Ficheros/";

	/**
	 * Fichero donde se guardan y se leen los datos
	 */
	private static final String fusuarios = "fusuarios.txt";

	/**
	 * Array (o lista) donde se almacenan los usuarios
	 */
	private ArrayList <Usuario> usuarios;


	/**
	 * Inicializa el objeto y todos los elementos asociados.
	 */
	public ListaUsuarios (){
		
		usuarios = new ArrayList ();
		
	}

	/**
	 * Guarda el usuario introducido en el array
	 * @param x (Usuario a añadir)
	 *
	 */
	public void anyadir (Usuario x){
		
		usuarios.add(x);
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un nombre
	 * @param nombre (Nombre a buscar)
	 * @return (Devuelve el usuario en caso de que lo encuentre y null en el caso contrario)
	 *
	 */
	public Usuario buscarNombre (String nombre){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un DNI
	 * @param dni (DNI a buscar)
	 * @return (Devuelve el usuario en caso de que lo encuentre y null en el caso contrario)
	 *
	 */
	public Usuario buscarDni (String dni){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	/*
	/**
	 * @deprecated
	 *
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
		
	}*/

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un nombre
	 * @param nombre (Nombre a buscar)
	 * @return (Devuelve true si existe el usuario con el nombre introducido y lo elimina,
	 * false si no lo encuentra)
	 *
	 */
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

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un DNI
	 * @param dni (DNI a buscar)
	 * @return (Devuelve true si existe el usuario con el código introducido y lo elimina,
	 * false si no lo encuentra)
	 *
	 */
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

	/**
	 * Busca coincidencias y elimina la vivienda del usuario mediante la introducción de un nombre
	 * @param nombre (Nombre a buscar)
	 * @return (Devuelve true si existe la vivienda con el nombre introducido y la elimina,
	 * false si no la encuentra)
	 *
	 */
	public boolean borrarVivUs (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
				
			if (usuarios.get(i).eliminarCodViv(nombre)){
					
				posicion = i;
					
			}
				
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			return true;
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarLU(){
		
		String cadena = "";
		
		for (int i = 0; i < usuarios.size(); i++){
			
			cadena += usuarios.get(i).mostrarVU() +"\n";
			
		}
		
		return cadena;
		
	}

	/**
	 * Vuelca el contenido del array en el fichero
	 */
	public void guardarUsuarios () throws Exception{
		
		//Usuario usuario = new Usuario (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fusuarios);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < usuarios.size(); i++){
				
				bw.write(usuarios.get(i).getTelefono()+"|");
				bw.write(usuarios.get(i).getNombre()+"|");
				bw.write(usuarios.get(i).getDni()+"|");
				bw.write(usuarios.get(i).getDireccion()+"|");
				bw.write(usuarios.get(i).getCuentaBancaria()+"|");
				bw.write(usuarios.get(i).getEmail()+"|");
				bw.write(usuarios.get(i).getSexo());
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
	public void leerUsuarios () throws Exception{
		
		//Usuario usuario = new Usuario (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fusuarios);
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
				
				usuarios.add(new Usuario(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo));
				
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

