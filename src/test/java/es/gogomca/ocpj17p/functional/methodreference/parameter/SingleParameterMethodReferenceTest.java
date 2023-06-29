package es.gogomca.ocpj17p.functional.methodreference.parameter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleParameterMethodReferenceTest {

	@Test
	void test() {		
		var expectedResult = true;
		var bool = Boolean.TRUE;
		
		// Definici�n de la implementaci�n de la Interfaz Funcional. Observar que la referencia de m�todo es sobre el par�metro del m�todo de la interfaz.
		SingleParameterMethodReference singleParameterMethodReference = Boolean::booleanValue;
		SingleParameterMethodReference lambda = b -> b.booleanValue();
		
		assertEquals(expectedResult, singleParameterMethodReference.booleanValue(bool));
		assertEquals(expectedResult, lambda.booleanValue(bool));
	}
}
