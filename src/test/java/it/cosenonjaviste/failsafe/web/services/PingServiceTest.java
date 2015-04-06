package it.cosenonjaviste.failsafe.web.services;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;
import it.cosenonjaviste.failsafe.web.db.helpers.DbHelper;
import it.cosenonjaviste.failsafe.web.model.Pong;
import it.cosenonjaviste.failsafe.web.model.Status;

import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

public class PingServiceTest {

	@Rule
	public EasyMockRule rule = new EasyMockRule(this);
	
	@TestSubject
	private PingService pingService = new PingService();
	
	@Mock
	private DbHelper dbHelper;
	
	@Test
	public void testPing() {
		expect(dbHelper.checkConnection()).andReturn(false);
		replay(dbHelper);
		
		Pong pong = pingService.ping();
		assertEquals(pong.getServerStatus(), Status.OK);
		assertEquals(pong.getDbStatus(), Status.KO);
		
	}

}
