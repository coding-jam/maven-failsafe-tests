package it.cosenonjaviste.failsafe.web.model;

public class ServerInfo {

	private String serverName;
	
	private String serverVersion;
	
	public ServerInfo() {

	}
	
	public ServerInfo(String serverInfo) {
		if (serverInfo != null && serverInfo.contains("/")) {
			String[] split = serverInfo.split("/");
			serverName = split[0];
			serverVersion = split[1];
		} else {
			serverName = serverInfo;
		}
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerVersion() {
		return serverVersion;
	}

	public void setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
	}

}
