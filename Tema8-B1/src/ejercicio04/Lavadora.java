package ejercicio04;

public class Lavadora extends Electrodomestico{
	/**
	 * Atributo privado de lavadora propio
	 */
	private int carga = 5;
	
	/**
	 * Constructor lavadora que hereda de la clase Electrodomestico
	 */
	public Lavadora() {
		super();
	}
	
	/**
	 * Constructor lavadora con los pa´rametros precio y peso y los heredados
	 * @param peso peso de la lavadora
	 * @param precio precio de la lavadora 
	 */
	public Lavadora(int peso, double precio) {
		super(peso, precio);
	}
	
	/**
	 * Constructor para lavadora, contendrá los párametros heredados además de la carga que es propia
	 * @param precio precio de la lavadora
	 * @param peso peso de la lavadora
	 * @param consum consumo de la lavadora
	 * @param col color de la lavadora
	 * @param carga carga de la lavadora
	 */
	public Lavadora(double precio, double peso, String consum, String col, int carga) {
		super(peso, precio, consum, col);
		this.carga = carga;
	}
	/**
	 * Getter de la carga
	 * @return devolvemos la carga
	 */
	public int getCarga() {
		return carga;
	}
	
	/**
	 * Metodo encargado de calcular y añadir el precio final en funcion de la carga. Si la carga supera el 
	 */
	@Override
	double precioFinal() {
		// El extra de carga será inicializado a 0
		int extraDeCarga = 0;
		
		// En caso de que la carga sea mayor o igual a 30, se añadirá 50.
		if(carga >= 30) {
			extraDeCarga = 50;
		}
		
		// Devolvemos sumando el precio final heredado + el extra de carga
		return super.precioFinal() + extraDeCarga;
	}
	
	
}
