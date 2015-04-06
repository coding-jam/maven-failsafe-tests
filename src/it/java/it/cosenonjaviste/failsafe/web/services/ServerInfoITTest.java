package it.cosenonjaviste.failsafe.web.services;

import static org.junit.Assert.*;
import it.cosenonjaviste.failsafe.web.model.ServerInfo;
import it.cosenonjaviste.failsafe.web.testutils.IntegrationTests;
import it.cosenonjaviste.failsafe.web.testutils.TestConstants;

import javax.ws.rs.client.ClientBuilder;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTests.class)
public class ServerInfoITTest {

	@Test
	public void testGet() throws Exception {
		ServerInfo serverInfo = ClientBuilder.newClient().target(TestConstants.BASE_URI).path("/server-info").request().get(ServerInfo.class);
		
		assertNotNull(serverInfo);
		assertEquals("Apache Tomcat", serverInfo.getServerName());
		assertEquals("7.0.47", serverInfo.getServerVersion());
	}
}
