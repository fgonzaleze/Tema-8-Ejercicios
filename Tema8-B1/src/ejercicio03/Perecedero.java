package ejercicio03;

public class Perecedero extends Productos {
	
int diasACaducar;
	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "Días a caducar: " + diasACaducar;
		return res;
	}
	
	/**
	 * 
	 */
	@Override
	public double calcular(int cantidad) {
		double total = super.calcular(cantidad);
		switch(diasACaducar) {
		case 1:
			total /= 4;
			break;
		case 2:
			total /= 3;
			break;
		case 3:
			total /= 2;
			break;
		}
			
		return total;
	}
}


