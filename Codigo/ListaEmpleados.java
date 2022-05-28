import java.util.*;
import java.io.*;

/**
 * Clase ListaEmpleados
 *
 * Contiene los métodos y las operaciones para la administrar el array de Empleados
 * que utiliza el programa. Entre las operaciones que realiza se encuentran las de añadir,
 * buscar y eliminar por nombre y DNI, mostrar la lista completa de empleados y leer y cargar
 * en fichero los datos del array.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class ListaEmpleados {

	/**
	 * Array (o lista) donde se almacenan los empleados
	 */
	private ArrayList <Empleado> empleado;

	/**
	 * Carpeta global donde se guardan los ficheros
	 */
	private static final String RUTA = "./Ficheros/";

	/**
	 * Fichero donde se guardan y se leen los datos
	 */
	private static final String fempleados = "fempleados.txt";

	/**
	 * Inicializa el objeto y todos los elementos asociados.
	 */
	public ListaEmpleados (){
		
		empleado = new ArrayList ();
		
	}

	/**
	 * Guarda el empleado introducido en el array
	 * @param x (Empleado a añadir)
	 *
	 */
	public void anyadir (Empleado x){
		
		empleado.add(x);
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un nombre
	 * @param nombre (Nombre a buscar)
	 * @return (Devuelve el empleado en caso de que lo encuentre y null en el caso contrario)
	 *
	 */
	public Empleado buscarNombre (String nombre){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un DNI
	 * @param dni (DNI a buscar)
	 * @return (Devuelve el empleado en caso de que lo encuentre y null en el caso contrario)
	 *
	 */
	public Empleado buscarDni (String dni){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	/*
	/**
	 * @deprecated
	 *
	public Empleado buscarID (int id){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getID() == id){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarID (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getID() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			empleado.remove(posicion);
		
			return true;
		
	}*/

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un nombre
	 * @param nombre (Nombre a buscar)
	 * @return (Devuelve true si existe el empleado con el nombre introducido y lo elimina,
	 * false si no lo encuentra)
	 *
	 */
	public boolean eliminarNombre (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			empleado.remove(posicion);
		
			return true;
		
	}

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un DNI
	 * @param dni (DNI a buscar)
	 * @return (Devuelve true si existe el empleado con el código introducido y lo elimina,
	 * false si no lo encuentra)
	 *
	 */
	public boolean eliminarDni (String dni){
		
		int posicion = -1;
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			empleado.remove(posicion);
		
			return true;
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarLE(){
		
		String cadena = "";
		
		for (int i = 0; i < empleado.size(); i++){
			
			cadena += empleado.get(i).mostrarEmpleado() +"\n\n";
			
		}
		
		return cadena;
		
	}

	/**
	 * Vuelca el contenido del array en el fichero
	 */
	public void guardarEmpleados () throws Exception{
		
		//Empleado empleado = new Empleado (autorizacion, puesto, telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fempleados);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < empleado.size(); i++){
				
				bw.write(empleado.get(i).getAutorizacion()+"|");
				bw.write(empleado.get(i).getPuesto()+"|");
				bw.write(empleado.get(i).getTelefono()+"|");
				bw.write(empleado.get(i).getNombre()+"|");
				bw.write(empleado.get(i).getDni()+"|");
				bw.write(empleado.get(i).getDireccion()+"|");
				bw.write(empleado.get(i).getCuentaBancaria()+"|");
				bw.write(empleado.get(i).getEmail()+"|");
				bw.write(empleado.get(i).getSexo());
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
	public void leerEmpleados () throws Exception{
		
		//Empleado empleado = new Empleado (autorizacion, puesto, telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fempleados);
			FileReader fr = new FileReader(fs);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer tokens;
			int telefono;
			String cadena, autorizacion, puesto, nombre, dni, direccion, cuentaBancaria, email, sexo;
			
			while ( (cadena = br.readLine()) != null){
				
				tokens = new StringTokenizer(cadena, "|");
				
				autorizacion = (String)tokens.nextToken();
				puesto = (String)tokens.nextToken();
				telefono = Integer.parseInt((String)tokens.nextToken());
				nombre = (String)tokens.nextToken();
				dni = (String)tokens.nextToken();
				direccion = (String)tokens.nextToken();
				cuentaBancaria = (String)tokens.nextToken();
				email = (String)tokens.nextToken();
				sexo = (String)tokens.nextToken();
				
				empleado.add(new Empleado(autorizacion, puesto, telefono, nombre, dni, direccion, cuentaBancaria, email, sexo));
				
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

