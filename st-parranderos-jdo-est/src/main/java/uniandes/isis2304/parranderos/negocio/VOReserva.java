package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public interface VOReserva {
	
	public long dgetIdHabitacion();
	
	public long getIdHotel();
	
	public String getTipoHabitacion();
	
	public Timestamp getFechaInicio();
	
	public Timestamp getFechasSalida();
	
	public int getNumPersonas();
	
	public String getTipoDoc();
	
	public long getDocCliente();
}
