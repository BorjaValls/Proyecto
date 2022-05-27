import java.util.*;
import java.io.*;

/**
 * Clase Cliente
 *
 * Contiene los métodos y las operaciones para crear un cliente mediante la introducción
 * de datos como el teléfono, nombre, dni, dirección, cuenta bancaria, email
 * y sexo de la persona.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class Cliente extends Persona{

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
	public Cliente (int telefono, String nombre, String dni, String direccion, String cuentaBancaria, String email, String sexo){
		super(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarCliente(){
		
		String cadena = "Cliente: " +"\n" +toString() +"\n\n";
		
		return cadena;
		
	}
	
}

