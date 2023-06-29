package es.gogomca.ocpj17p.functional.methodreference.constructor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructorMethodReferenceTest {

	@Test
	void test() {
		
		ConstructorMethodReference constructorMethodReference = StringBuffer::new;
		ConstructorMethodReference lambda = StringBuffer::new;
		
		assertNotNull(constructorMethodReference.generateStringBuffer());
		assertNotNull(lambda.generateStringBuffer());
	}
}
