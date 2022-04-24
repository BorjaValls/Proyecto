import java.util.*;
import java.io.*;

public class Cliente extends Persona{
	
	public Cliente (int telefono, String nombre, String dni, String direccion, String cuentaBancaria, String email, String sexo){
		super(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		
	}
	
	public String mostrarCliente(){
		
		String cadena = "Cliente: " +"\n" +toString() +"\n\n";
		
		return cadena;
		
	}
	
}

