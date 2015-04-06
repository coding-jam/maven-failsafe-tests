package it.cosenonjaviste.failsafe.web.model;

public class Pong {

	private Status serverStatus;

	private Status dbStatus;
	
	public Pong() {
	}

	public Pong(Status serverStatus, Status dbStatus) {
		super();
		this.serverStatus = serverStatus;
		this.dbStatus = dbStatus;
	}

	public Status getServerStatus() {
		return serverStatus;
	}

	public void setServerStatus(Status serverStatus) {
		this.serverStatus = serverStatus;
	}

	public Status getDbStatus() {
		return dbStatus;
	}

	public void setDbStatus(Status dbStatus) {
		this.dbStatus = dbStatus;
	}
	
}
