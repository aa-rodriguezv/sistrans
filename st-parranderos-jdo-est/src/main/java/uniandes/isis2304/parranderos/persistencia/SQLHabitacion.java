package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

class SQLHabitacion {
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
	
	public SQLHabitacion(PersistenciaParranderos pp) {
		this.pp = pp;
	}
	
	public long adicionarHabitacion(PersistenceManager pm, long pIdHabitacion, long pIdHotel, String tipoHabitacion, long idCliente, char pReservada, long reservaServicio, double pCosto, int pCapacidad) {
		Query q = pm.newQuery("INSERT INTO " + pp.darTablaHabitacion() + " (ID, ID_HOTEL, TIPO, ID_CLIENTE, RESERVADA, RESERVA_SERVICIO, COSTO, CAPACIDAD) VALUES (?, ?, ?, ?, ?, ?, ?, ?");
		q.setParameters(pIdHabitacion, pIdHotel, tipoHabitacion, idCliente, pReservada, reservaServicio, pCosto, pCapacidad);
		return (long)q.executeUnique();
	}
}
