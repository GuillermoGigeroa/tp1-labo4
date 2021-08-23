package ejercicio1;

public class Principal {
	
	public static void escribir(String esto) {
		System.out.println(esto);
	}
	
	public static void escribir(String esto1, int esto2) {
		System.out.println(esto1+esto2);
	}
	
	public static void getProximoID() {		
		escribir("Próximo ID es:",Empleado.devuelveProximoID());
		escribir("");
	}
	
	public static void imprimir(Empleado empleado) {
		System.out.println(empleado.toString());
	}
	
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		imprimir(empleado1);
		getProximoID();
		
		Empleado empleado2 = new Empleado("Guille",25);
		imprimir(empleado2);
		getProximoID();
		
		Empleado empleado3 = new Empleado("Roberto",65);
		imprimir(empleado3);
		getProximoID();
		
		Empleado empleado4 = new Empleado();
		imprimir(empleado4);
		getProximoID();
		
		Empleado empleado5 = new Empleado("Nora",42);
		imprimir(empleado5);
		getProximoID();
	}

}
