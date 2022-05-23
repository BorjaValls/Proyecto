import java.util.*;
import java.io.*;

public class ListaUsuarios {
	
	private static final String RUTA = "./Ficheros/";
	private static final String fusuarios = "fusuarios.txt";
	private ArrayList <Usuario> usuarios;
	
	public ListaUsuarios (){
		
		usuarios = new ArrayList ();
		
	}
	
	public void anyadir (Usuario x){
		
		usuarios.add(x);
		
	}
	
	public Usuario buscarNombre (String nombre){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public Usuario buscarDni (String dni){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	/*public Usuario buscarID (int id){
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getID() == id){
				
				return usuarios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	public boolean eliminarID (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getID() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			usuarios.remove(posicion);
		
			return true;
		
	}*/
	
	public boolean eliminarNombre (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			usuarios.remove(posicion);
		
			return true;
		
	}
	
	public boolean eliminarDni (String dni){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
			
			if (usuarios.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			usuarios.remove(posicion);
		
			return true;
		
	}
	
	public boolean borrarVivUs (String nombre){
		
		int posicion = -1;
		
		for (int i = 0; i < usuarios.size(); i++){
				
			if (usuarios.get(i).eliminarCodViv(nombre)){
					
				posicion = i;
					
			}
				
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			return true;
		
	}
	
	public String mostrarLU(){
		
		String cadena = "";
		
		for (int i = 0; i < usuarios.size(); i++){
			
			cadena += usuarios.get(i).mostrarVU() +"\n";
			
		}
		
		return cadena;
		
	}
	
	public void guardarUsuarios () throws Exception{
		
		//Usuario usuario = new Usuario (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fusuarios);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < usuarios.size(); i++){
				
				bw.write(usuarios.get(i).getTelefono()+"|");
				bw.write(usuarios.get(i).getNombre()+"|");
				bw.write(usuarios.get(i).getDni()+"|");
				bw.write(usuarios.get(i).getDireccion()+"|");
				bw.write(usuarios.get(i).getCuentaBancaria()+"|");
				bw.write(usuarios.get(i).getEmail()+"|");
				bw.write(usuarios.get(i).getSexo());
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
	
	public void leerUsuarios () throws Exception{
		
		//Usuario usuario = new Usuario (telefono, nombre, dni, direccion, cuentaBancaria, email, sexo);
		
		try{
			
			File fs = new File(RUTA+fusuarios);
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
				
				usuarios.add(new Usuario(telefono, nombre, dni, direccion, cuentaBancaria, email, sexo));
				
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

