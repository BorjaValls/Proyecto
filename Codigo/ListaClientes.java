import java.util.*;
import java.io.*;

public class ListaClientes {
	
	private ArrayList <Cliente> cliente;
	private static final String RUTA = "./Ficheros/";
	private static final String fclientes = "fclientes.txt";
	
	public ListaClientes (){
		
		cliente = new ArrayList ();
		
	}
	
	public void anyadir (Cliente x){
		
		cliente.add(x);
		
	}
	
	public Cliente buscarNombre (String nombre){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Cliente buscarDni (String dni){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	/*public Cliente buscarID (int id){
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getID() == id){
				
				return cliente.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarID (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getID() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			cliente.remove(posicion);
		
			return true;
		
	}*/
	
	public boolean eliminarNombre (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			cliente.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarDni (String dni){
		
		int posicion = -1;
		
		for (int i = 0; i < cliente.size(); i++){
			
			if (cliente.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			cliente.remove(posicion);
		
			return true;
		
	}
	
	public String mostrarLE(){
		
		String cadena = "";
		
		for (int i = 0; i < cliente.size(); i++){
			
			cadena += cliente.get(i).mostrarCliente() +"\n\n";
			
		}
		
		return cadena;
		
	}
	
	public void guardarClientes () throws Exception{
		
		//Cliente cliente = new Cliente (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fclientes);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < cliente.size(); i++){
				
				bw.write(cliente.get(i).getTelefono()+"|");
				bw.write(cliente.get(i).getNombre()+"|");
				bw.write(cliente.get(i).getDni()+"|");
				bw.write(cliente.get(i).getDireccion()+"|");
				bw.write(cliente.get(i).getCuentaBancaria()+"|");
				bw.write(cliente.get(i).getEmail()+"|");
				bw.write(cliente.get(i).getSexo());
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
	
	public void leerClientes () throws Exception{
		
		//Cliente cliente = new Cliente (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fclientes);
			FileReader fr = new FileReader(fs);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer tokens;
			int telefono;
			String cadena, nombre, dni, direccion, cuentaBancaria, email, sexo;
			
			while ( (cadena = br.readLine()) != null){
				
				tokens = new StringTokenizer(cadena, "|");
				
				telefono = Integer.parseInt((String)tokens.nextToken());
				nombre = (String)tokens.nextToken();
				dni = (String)tokens.nextToken();
				direccion = (String)tokens.nextToken();
				cuentaBancaria = (String)tokens.nextToken();
				email = (String)tokens.nextToken();
				sexo = (String)tokens.nextToken();
				
				cliente.add(new Cliente(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo));
				
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
