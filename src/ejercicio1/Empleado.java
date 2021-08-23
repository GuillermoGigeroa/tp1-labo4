package ejercicio1;

public class Empleado {
	private static int ultimoID = 1000;
	private final int id;
	private String nombre;
	private int edad;
	
	// Constructores
	public Empleado() {
		id = generarID();
		nombre = "sin nombre";
		edad = 99;
	}

	public Empleado(String nombre, int edad) {
		id = generarID();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Métodos de la clase
	@Override
	public String toString() {
		return "Empleado " + nombre + ", edad: " + edad + ", legajo: "+ id;
	}

	private int generarID() {
		int idGenerado = ultimoID;
		ultimoID ++;
		return idGenerado;
	}

	public static int devuelveProximoID() {
		return ultimoID;
	}
	
	// Getters y setters
	protected int getId() {
		return id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

}
