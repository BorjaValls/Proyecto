import java.util.*;
import java.io.*;

public class Persona {
	
	private static int numero = 1;
	private int id;
	private String nombre, dni, direccion, cuentaBancaria, email;
	
	public Persona (String nombre, String dni, String direccion, String cuentaBancaria, String email){
		
		id = numero;
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.cuentaBancaria = cuentaBancaria;
		this.email = email;
		numero++;
		
	}
	
	public void setNombre (String nombre){
		
		this.nombre = nombre;
		
	}
	
	public String getNombre (){
		
		return nombre;
		
	}
	
	public void setDni (String dni){
		
		this.dni = dni;
		
	}
	
	public String geDni (){
		
		return dni;
		
	}
	public void setDireccion (String direccion){
		
		this.direccion = direccion;
		
	}
	
	public String getDireccion (){
		
		return direccion;
		
	}
	
	public void setCuentaBancaria (String cuentaBancaria){
		
		this.cuentaBancaria = cuentaBancaria;
		
	}
	
	public String getCuentaBancaria (){
		
		return cuentaBancaria;
		
	}
	
	public void setEmail (String email){
		
		this.email = email;
		
	}
	
	public String getEmail (){
		
		return email;
		
	}
	
	public void setID (int id){
		
		this.id = id;
		
	}
	
	public int getID (){
		
		return id;
		
	}
	
	public String toString(){
		
		return id +" - " +nombre +"\nDNI: " +dni +"\nDireccion: " +direccion +"\nCuenta bancaria: " +cuentaBancaria +"\nEmail: " +email;
		
	}
	
}

