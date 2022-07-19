package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class QuickBeforeAfterTest {

	
	@RunWith(Parameterized.class)
	public class StringHelperParameterizedTest{
		StringHelper helper= new StringHelper();
		
		private String input;
		private String ExcpectedOuput;
		
		public StringHelperParameterizedTest(String input, String ExcpectedOuput) {
			this.input= input;
			this.ExcpectedOuput= ExcpectedOuput;
		}
		@Parameters
		public Collection<String[]> testConditions() {
			String expectedOutputs[][]= {
					{"AAD","CD"},
					{"ACD","CD"}};
			return Arrays.asList(expectedOutputs);
		}
	}
	//se necesita assertArratequals porque si no no compara el contenido del
	//array si no la posicion en memoria
	@Test
	public void test() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,4,3,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

}
