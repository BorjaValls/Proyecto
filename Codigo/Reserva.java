import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.lang.Math;

/**
 * Clase Reserva
 *
 * Contiene los métodos y las operaciones para crear una reserva, calcular tanto la duración
 * como el immporte total de esta y los datos base como el tipo de pago, la vivienda en la que se basa la reserva
 * y los detalles de la reserva.
 *
 * @author Borja Valls García
 * @version 1.1
 */

public class Reserva {
	
	//private static int numero = 1;
	/**
	 * Código de reserva
	 */
	private int codRerserva;

	/**
	 * Importe de la reserva
	 */
	private double importe;

	/**
	 * El tipo de pago y los detalles de la reserva
	 */
	private String tipoPago, detalles;

	/**
	 * Variable relacionada  a la vivienda utilizada en la reserva
	 */
	private Vivienda resviv;

	/**
	 * Fecha inicial y final de la reserva
	 */
	private Date fechaInicio, fechaFinal;

	/**
	 * Duracion en dias de la reserva
	 */
	private long duracion;


	/**
	 * Inicializa el objeto y todos los elementos asociados
	 * @param tipoPago (tipo de pago)
	 * @param detalles (detalles de la reserva)
	 * @param resviv (vivienda utilizada en la reserva)
	 */
	public Reserva (String tipoPago, String detalles, Vivienda resviv){
		
		codRerserva = (int)(Math.random()*99999998) + 1;
		this.tipoPago = tipoPago;
		this.detalles = detalles;
		this.resviv = resviv;
		//numero++;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable resviv
	 * @param resviv (Vivienda utilizada en la reserva)
	 *
	 */
	public void setViv (Vivienda resviv){
		
		this.resviv = resviv;
		
	}

	/**
	 * @return (Devuelve la variable resviv)
	 *
	 */
	public Vivienda getViv (){
		
		return resviv;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable fechaInicio
	 * @param x (Fecha de inicio de la reserva)
	 *
	 */
	public void setInicio (String x) throws Exception{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		fechaInicio = sdf.parse(x);
		
	}

	/**
	 * @return (Devuelve la variable fechaInicio)
	 *
	 */
	public Date getInicio (){
		
		return fechaInicio;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable fechaFinal
	 * @param x (Fecha de final de la reserva)
	 *
	 */
	public void setFinal (String x) throws Exception{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		fechaFinal = sdf.parse(x);
		
	}

	/**
	 * @return (Devuelve la variable fechaFinal)
	 *
	 */
	public Date getFinal (){
		
		return fechaFinal;
		
	}

	/**
	 * Realiza el cálculo del importe total de la reserva
	 * y lo guarda en la variable importe.
	 *
	 */
	public void setImporte (){
		
		importe = resviv.getPrecio() * duracion;
		
	}

	/**
	 * @return (Devuelve la variable importe)
	 *
	 */
	public double getImporte (){
		
		return importe;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable tipoPago
	 * @param tipoPago (Tipo de pago)
	 *
	 */
	public void setTipoPago (String tipoPago){
		
		this.tipoPago = tipoPago;
		
	}

	/**
	 * @return (Devuelve la variable tipoPago)
	 *
	 */
	public String getTipoPago (){
		
		return tipoPago;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable detalles
	 * @param detalles (Detalles de la reserva)
	 *
	 */
	public void setDetalles (String detalles){
		
		this.detalles = detalles;
		
	}

	/**
	 * @return (Devuelve la variable detalles)
	 *
	 */
	public String getDetalles (){
		
		return detalles;
		
	}

	/**
	 * Guarda o asigna el dato introducido a la variable codRerserva
	 * @param codRerserva (Codigo de la reserva)
	 *
	 */
	public void setCodRerserva (int codRerserva){
		
		this.codRerserva = codRerserva;
		
	}

	/**
	 * @return (Devuelve la variable codRerserva)
	 *
	 */
	public int getCodRerserva (){
		
		return codRerserva;
		
	}

	/**
	 * Realiza el cálculo de la duración de la reserva y
	 * lo guarda en la variable duracion.
	 *
	 */
	public void setDuracion (){
		
		long diff = fechaFinal.getTime() - fechaInicio.getTime();
		TimeUnit tiempo = TimeUnit.DAYS;
		duracion = tiempo.convert(diff, TimeUnit.MILLISECONDS);
		
	}

	/**
	 * @return (Devuelve la variable duracion)
	 *
	 */
	public long getDuracion (){
		
		return duracion;
		
	}

	/**
	 * @return (Devuelve una cadena con los datos del objeto)
	 *
	 */
	public String mostrarReserva(){
		
		return "Reserva" +" - " +codRerserva +"\nDuracion: " +duracion +"\nImporte total: " 
		+importe +" euros" +"\nTipo de pago: " +tipoPago +"\nDetalles: " +detalles
		+"\nDatos vivienda reservada:" +"\n" +resviv.mostrarViv();
		
	}
	
}

