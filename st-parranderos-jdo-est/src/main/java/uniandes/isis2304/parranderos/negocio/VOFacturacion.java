package uniandes.isis2304.parranderos.negocio;

public interface VOFacturacion {

	public long getId();
	
	public double getPrecioConsumido();
	
	public double getDescuento();
	
	public double getTotalAPagar();
	
	public long getIdConsumo();
	
	public long getIdReserva();
}
