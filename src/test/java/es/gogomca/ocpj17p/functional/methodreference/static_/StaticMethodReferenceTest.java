package es.gogomca.ocpj17p.functional.methodreference.static_;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaticMethodReferenceTest {

	@Test
	void test() {
		var strNum = "123";
		var expectedInt = 123;

		// Definimos la implementación de la Lambda mediante una referencia a método estático.
		StaticMethodReference staticMethodReference = Integer::parseInt;
		StaticMethodReference lambda = s -> Integer.parseInt(s);
		
		// La llamada para usar la Lambda se realiza al método definido en la Interfaz Funcional.
		assertEquals(expectedInt, staticMethodReference.parseInt(strNum)); 
		assertEquals(expectedInt, lambda.parseInt(strNum)); 
	}
}
