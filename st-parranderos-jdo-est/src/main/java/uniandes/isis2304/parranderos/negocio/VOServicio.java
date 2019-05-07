package uniandes.isis2304.parranderos.negocio;

import java.sql.Timestamp;

public interface VOServicio {

	
	public long getId();

	public Timestamp getHoraApertura();
	
	public Timestamp getHoraCierre();
	
	public String getDescripcion();
	
	public int getCapacidad();
	
	public double getCosto();
	
	public long getIdHotel();
	
	public String getTipo();
}
