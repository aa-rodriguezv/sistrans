package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import oracle.net.aso.t;

class SQLHotel {
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
	
	public SQLHotel(PersistenciaParranderos pp) {
		this.pp = pp;
	}
	
	public long adicionarHotel(PersistenceManager pm, long pId, String pNombre, String pPais, int pCapacidad) {
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaHotel() + "(ID, NOMBRE, PAIS, CAPACIDAD) VALUES (?, ?, ?, ?)"); 
		q.setParameters(pId, pNombre, pPais, pCapacidad);
		return (long) q.executeUnique();
	}
}
