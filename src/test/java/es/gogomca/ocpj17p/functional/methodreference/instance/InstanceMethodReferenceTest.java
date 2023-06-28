package es.gogomca.ocpj17p.functional.methodreference.instance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InstanceMethodReferenceTest {

	@Test
	void test() {
		var num = Long.valueOf(129);
		var expectedByte = -127; // Narrowing.
		
		// Defino la implementación de la Interfaz Funcional mediante la referencia a un método de la instancia.
		InstanceMethodReference instanceMethodReference = num::byteValue;
		InstanceMethodReference lambda = () -> num.byteValue();
		
		// La llamada para usar la Lambda se realiza sobre la instancia, no sobre la clase como en el caso de las referencias a métodos estáticos.
		assertEquals(expectedByte, instanceMethodReference.byteValue());
		assertEquals(expectedByte, lambda.byteValue());
	}
}
