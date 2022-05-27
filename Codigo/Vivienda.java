import java.util.*;
import java.io.*;

/**
 * Clase Vivienda
 *
 * Contiene los métodos y las operaciones para crear una vivienda mediante la introducción
 * de datos como el precio, el nombre, las dimensiones, la dirección, el estado
 * y una descripción de la vivienda.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class Vivienda {
	
	//private static int numero = 1;
	//private int codViv;
	/**
	 * Precio de la vivienda
	 */
	private double precio;

	/**
	 * Nombre, dimensioes, dirección, estado y descripción de la vivienda
	 */
	private String nombre, dimensiones, direccion, estado, descripcion;
	//Usuario usuario;

	/**
	 * Inicializa el objeto y todos los elementos asociados
	 * @param precio (precio de la vivienda)
	 * @param nombre (nombre de la vivienda)
	 * @param dimensiones (dimensiones de la vivienda)
	 * @param direccion (dirección de la vivienda)
	 * @param estado (estado de la vivienda)
	 * @param descripcion (descripcion de la vivienda)
	 */
	public Vivienda (double precio, String nombre, String dimensiones, String direccion, String estado, String descripcion/*, Usuario usuario*/){
		
		//codViv = numero;
		this.precio = precio;
		this.nombre = nombre;
		this.dimensiones = dimensiones;
		this.direccion = direccion;
		this.estado = estado;
		this.descripcion = descripcion;
		//this.usuario = usuario;
		//numero++;
		
	}

	/**
	 * @deprecated
	 */
	/*public void setUsuario (Usuario usuario){
		
		this.usuario = usuario;
		
	}
	
	public Usuario getUsuario (){
		
		return usuario;
		
	}
	
	public void setCodViv (int codViv){
		
		this.codViv = codViv;
		
	}
	
	public int getCodViv (){
		
		return codViv;
		
	}*/

	/**
	 * Guarda o asigna el dato introducido a la variable resviv
	 * @param nombre (Nombre de la vivienda)
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
	 * Guarda o asigna el dato introducido a la variable dimensiones
	 * @param dimensiones (Dimensiones de la vivienda)
	 *
	 */
	public void setDimensiones (String dimensiones){
		
		this.dimensiones = dimensiones;
		
	}

	/**
	 * @return (Devuelve la variable dimensiones)
	 *
	 */
	public String getDimensiones (){
		
		return dimensiones;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable dimensiones
	 * @param direccion (Dirección de la vivienda)
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
	 * Guarda o asigna el dato introducido a la variable estado
	 * @param estado (Estado de la vivienda)
	 *
	 */
	public void setEstado (String estado){
		
		this.estado = estado;
		
	}

	/**
	 * @return (Devuelve la variable estado)
	 *
	 */
	public String getEstado (){
		
		return estado;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable descripcion
	 * @param descripcion (Descripción de la vivienda)
	 *
	 */
	public void setDescripcion (String descripcion){
		
		this.descripcion = descripcion;
		
	}

	/**
	 * @return (Devuelve la variable descripcion)
	 *
	 */
	public String getDescripcion (){
		
		return descripcion;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable precio
	 * @param precio (Precio de la vivienda)
	 *
	 */
	public void setPrecio (double precio){
		
		this.precio = precio;
		
	}

	/**
	 * @return (Devuelve la variable precio)
	 *
	 */
	public double getPrecio (){
		
		return precio;
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarViv(){
		
		return "Nombre de la vivienda: " +nombre +"\nDimensiones: " +dimensiones +"\nDireccion: " +direccion 
		+"\nPrecio por noche: " +precio +" euros" +"\nEstado: " +estado +"\nDescripcion: " +descripcion;
		
	}
	
}

