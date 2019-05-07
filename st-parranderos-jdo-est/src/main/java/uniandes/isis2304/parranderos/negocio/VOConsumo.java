package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public interface VOConsumo {
	
	public long getId();
	
	public Timestamp getFechaInicio();
	
	public Timestamp getFechaFin();
	
	public int getCantidad();
	
	public char getCargo();
	
	public long getIdProducto();
	
	public long getHabitacion();
	
	public long getIdHotel();
}
