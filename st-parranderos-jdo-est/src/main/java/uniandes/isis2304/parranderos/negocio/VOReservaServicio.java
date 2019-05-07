package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public interface VOReservaServicio {
	
	public long getId();
	
	public Timestamp getFechaInicio();
	
	public Timestamp getFechaFinal();
	
	public long getIdCliente();
	
	public String getTipoDoc();
	
	public long getIdHotel();
	
	public String getTipo();
}
