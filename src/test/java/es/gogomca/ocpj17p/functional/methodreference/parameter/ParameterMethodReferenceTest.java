package es.gogomca.ocpj17p.functional.methodreference.parameter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParameterMethodReferenceTest {

	@Test
	void test() {		
		var expectedResult = 1; // a positive value if this object represents true and the argument represents false
		var bool = Boolean.TRUE;
		
		// Definici�n de la implementaci�n de la Interfaz Funcional. Observar que la referencia de m�todo es sobre uno de los par�metros del m�todo de la interfaz.
		ParameterMethodReference parameterMethodReference = Boolean::compareTo;
		ParameterMethodReference lambda = (b, p) -> b.compareTo(p);
		
		assertEquals(expectedResult, parameterMethodReference.compareTo(bool, Boolean.FALSE));
		assertEquals(expectedResult, lambda.compareTo(bool, Boolean.FALSE));
	}
}
