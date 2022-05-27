import java.util.*;
import java.io.*;

/**
 * Clase Abstracta Persona
 *
 * Contiene los métodos y las operaciones para introducir los datos globales de las subclases de personas
 * entre las que se incluyen la introducción del teléfono, nombre, dni, dirección, cuenta bancaria, email
 * y sexo de la persona.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public abstract class Persona {
	
	//private static int numero = 1;
	/**
	 * Numero de teléfono
	 */
	private int /*id,*/ telefono;

	/**
	 * Nombre (y/o apellidos), dni, direccion de domicilio de la persona, cuenta bancaria, correo electrónico y sexo
	 */
	private String nombre, dni, direccion, cuentaBancaria, email, sexo;

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
	public Persona (int telefono, String nombre, String dni, String direccion, String cuentaBancaria, String email, String sexo){
		
		//id = numero;
		this.telefono = telefono;
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.cuentaBancaria = cuentaBancaria;
		this.email = email;
		this.sexo = sexo;
		//numero++;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable telefono
	 * @param telefono (El telefono de la persona)
	 *
	 */
	public void setTelefono (int telefono){
		
		this.telefono = telefono;
		
	}

	/**
	 * @return (Devuelve la variable telefono)
	 *
	 */
	public int getTelefono (){
		
		return telefono;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable nombre
	 * @param nombre (El nombre de la persona)
	 *
	 */
	public void setNombre (String nombre){
		
		this.nombre = nombre;
		
	}

	/**
	 * @return (Devuelve la variable nombre)
	 *
	 */
	public String getNombre (){
		
		return nombre;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable dni
	 * @param dni (El dni de la persona)
	 *
	 */
	public void setDni (String dni){
		
		this.dni = dni;
		
	}

	/**
	 * @return (Devuelve la variable dni)
	 *
	 */
	public String getDni (){
		
		return dni;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable direccion
	 * @param direccion (La direccion domiciliar de la persona)
	 *
	 */
	public void setDireccion (String direccion){
		
		this.direccion = direccion;
		
	}

	/**
	 * @return (Devuelve la variable direccion)
	 *
	 */
	public String getDireccion (){
		
		return direccion;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable cuentaBancaria
	 * @param cuentaBancaria (La cuenta bancaria de la persona)
	 *
	 */
	public void setCuentaBancaria (String cuentaBancaria){
		
		this.cuentaBancaria = cuentaBancaria;
		
	}

	/**
	 * @return (Devuelve la variable cuentaBancaria)
	 *
	 */
	public String getCuentaBancaria (){
		
		return cuentaBancaria;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable email
	 * @param email (El correo electrónico de la persona)
	 *
	 */
	public void setEmail (String email){
		
		this.email = email;
		
	}

	/**
	 * @return (Devuelve la variable email)
	 *
	 */
	public String getEmail (){
		
		return email;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable sexo
	 * @param sexo (El sexo de la persona)
	 *
	 */
	public void setSexo (String sexo){
		
		this.sexo = sexo;
		
	}

	/**
	 * @return (Devuelve la variable sexo)
	 *
	 */
	public String getSexo (){
		
		return sexo;
		
	}

	/*
	/**
	 * @deprecated
	 *
	public void setID (int id){
		
		this.id = id;
		
	}

	public int getID (){
		
		return id;
		
	}
	*/

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String toString(){
		
		return /*id +" - " +*/nombre +"\nSexo: " +sexo +"\nDNI: " +dni +"\nDireccion: " +direccion +"\nCuenta bancaria: " +cuentaBancaria +"\nEmail: " +email;
		
	}
	
}

