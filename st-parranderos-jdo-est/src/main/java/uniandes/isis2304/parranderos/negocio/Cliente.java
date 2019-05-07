package uniandes.isis2304.parranderos.negocio;

public class Cliente implements VOCliente{
	private long documento;
	
	private String tipoDocumento;
	
	public String correo_electronico;
	
	public String nombre;
	
	public Cliente(){
		documento = 0;
		tipoDocumento = "";
		correo_electronico = "";
		nombre = "";
	}
	
	public Cliente(int numDoc, String tipoDoc, String pCorreo, String pNombre) {
		documento = numDoc;
		tipoDocumento = tipoDoc;
		correo_electronico = pCorreo;
		nombre = pNombre;
	}

	@Override
	public long getDocumento() {
		// TODO Auto-generated method stub
		return documento;
	}

	@Override
	public String getTipoDoc() {
		// TODO Auto-generated method stub
		return tipoDocumento;
	}

	@Override
	public String getCorrero() {
		// TODO Auto-generated method stub
		return correo_electronico;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
}
