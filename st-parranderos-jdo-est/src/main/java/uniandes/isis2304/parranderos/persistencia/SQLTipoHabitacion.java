package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLTipoHabitacion {
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

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor
	 * @param pp - El Manejador de persistencia de la aplicación
	 */
	public SQLTipoHabitacion (PersistenciaParranderos pp)
	{
		this.pp = pp;
	}
	
	public long adicionarTipoHabitacio(PersistenceManager pm, int pId, String pDesc) {
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaTipoHabitacion() + "(ID, DESCRIPCION) VALUES (?, ?)");
		q.setParameters(pId, pDesc);
		return (long) q.executeUnique();
	}
}
