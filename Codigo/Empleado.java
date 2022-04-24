import java.util.*;
import java.io.*;

public class Empleado extends Persona{
	
	private String autorizacion, puesto;
	
	public Empleado (String autorizacion, String puesto, int telefono, String nombre, String dni, String direccion, String cuentaBancaria, String email, String sexo){
		super(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		this.autorizacion = autorizacion;
		this.puesto = puesto;
		
	}
	
	public void setAutorizacion (String autorizacion){
		
		this.autorizacion = autorizacion;
		
	}
	
	public String getAutorizacion (){
		
		return autorizacion;
		
	}
	
	public void setPuesto (String puesto){
		
		this.puesto = puesto;
		
	}
	
	public String getPuesto (){
		
		return puesto;
		
	}
	
	public String mostrarEmpleado(){
		
		String cadena = "Empleado: " +"\n" +toString() +"\nAutorizacion: " +autorizacion +"\nPuesto de trabajo: " +puesto +"\n\n";
		
		return cadena;
		
	}
	
}

