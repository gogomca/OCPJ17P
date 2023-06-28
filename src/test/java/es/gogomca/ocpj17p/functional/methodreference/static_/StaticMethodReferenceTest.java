package es.gogomca.ocpj17p.functional.methodreference.static_;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaticMethodReferenceTest {

	@Test
	void test() {
		var strNum = "123";
		var expectedInt = 123;

		// Definimos la implementaci�n de la Lambda mediante una referencia a m�todo est�tico.
		StaticMethodReference staticMethodReference = Integer::parseInt;
		StaticMethodReference lambda = s -> Integer.parseInt(s);
		
		// La llamada para usar la Lambda se realiza al m�todo definido en la Interfaz Funcional.
		assertEquals(expectedInt, staticMethodReference.parseInt(strNum)); 
		assertEquals(expectedInt, lambda.parseInt(strNum)); 
	}
}
