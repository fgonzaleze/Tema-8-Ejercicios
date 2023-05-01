package ejercicio04;

public class Lavadora extends Electrodomestico{
	
	private int carga = 5;
	
	public Lavadora() {
		super();
	}
	
	public Lavadora(int peso, double precio) {
		super(peso, precio);
	}

	public Lavadora(double precio, double peso, String consum, String col, int carga) {
		super(peso, precio, consum, col);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	

	@Override
	double precioFinal() {
		int extraDeCarga = 0;
		
		if(carga >= 30) {
			extraDeCarga = 50;
		}
		
		return super.precioFinal() + extraDeCarga;
	}
	
	
}
