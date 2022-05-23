import java.util.*;
import java.io.*;

public class ListaEmpleados {
	
	private ArrayList <Empleado> empleado;
	private static final String RUTA = "./Ficheros/";
	private static final String fempleados = "fempleados.txt";
	
	public ListaEmpleados (){
		
		empleado = new ArrayList ();
		
	}
	
	public void anyadir (Empleado x){
		
		empleado.add(x);
		
	}
	
	public Empleado buscarNombre (String nombre){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Empleado buscarDni (String dni){
		
		for (int i = 0; i < empleado.size(); i++){
			
			if (empleado.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return empleado.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	/*public Empleado buscarID (int id){
		
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
	
	public String mostrarLE(){
		
		String cadena = "";
		
		for (int i = 0; i < empleado.size(); i++){
			
			cadena += empleado.get(i).mostrarEmpleado() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
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
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}
	
}

