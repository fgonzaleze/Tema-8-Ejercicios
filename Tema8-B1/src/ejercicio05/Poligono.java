package ejercicio05;

public abstract class Poligono {
	/**
	 * Variable protegida del numero de lados
	 */
	protected int numeroLados;
	
	/**
	 * Constructor sin parametros
	 */
	
	// En Poligono el único método abstracto es area(), porque es el único que no podemos calcular si no sabemos qué tipo de polígono es.
	public abstract double area();
	
	public Poligono() {
	
	}
	/**
	 * Constructor del poligono
	 * @param numeroLados numero de lados del poligono
	 */
	public Poligono(int numeroLados) {
		if(numeroLados >= 0) {
		this.numeroLados = numeroLados;
		}
	}
	/**
	 * Getter del numero de lados
	 * @return devuelve el numero de lados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}
	
	/**
	 * Metodo toString para imprimir por consola los numeros de lados
	 */
	@Override
	public String toString() {
		// Cadena vacia para almacenar
		String cadena = "";
		cadena += "Poligono\n" 
				+ "Lados: " + numeroLados+"\n";
		return cadena;
	}
}
