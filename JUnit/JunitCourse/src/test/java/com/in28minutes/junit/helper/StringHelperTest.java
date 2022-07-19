package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper= new StringHelper();
	
	//siempre las pruebas tienen que ser public void
	//siempre va primero el valor esperado
	@Test
	public void testTruncateAinFirst2Position() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAinFirst2Position_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	//solo debes pasar el escenario con el valor actual
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

}
