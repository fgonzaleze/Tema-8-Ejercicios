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
	
	/**
	 * Metodo para convertir a cadema los días a caducar
	 */
	@Override
	public String toString() {
		// Concatenamos en res el resultado 
		String res = super.toString() + "\n";
		res += "Días a caducar: " + diasACaducar;
		return res;
	}
	
	/**
	 * Metodo para calcular atendiendo a la fecha de caducidad
	 * En caso de que sea 1 día el precio se reduce 4 veces
	 * En caso de que sea 2 días el precio se reduce 3 veces
	 * En caso de que sean 3 días el precio se reduce 2 veces
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
		// Devuelve el total calculado
		return total;
	}
}


