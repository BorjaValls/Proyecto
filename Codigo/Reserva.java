import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Reserva {
	
	private static int numero = 1;
	private int codRerserva;
	private double importe;
	private String tipoPago, detalles, in, fin;
	private Vivienda resviv;
	private Date fechaInicio, fechaFinal;
	private long duracion;
	
	
	//Añadir método del importe una vez creado lo demás (o hacerlo en el main)
	public Reserva (String tipoPago, String detalles, Vivienda resviv){
		
		codRerserva = numero;
		this.tipoPago = tipoPago;
		this.detalles = detalles;
		this.resviv = resviv;
		numero++;
		
	}
	
	public void setInicio (String x) throws Exception{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		fechaInicio = sdf.parse(x);
		
	}
	
	public Date getInicio (){
		
		return fechaInicio;
		
	}
	
	public void setFinal (String x) throws Exception{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		fechaFinal = sdf.parse(x);
		
	}
	
	public Date getFinal (){
		
		return fechaFinal;
		
	}
	
	public void setImporte (){
		
		importe = resviv.getPrecio() * duracion;
		
	}
	
	public double getImporte (){
		
		return importe;
		
	}
	
	public void setTipoPago (String tipoPago){
		
		this.tipoPago = tipoPago;
		
	}
	
	public String getTipoPago (){
		
		return tipoPago;
		
	}
	
	public void setDetalles (String detalles){
		
		this.detalles = detalles;
		
	}
	
	public String getDetalles (){
		
		return detalles;
		
	}
	
	public void setCodRerserva (int codRerserva){
		
		this.codRerserva = codRerserva;
		
	}
	
	public int getCodRerserva (){
		
		return codRerserva;
		
	}
	
	public void setDuracion (){
		
		long diff = fechaFinal.getTime() - fechaInicio.getTime();
		TimeUnit tiempo = TimeUnit.DAYS;
		duracion = tiempo.convert(diff, TimeUnit.MILLISECONDS);
		
	}
	
	public long getDuracion (){
		
		return duracion;
		
	}
	
	public String mostrarReserva(){
		
		return "Reserva" +" - " +codRerserva +"\nDuracion: " +duracion +"\nImporte total: " 
		+importe +" euros" +"\nTipo de pago: " +tipoPago +"\nDetalles: " +detalles
		+"\nDatos vivienda reservada:" +"\n" +resviv.mostrarViv();
		
	}
	
}

