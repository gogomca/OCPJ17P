package es.gogomca.ocpj17p.functional.interfacesinheritance;


@FunctionalInterface
public interface LeafFunctionalInterface extends ParentFunctionalInterface {
	default void method1() {}
		
	void method2();
}
