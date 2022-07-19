package com.in28minutes.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

class StringTest {

	private String str;
	//Este aparece solo una vez antes de iniciar todas las pruebas
	//tiene que ser static
	@BeforeAll
	static void beforeAll() {
		System.out.println("Iniciando conexion con base de datos");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Iniciando conexion con base de datos");
	}
	//Aparece antes de cada prueba 
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Iniciando"+ info.getDisplayName());
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Clan up");
	}
	@Test
	void toUpperCase() {
		String str = "abcd";
		String result = str.toUpperCase();
		//sirve para comparar si es igual a lo esperado
		assertEquals("ABCD", result);
		//Saber si el resultado es nulo o no
		//assertNull(result)
	}
	@Test
	//ignora esta prueba y a nivel clase todas las pruebas
	@Disabled
	void contains_basic() {
		String str="abcdefgh";
		boolean result=str.contains("ijk");
		assertEquals(false, result);
		//Sirve para valores boolean
		//assertFalse()
	}
	
	@Test
	//cantidad de veces que quieres que se repita una prueba
	@RepeatedTest(10)
	void split_basic() {
		String str="abc def ghi";
		String actualResult[]= str.split(" ");
		String[] expectedResult = new String[] {"abc", "def", "ghi"};
		assertArrayEquals(expectedResult, actualResult);
	}
	
	//Para hacer pruebas de casos que puedan arrojar errores
	//El codigo a probar debe de ir dentro de lambda expressions
	@Test
	@DisplayName("Puedo nombrar aquí que hace, o el nombre de la prueba")
	void lenght_exception() {
		String str = null;
		assertThrows(NullPointerException.class, 
				()->{
					str.length();
				}
				);
	}
	
	//Sirve para si haces pruebas iguales para más de un valor
	@ParameterizedTest
	@ValueSource(strings= {"ABCD", "ABC", "A", "DEF"})
	void lenght_greater_than_zero(String str) {
		assertTrue(str.length()>0);
	}
	
	//Sirve para dar más de un parametro por prueba
	//Pudes incluir el nombre por prueba en parameterized, junto con valores de la prueba
	@ParameterizedTest(name="{0} capitalized is {1}")
	@CsvSource(value= {"abcd, ABCD", "'',''", "abc,ABC"})
	void uppercase(String word, String capitalizedWord) {
		assertEquals(capitalizedWord, word);	
	}
	
	@Test
	//Realizar pruebas de que acciones duren cierto tiempo
	//lo siguiente sera succes si se termina en 5 segundos
	void perfomanceTest() {
		assertTimeout(Duration.ofSeconds(5), ()->{
			for(int i=0;i<=100;i++) {
				int j=i;
				System.out.println(j);
			}
		});
	}
	
	//Sirve para anidar varias pruebas juntas que 
	//quieres que se realicen anidadas
	@org.junit.jupiter.api.Nested
	@DisplayName("For an empty String")
	class emptyStringTest{
		@BeforeEach
		void setToempty() {
			String str=" ";
		}
		
		@Test
		@DisplayName("lenght should be zero")
		void lengthzero() {
			assertEquals(0, str.length());
		}
		
		@Test
		@DisplayName("Upper case is empty")
		void lengthiszero() {
			assertEquals(0, str.toUpperCase());
		}
	}
	
	
}
