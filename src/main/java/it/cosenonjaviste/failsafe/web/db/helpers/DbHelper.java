package it.cosenonjaviste.failsafe.web.db.helpers;

import java.util.logging.Logger;

import javax.inject.Named;

@Named
public class DbHelper {

	private static final Logger LOGGER = Logger.getLogger(DbHelper.class.getName());
	
	public boolean checkConnection() {
		LOGGER.info("Everything is ok...");
		return true;
	}
}
