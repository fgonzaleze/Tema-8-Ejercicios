package ejercicio05;

public class Triangulo extends Poligono {
	/**
	 * Variable de tipo privada double con el lado 1
	 */
	private double lado1;
	
	/**
	 * Variable de tipo privada double con el lado 1
	 */
	private double lado2;
	private double lado3;

	public Triangulo() {

	}

	/**
	 * Constructor del metodo triangulo
	 * 
	 * @param numeroLados numero de lados del triangulo
	 * @param lado1 double que contiene la longitud del lado 1
	 * @param lado2 double que contiene la longitud del lado 2
	 * @param lado3 double que contiene la longitud del lado 3
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * Getter del lado 1
	 * 
	 * @return
	 */
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	public double area() {
		double semiperimetro = 0;
		double area = 0;
		semiperimetro = (lado1 + lado2 + lado3) / 2;
		area = semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3);
		area = Math.sqrt(area);
		return area;
	}

	@Override
	public String toString() {
		String res = "";
		res += super.toString() + "Triangulo\n" + "Lado 1 : " + lado1 + "\n" + "Lado 2 : " + lado2 + "\n" + "Lado 3 : "
				+ lado3 + "\n";
		return res;
	}

}
