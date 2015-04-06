package it.cosenonjaviste.failsafe.web;

import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

	public AppConfig() {
		// Resources.
        packages(this.getClass().getPackage().getName());

	}
}
