package uniandes.isis2304.parranderos.negocio;

public class Hotel implements VOHotel{

	private String nombre;
	
	private long idHotel;
	
	private String pais;
	
	private int capacidad;
	
	public Hotel() {
		nombre = "";
		idHotel = 0;
		pais = "";
		capacidad = 0;
	}
	
	public Hotel(long pId, String pNombre, String pPais, int pCapacidad) {
		nombre = pNombre;
		idHotel = pId;
		pais = pPais;
		capacidad = pCapacidad;
	}
	
	@Override
	public long getIdHotel() {
		// TODO Auto-generated method stub
		return idHotel;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getPais() {
		// TODO Auto-generated method stub
		return pais;
	}

	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return capacidad;
	}

}
