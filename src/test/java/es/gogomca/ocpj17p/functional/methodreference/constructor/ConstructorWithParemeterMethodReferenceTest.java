package es.gogomca.ocpj17p.functional.methodreference.constructor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructorWithParemeterMethodReferenceTest {

	@Test
	void test() {
		var string = "John Doe";
		var expectedStringBuilder = new StringBuilder(string);
		
		// Indicamos que la implementaci�n de la Interfaz Funcional va a ser una llamada a un constructor de Boolean. A�n no se podr�a determinar a cu�l de ellos.
		ConstructorWithParemeterMethodReference constructorWithParemeterMethodReference = StringBuilder::new;
		ConstructorWithParemeterMethodReference lambda = str -> new StringBuilder(str);
		
		assertEquals(expectedStringBuilder.toString(), constructorWithParemeterMethodReference.generateStringBuilder(string).toString());
		assertEquals(expectedStringBuilder.toString(), lambda.generateStringBuilder(string).toString());
	}
}
