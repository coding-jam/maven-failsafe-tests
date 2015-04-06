package it.cosenonjaviste.failsafe.web.services;

import it.cosenonjaviste.failsafe.web.model.ServerInfo;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/server-info")
public class ServerInfoService {

	@Context
	private ServletContext servletContext;
	
	@GET
	public ServerInfo get() {
		return new ServerInfo(servletContext.getServerInfo());
	}
}
