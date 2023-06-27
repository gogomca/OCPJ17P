package es.gogomca.ocpj17p.functional.objectmethods;

@FunctionalInterface
public interface ObjectMethods {
	String toString(); // Solo esta definición no genenera una interfaz funcional. ## Invalid '@FunctionalInterface' annotation; ObjectMethods is not a functional interface
//	int toString(); // La firma del método es la misma que la de Object. Ni sobrescribimos ni sobrecargamos. ## The return type is incompatible with Object.toString()
	String toString(int num);
}
