package ejercicio04;

public class Television extends Electrodomestico {

	/**
	 * Atributo privado con la resolución, que será 20 por defecto
	 */
	private int resolucion = 20;

	/**
	 * Atributo provado booleano de sintonizador TDT, que por defecto será false
	 */
	private boolean sintonizador = false;

	/**
	 * Constructor para la television
	 * 
	 * @param peso       parametro que contiene el peso del TV
	 * @param precioBase precio del TV
	 * @param consumo    consumo del TV
	 * @param color      consumo
	 * @param resolucion
	 * @param tdt
	 */
	public Television(int peso, double precioBase, String consumo, String color, int resolucion, boolean tdt) {
		super(peso, precioBase, consumo, color);
		this.resolucion = resolucion;
		sintonizador = tdt;
	}

	/**
	 * Constrcutor por defecto que hereda de la superclase
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor para television
	 * 
	 * @param peso peso de la TV
	 * @param precioBase precio base de la TV
	 */
	public Television(int peso, double precioBase) {
		super(peso, precioBase);
	}
	/**
	 * Setter de la resolución
	 * @param resolucion
	 */
	public void setResolucion(int resolucion) {
		if (resolucion >= 0) {
			this.resolucion = resolucion;
		}
	}
	/**
	 * Setter del sintonizador TDT
	 * @param tdt
	 */
	public void setTDT(boolean tdt) {
		sintonizador = tdt;
	}

	/**
	 * Metodo para calcular el precio final de la television.
	 * Si la resolución es mayor de 40, el precio aumentará un 30%
	 * Si tiene sintonizador TDT su precio aumentará 50€
	 */
	@Override
	double precioFinal() {
		double precio = 0;

		if (resolucion > 40) {
			precio += super.precio * 1.3 - super.precio;
		}
		if (sintonizador == true) {
			precio += 50;
		}
		// Devolvemos el calculo
		return super.precioFinal() + precio;
	}

}
