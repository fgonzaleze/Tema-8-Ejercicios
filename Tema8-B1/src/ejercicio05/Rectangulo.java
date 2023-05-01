package ejercicio05;

public class Rectangulo extends Poligono{
	private double base;
	private double altura;

	

	public Rectangulo() {
		super();
	}

	public Rectangulo(int numeroLados,double lado1, double lado2) {
		super(numeroLados);
		this.base = lado1;
		this.altura = lado2;
	}

	public double getLado1() {
		return base;
	}

	public void setLado1(double lado1) {
		this.base = lado1;
	}

	public double getLado2() {
		return altura;
	}

	public void setLado2(double lado2) {
		this.altura = lado2;
	}
	public double area() {
		double area=0;
		area = base* altura;
		return area;
	}
	@Override
	public String toString() {
		String res ="";
		res += super.toString() + "Rectangulo\n" +
		"Lado 1 (base): " + base + "\n"+
		"Lado 2 (altura): " + altura + "\n"	;	
		return res;
	}
}
