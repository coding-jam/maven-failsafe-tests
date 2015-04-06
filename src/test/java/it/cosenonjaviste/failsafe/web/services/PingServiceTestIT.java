package it.cosenonjaviste.failsafe.web.services;

import static org.junit.Assert.*;
import it.cosenonjaviste.failsafe.web.model.Pong;
import it.cosenonjaviste.failsafe.web.model.Status;

import javax.ws.rs.client.ClientBuilder;

import org.junit.Test;

public class PingServiceTestIT {

	private static final String BASE_URI = "http://localhost:8080/maven-failsafe-tests/api";
	
	@Test
	public void testPing() {
		Pong pong = ClientBuilder.newClient().target(BASE_URI).path("/ping").request().get(Pong.class);
		
		assertNotNull(pong);
		assertEquals(pong.getServerStatus(), Status.OK);
		assertEquals(pong.getDbStatus(), Status.OK);
	}
}
