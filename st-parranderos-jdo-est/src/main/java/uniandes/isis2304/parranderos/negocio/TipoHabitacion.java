package uniandes.isis2304.parranderos.negocio;

public class TipoHabitacion implements VOTipoHabitacion{
	private int id;
	
	private String descripcion;
	
	public TipoHabitacion() {
		id = 0;
		descripcion = "";
	}
	
	public TipoHabitacion(int pId, String pDesc) {
		id = pId;
		descripcion = pDesc;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return descripcion;
	}
	
}
