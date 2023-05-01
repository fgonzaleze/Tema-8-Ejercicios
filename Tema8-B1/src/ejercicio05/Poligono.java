package ejercicio05;

public abstract class Poligono {
	
	protected int numeroLados;
	
	public Poligono() {
		
	}
	
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}
	
	// En Poligono el único método abstracto es area(), porque es el único que no podemos calcular si no sabemos qué tipo de polígono es.
	public abstract double area();
	
	@Override
	public String toString() {
		String cadena = "";
		cadena += "Poligono\n" 
				+ "Cantidad de lados: " + numeroLados+"\n";
		return cadena;
	}
}
