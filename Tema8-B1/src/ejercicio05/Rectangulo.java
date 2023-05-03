package ejercicio05;

public class Rectangulo extends Poligono {
	private double base;
	private double altura;
	
	/**
	 * Constructor sin parametros que hereda de la superclase poligono
	 */
	public Rectangulo() {
		super();
	}

	/**
	 * Constructor para el rectangulo
	 * 
	 * @param numeroLados numero de lados
	 * @param lado1 uno de los lados del rectángulo
	 * @param lado2 otro de los lados del rectangulo
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		if (base >= 0) {
			this.base = lado1;
			this.altura = lado2;
		}
	}

	public double getLado1() {
		return base;
	}

	public void setLado1(double lado1) {
		if (lado1 >= 0) {
			this.base = lado1;
		}
	}

	public double getLado2() {
		return altura;
	}

	public void setLado2(double lado2) {
		if (lado2 >= 0) {
			this.altura = lado2;
		}
	}
	/**
	 * Metodo para calcular el area
	 */
	public double area() {
		double area = 0;
		area = base * altura;
		return area;
	}
	/**
	 * Metodo para pasar a cadena 
	 */
	@Override
	public String toString() {
		// Pasamos a cadena vacía
		String res = "";
		res += super.toString() + "Rectangulo\n" + 
								"Base: " + base + "\n" + 
								"Altura: " + altura + "\n";
		return res;
	}
}
