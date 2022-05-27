import java.util.*;
import java.io.*;

/**
 * Clase Empleado
 *
 * Contiene los métodos y las operaciones para crear un empleado mediante la introducción
 * de datos como el teléfono, autorización, puesto, nombre, dni, dirección, cuenta bancaria, email
 * y sexo de la persona.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class Empleado extends Persona{

	/**
	 * Autorización y puesto del empleado
	 */
	private String autorizacion, puesto;

	/**
	 * Inicializa el objeto y todos los elementos asociados
	 * @param autorizacion (autorización del empleado)
	 * @param puesto (puesto del empleado)
	 * @param telefono (numero de teléfono)
	 * @param nombre (nombre (y/o apellidos del empleado)
	 * @param dni (documento nacional de identidad)
	 * @param direccion (domicilio personal)
	 * @param cuentaBancaria (cuenta personal del banco)
	 * @param email (correo electrónico)
	 * @param sexo (sexo)
	 */
	public Empleado (String autorizacion, String puesto, int telefono, String nombre, String dni, String direccion, String cuentaBancaria, String email, String sexo){
		super(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		this.autorizacion = autorizacion;
		this.puesto = puesto;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable autorizacion
	 * @param autorizacion (La autorizacion del empelado)
	 *
	 */
	public void setAutorizacion (String autorizacion){
		
		this.autorizacion = autorizacion;
		
	}

	/**
	 * @return (Devuelve la variable autorizacion)
	 *
	 */
	public String getAutorizacion (){
		
		return autorizacion;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable puesto
	 * @param puesto (El puesto del empelado)
	 *
	 */
	public void setPuesto (String puesto){
		
		this.puesto = puesto;
		
	}

	/**
	 * @return (Devuelve la variable puesto)
	 *
	 */
	public String getPuesto (){
		
		return puesto;
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarEmpleado(){
		
		String cadena = "Empleado: " +"\n" +toString() +"\nAutorizacion: " +autorizacion +"\nPuesto de trabajo: " +puesto +"\n\n";
		
		return cadena;
		
	}
	
}

