package es.gogomca.ocpj17p.functional.methodreference.parameter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleParameterMethodReferenceTest {

	@Test
	void test() {		
		var expectedResult = true;
		var bool = Boolean.TRUE;
		
		// Definición de la implementación de la Interfaz Funcional. Observar que la referencia de método es sobre el parámetro del método de la interfaz.
		SingleParameterMethodReference singleParameterMethodReference = Boolean::booleanValue;
		SingleParameterMethodReference lambda = b -> b.booleanValue();
		
		assertEquals(expectedResult, singleParameterMethodReference.booleanValue(bool));
		assertEquals(expectedResult, lambda.booleanValue(bool));
	}
}
