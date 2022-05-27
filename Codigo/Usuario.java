import java.util.*;
import java.io.*;

/**
 * Clase Usuario
 *
 * Contiene los métodos y las operaciones para crear un usuario mediante la introducción
 * de datos como el teléfono, nombre, dni, dirección, cuenta bancaria, email
 * y sexo de la persona. Así como las viviendas propiedad del usuario y las operaciones para añadir y eliminarlas.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class Usuario extends Persona{

	/**
	 * Listado de viviendas propiedad del usuario
	 */
	private ArrayList <Vivienda> viviendas;

	/**
	 * Inicializa el objeto y todos los elementos asociados
	 * @param telefono (numero de teléfono)
	 * @param nombre (nombre (y/o apellidos de la persona)
	 * @param dni (documento nacional de identidad)
	 * @param direccion (domicilio personal)
	 * @param cuentaBancaria (cuenta personal del banco)
	 * @param email (correo electrónico)
	 * @param sexo (sexo)
	 */
	public Usuario (int telefono, String nombre, String dni, String direccion, String cuentaBancaria, String email, String sexo){
		super(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		viviendas = new ArrayList ();
		
	}

	/**
	 * Realiza la operación de añadir una vivienda a la lista
	 * de viviendas del usuario.
	 * @param x (Vivienda a añadir)
	 *
	 */
	public void anyadirViv (Vivienda x){
		
		viviendas.add(x);
		
	}

	/**
	 * Operación para buscar una vivienda en la lista mediante la introducción
	 * de un nombre. Si la encuentra devuelve la vivienda y en caso contrario
	 * devuelve null.
	 * @param nombre (Nombre de la vivienda)
	 * @return (Devuelve un objeto de clase Vivienda)
	 *
	 */
	public Vivienda buscarCodViv (String nombre){

		for (int i = 0; i < viviendas.size(); i++){

			if (viviendas.get(i).getNombre().equals(nombre)){

				return viviendas.get(i);

			}

		}
		
		return null;
		
	}

	/**
	 * Operación para buscar una vivienda en la lista mediante la introducción
	 * de un nombre. Si la encuentra la elimina y devuelve true y si no la
	 * encuentra devuelve false.
	 * @param nombre (Nombre de la vivienda)
	 * @return (Devuelve true o false)
	 *
	 */
	public boolean eliminarCodViv (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < viviendas.size(); i++){
			
			if (viviendas.get(i).getNombre().equals(nombre)){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			viviendas.remove(posicion);
		
			return true;
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarVU(){
		
		String cadena = "Usuario: " +toString() +"\n\n" +"VIVIENDAS DEL USUARIO:\n\n";
		
		for (int i = 0; i < viviendas.size(); i++){
			
			cadena += viviendas.get(i).mostrarViv() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
}

