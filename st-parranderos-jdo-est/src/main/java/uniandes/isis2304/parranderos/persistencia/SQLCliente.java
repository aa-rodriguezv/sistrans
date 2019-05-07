package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLCliente {
	
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaParranderos.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaParranderos pp;
	
	public SQLCliente(PersistenciaParranderos pp) {
		this.pp = pp;
	}
	
	public long adicionarCliente (PersistenceManager pm, int numDoc, String tipoDocumento, String nombre, String correo) 
	{
		Query q = pm.newQuery(pp.SQL, "INSERT INTO " + pp.darTablaCliente() + "(NUM_DOCUMENTO, TIPO_DOCUMENTO, CORREO, NOMBRE) values (?, ?, ?, ?)");
		q.setParameters(numDoc, tipoDocumento, correo, nombre);
		return (long) q.executeUnique();
	}
}
