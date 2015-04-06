package it.cosenonjaviste.failsafe.web.services;

import it.cosenonjaviste.failsafe.web.db.helpers.DbHelper;
import it.cosenonjaviste.failsafe.web.model.Pong;
import it.cosenonjaviste.failsafe.web.model.Status;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
public class PingService {
	
	@Inject
	private DbHelper dbHelper;

	@GET
	public Pong ping() {
		return new Pong(Status.OK, dbHelper.checkConnection() ? Status.OK : Status.KO);
	}
}
