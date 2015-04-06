package it.cosenonjaviste.failsafe.web.services;

import static org.junit.Assert.*;
import it.cosenonjaviste.failsafe.web.model.Pong;
import it.cosenonjaviste.failsafe.web.model.Status;
import it.cosenonjaviste.failsafe.web.testutils.IntegrationTests;
import it.cosenonjaviste.failsafe.web.testutils.TestConstants;

import javax.ws.rs.client.ClientBuilder;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTests.class)
public class PingServiceTestIT {

	@Test
	public void testPing() {
		Pong pong = ClientBuilder.newClient().target(TestConstants.BASE_URI).path("/ping").request().get(Pong.class);
		
		assertNotNull(pong);
		assertEquals(pong.getServerStatus(), Status.OK);
		assertEquals(pong.getDbStatus(), Status.OK);
	}
}
