import java.util.*;
import java.io.*;

public class Reserva {
	
	private static int numero = 1;
	private int codRerserva, duracion;
	private double importe;
	private String tipoPago, detalles;
	
	
	//Añadir método del importe una vez creado lo demás (o hacerlo en el main)
	public Reserva (int duracion, String tipoPago, String detalles){
		
		codRerserva = numero;
		this.duracion = duracion;
		this.tipoPago = tipoPago;
		this.detalles = detalles;
		numero++;
		
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
	
	public void setDuracion (int duracion){
		
		this.duracion = duracion;
		
	}
	
	public int getDuracion (){
		
		return duracion;
		
	}
	
	public String mostrarReserva(){
		
		return "Codigo de reserva: " +codRerserva +"\nDuracion: " +duracion +"\nTipo de pago: " +tipoPago +"\nDetalles: " +detalles;
		
	}
	
}

