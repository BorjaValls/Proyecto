import java.util.*;
import java.io.*;

public class Vivienda {
	
	private static int numero = 1;
	private int codViv;
	private double precio;
	private String dimensiones, direccion, estado, descripcion;
	//Usuario usuario;
	
	public Vivienda (double precio, String dimensiones, String direccion, String estado, String descripcion/*, Usuario usuario*/){
		
		codViv = numero;
		this.precio = precio;
		this.dimensiones = dimensiones;
		this.direccion = direccion;
		this.estado = estado;
		this.descripcion = descripcion;
		//this.usuario = usuario;
		numero++;
		
	}
	
	/*public void setUsuario (Usuario usuario){
		
		this.usuario = usuario;
		
	}
	
	public Usuario getUsuario (){
		
		return usuario;
		
	}*/
	
	public void setCodViv (int codViv){
		
		this.codViv = codViv;
		
	}
	
	public int getCodViv (){
		
		return codViv;
		
	}
	
	public void setDimensiones (String dimensiones){
		
		this.dimensiones = dimensiones;
		
	}
	
	public String getDimensiones (){
		
		return dimensiones;
		
	}
	
	public void setDireccion (String direccion){
		
		this.direccion = direccion;
		
	}
	
	public String getDireccion (){
		
		return direccion;
		
	}
	
	public void setEstado (String estado){
		
		this.estado = estado;
		
	}
	
	public String getEstado (){
		
		return estado;
		
	}
	
	public void setDescripcion (String descripcion){
		
		this.descripcion = descripcion;
		
	}
	
	public String getDescripcion (){
		
		return descripcion;
		
	}
	
	public void setPrecio (double precio){
		
		this.precio = precio;
		
	}
	
	public double getPrecio (){
		
		return precio;
		
	}
	
	public String mostrarViv(){
		
		return "Vivienda numero " +codViv +"\nDimensiones: " +dimensiones +"\nDireccion: " +direccion 
		+"\nPrecio por noche: " +precio +" euros" +"\nEstado: " +estado +"\nDescripcion: " +descripcion;
		
	}
	
}

