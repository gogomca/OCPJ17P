package es.gogomca.ocpj17p.functional.methodreference.constructor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructorWithParemeterMethodReferenceTest {

	@Test
	void test() {
		var string = "John Doe";
		var expectedStringBuilder = new StringBuilder(string);
		
		// Indicamos que la implementación de la Interfaz Funcional va a ser una llamada a un constructor de Boolean. Aún no se podría determinar a cuál de ellos.
		ConstructorWithParemeterMethodReference constructorWithParemeterMethodReference = StringBuilder::new;
		ConstructorWithParemeterMethodReference lambda = str -> new StringBuilder(str);
		
		assertEquals(expectedStringBuilder.toString(), constructorWithParemeterMethodReference.generateStringBuilder(string).toString());
		assertEquals(expectedStringBuilder.toString(), lambda.generateStringBuilder(string).toString());
	}
}
