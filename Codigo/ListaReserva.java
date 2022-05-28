import java.util.*;
import java.io.*;

/**
 * Clase ListaReserva
 *
 * Contiene los métodos y las operaciones para la administrar el array de Reservas
 * que utiliza el programa. Entre las operaciones que realiza se encuentran las de añadir,
 * buscar y eliminar por código de reserva, mostrar la lista completa de reservas, leer y cargar
 * en fichero los datos del array y generar un documento html.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class ListaReserva {

	/**
	 * Array (o lista) donde se almacenan las reservas
	 */
	private ArrayList <Reserva> reserva;

	/**
	 * Carpeta global donde se guardan los ficheros
	 */
	private static final String RUTA = "./Ficheros/";

	/**
	 * Fichero donde se guardan y se lee los datos
	 */
	private static final String freservas = "freservas.txt";

	/**
	 * Inicializa el objeto y todos los elementos asociados.
	 */
	public ListaReserva (){
		
		reserva = new ArrayList ();
		
	}

	/**
	 * Guarda la reserva introducida en el array
	 * @param x (Reserva a añadir)
	 *
	 */
	public void anyadir (Reserva x){
		
		reserva.add(x);
		
	}

	/**
	 * Busca coincidencias en el array mediante la introducción de un nombre
	 * @param id (Código a buscar)
	 * @return (Devuelve la vivienda en caso de que la encuentre y null en el caso contrario)
	 *
	 */
	public Reserva buscarCodReserva (int id){
		
		for (int i = 0; i < reserva.size(); i++){
			
			if (reserva.get(i).getCodRerserva() == id){
				
				return reserva.get(i);
				
			}
			
		}
		
		return null;
		
	}

	/**
	 * Busca coincidencias y elimina en el array mediante la introducción de un nombre
	 * @param id (Código a buscar)
	 * @return (Devuelve true si existe la reserva con el código introducido y la elimina,
	 * false si no la encuentra)
	 *
	 */
	public boolean eliminarCodReserva (int id){
		
		int posicion = -1;
		
		for (int i = 0; i < reserva.size(); i++){
			
			if (reserva.get(i).getCodRerserva() == id){
				
				posicion = i;
				
			}
			
		}
		
		if (posicion == -1){
			
			return false;
			
		}else
		
			reserva.remove(posicion);
		
			return true;
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarLR(){
		
		String cadena = "";
		
		for (int i = 0; i < reserva.size(); i++){
			
			cadena += reserva.get(i).mostrarReserva() +"\n\n";
			
		}
		
		return cadena;
		
	}

	/**
	 * Vuelca el contenido del array en el fichero
	 */
	public void guardarReservas () throws Exception{
		
		//Reserva reserva = new Reserva (pago, detalles, buscarVivienda2);
		
		try{
			
			File fs = new File(RUTA+freservas);
			FileWriter fw = new FileWriter(fs);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < reserva.size(); i++){
				
				bw.write(reserva.get(i).getTipoPago()+"|");
				bw.write(reserva.get(i).getDetalles()+"|");
				bw.write(reserva.get(i).getViv().getNombre()); //que solo me guarde el nombre
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

	/**
	 * Vuelca el contenido del fichero en el array
	 * @param lista (Lista de viviendas para vilcular a la reserva)
	 *
	 */
	public void leerReservas (ListaViviendas lista) throws Exception{
		
		//Reserva reserva = new Reserva (pago, detalles, buscarVivienda2);
		
		try{
			
			File fs = new File(RUTA+freservas);
			FileReader fr = new FileReader(fs);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer tokens;
			String cadena, pago, detalles, vivi;
			
			while ( (cadena = br.readLine()) != null){
				
				tokens = new StringTokenizer(cadena, "|");
				
				pago = (String)tokens.nextToken();
				detalles = (String)tokens.nextToken();
				vivi = (String)tokens.nextToken();
				Vivienda vivienda = lista.buscarNombreViv(vivi);
				
				reserva.add(new Reserva(pago, detalles, vivienda));
				
			}
			
			if (br != null){
			
				br.close();
				fr.close();
			
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}

	/**
	 * Escribe en un archivo la cadena con la plantilla del documento en HTML.
	 * @param reserva (Reserva de la que queremos generar el documento)
	 *
	 */
	public void generarReserva (Reserva reserva) throws Exception{
		
		try{
		
			File f = new File ("./Reservas/"+reserva.getCodRerserva()+".html");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw= new BufferedWriter(fw);

			bw.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
					"<html>\n" +
					"<head>\n" +
					"\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/>\n" +
					"\t<title></title>\n" +
					"\t<meta name=\"generator\" content=\"LibreOffice 7.2.5.2 (Linux)\"/>\n" +
					"\t<meta name=\"created\" content=\"2022-05-24T18:45:43.279000000\"/>\n" +
					"\t<meta name=\"changed\" content=\"2022-05-24T20:27:17.102000000\"/>\n" +
					"\t<style type=\"text/css\">\n" +
					"\t\t@page { size: 8.27in 11.69in; margin: 0.79in }\n" +
					"\t\tp { line-height: 115%; margin-bottom: 0.1in; background: transparent }\n" +
					"\t</style>\n" +
					"</head>\n" +
					"<body lang=\"es-ES\" link=\"#000080\" vlink=\"#800000\" dir=\"ltr\"><p align=\"center\" style=\"line-height: 100%; margin-bottom: 0in\">\n" +
					"\t</p>\n" +
					"<p align=\"center\" style=\"line-height: 100%; margin-bottom: 0in\"><img src=\"./Plantilla generación reserva_html_3baad9275884190c.png\" name=\"Imagen1\" align=\"left\" width=\"108\" height=\"108\" border=\"0\"/>\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p align=\"center\" style=\"line-height: 100%; margin-bottom: 0in\"><font face=\"Arial, sans-serif\"><font size=\"7\" style=\"font-size: 32pt\"><b>ALOJAMIENTOS\n" +
					"BORJA</b></font></font></p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><font face=\"Arial, sans-serif\"><font size=\"5\" style=\"font-size: 18pt\"><b>RESERVA\n" +
					reserva.getCodRerserva()+"</b></font></font></p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">Esta\n" +
					"es la factura por la estancia en "+reserva.getViv().getNombre()+" durante la\n" +
					"duración de "+reserva.getDuracion()+" noches, en la dirección" +reserva.getViv().getDireccion() +"\n" +
					", por una cantidad de "+reserva.getImporte() +"euros. El\n" +
					"pago de este será mediante "+reserva.getTipoPago()+".</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">El\n" +
					"cliente se compromete a acudir a las instalaciones el dia "+reserva.getInicio()+"\n" +
					" para recoger las llaves de la casa y en el mismo lugar el dia\n" +
					reserva.getFinal()+" a devolverlas.</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">Detalles\n" +
					"de la reserva: "+reserva.getDetalles()+"</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">A\n" +
					"continuación los detalles del alojamiento:</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-left: 0.39in; margin-right: 0.39in; margin-bottom: 0in; background: transparent; page-break-before: auto\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">Vivienda\n" +
					reserva.getViv().getNombre()+"</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-left: 0.39in; margin-right: 0.39in; margin-bottom: 0in; background: transparent\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">Dimensiones:\n" +
					reserva.getViv().getDimensiones()+"</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-left: 0.39in; margin-right: 0.39in; margin-bottom: 0in; background: transparent\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">Dirección:\n" +
					reserva.getViv().getDireccion()+"</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-left: 0.39in; margin-right: 0.39in; margin-bottom: 0in; background: transparent\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">Descripción\n" +
					"de la vivienda: "+reserva.getViv().getDescripcion()+"</font></font></p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-left: 0.39in; margin-right: 0.39in; margin-bottom: 0in; background: transparent\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<br/>\n" +
					"\n" +
					"</p>\n" +
					"<p style=\"font-weight: normal; line-height: 100%; margin-bottom: 0in\">\n" +
					"<font face=\"Arial, sans-serif\"><font size=\"3\" style=\"font-size: 13pt\">El\n" +
					"cliente se compromete a cumplir con las condiciones de uso y servicio\n" +
					"de los alojamientos y demás instalaciones de <i>Alojamientos Borja.\n" +
					"</i><span style=\"font-style: normal\">El maltrato o vandalizado de las\n" +
					"instalaciones, propiedades u objetos dentro de ellas por parte de los\n" +
					"clientes conllevará multas de hasta 300% del daño causado, así\n" +
					"como la prohibición de volver a usar la plataforma para adquirir\n" +
					"servicios de nuevo.</span></font></font></p>\n" +
					"<p style=\"line-height: 100%; margin-bottom: 0in\"><br/>\n" +
					"\n" +
					"</p>\n" +
					"</body>\n" +
					"</html>");
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}
	
}

