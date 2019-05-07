package uniandes.isis2304.parranderos.negocio;

public class Habitacion implements VOHabitacion{

	private long idHabitacion;
	
	private long idHotel;
	
	private String tipoHabitacion;
	
	private long idCliente;
	
	private char reservada;
	
	private long reservaServicio;
	
	private double costo;
	
	private int capacidad;
	
public Habitacion(){
		idHabitacion = 0;
		idHotel = 0;
		tipoHabitacion = "";
		idCliente = 0;
		reservada = 'N';
		reservaServicio = 0;
		costo = 0;
		capacidad = 0;
	}

	public Habitacion(long id, long idHotel, String tipo, char reservada, int capacidad, double costo, long idCliente, long idServicio) {
		// TODO Auto-generated constructor stub
	
		this.idHabitacion = id;
		this.idHotel = idHotel;
		this.tipoHabitacion = tipo;
		this.idCliente = idCliente;
		this.reservada = reservada;
		this.reservaServicio = idServicio;
		this.costo = costo;
		this.capacidad = capacidad; 
	}
	
	@Override
	public long getIdHabitacion() {
		// TODO Auto-generated method stub
		return idHabitacion;
	}

	@Override
	public long getIdHotel() {
		// TODO Auto-generated method stub
		return idHotel;
	}

	@Override
	public String getTipoHabitacion() {
		// TODO Auto-generated method stub
		return tipoHabitacion;
	}

	@Override
	public long getIdCliente() {
		// TODO Auto-generated method stub
		return idCliente;
	}

	@Override
	public char getReservada() {
		// TODO Auto-generated method stub
		return reservada;
	}

	@Override
	public long getIdServicioReserva() {
		// TODO Auto-generated method stub
		return reservaServicio;
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return costo;
	}

	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return capacidad;
	}

}
