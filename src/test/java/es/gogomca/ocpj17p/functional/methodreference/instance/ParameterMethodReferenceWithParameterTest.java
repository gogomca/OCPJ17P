package es.gogomca.ocpj17p.functional.methodreference.instance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ParameterMethodReferenceWithParameterTest {

	@Test
	void test() {
		ParameterMethodReferenceWithParameter withParametersInstanceMethodReference = Long::equals;
		ParameterMethodReferenceWithParameter lambda = (l, p) -> l.equals(p);

		assertTrue(withParametersInstanceMethodReference.equals(Long.valueOf(23L), Long.valueOf(23L)));
		assertFalse(withParametersInstanceMethodReference.equals(Long.valueOf(23L), Long.valueOf(22L)));
		assertTrue(lambda.equals(Long.valueOf(23L), Long.valueOf(23L)));
		assertFalse(lambda.equals(Long.valueOf(23L), Long.valueOf(22L)));
	}

}
