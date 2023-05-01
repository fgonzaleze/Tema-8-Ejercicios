package ejercicio04;

public class Television extends Electrodomestico{

	private int resolucion = 20;
	private boolean TDT = false;
	
	public Television(int peso, double precioBase, String consumo, String color, int resolucion, boolean tdt) {
		super(peso, precioBase, consumo, color);
		this.resolucion = resolucion;
		TDT = tdt;
	}

	public Television() {
		super();
	}

	public Television(int peso, double precioBase) {
		super(peso, precioBase);
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public void setTDT(boolean tdt) {
		TDT = tdt;
	}

	@Override
	double precioFinal() {
		double precio = 0; 
		
		if(resolucion > 40) {
			precio += super.precio * 1.3 - super.precio;
		}
		if(TDT == true) {
			precio += 50;
		}
		
		return super.precioFinal() + precio;
	}
	
}
