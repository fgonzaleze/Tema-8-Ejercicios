package ejercicio04;

public class Electrodomestico {

	protected double precio = 100;

	enum color {
		blanco, negro, rojo, azul, gris
	};

	enum consumo {
		A, B, C, D, E, F
	};

	double peso = 5;

	protected consumo consum = consumo.F;
	protected color gama = color.gris;

	/*
	 * Constructor por defecto
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con el precio y el peso, con valores por defecto
	 * 
	 * @param precio precio del electrodomestico
	 * @param peso   peso del electrodomestico
	 */
	public Electrodomestico(double precio, double peso) {
		if (precio >= 0) {
			this.precio = precio;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor
	 * 
	 * @param precio
	 * @param peso
	 * @param consum
	 * @param col
	 */
	public Electrodomestico(double precio, double peso, String consum, String col) {
		if (precio >= 0) {
			this.precio = precio;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		if (consum != null && consum.length() != 0) {
			this.consum = consumo.valueOf(consum);
		}
		if (col != null && col.length() != 0) {
			this.gama = color.valueOf(col);
		}
	}

	public double getPrecio() {
		return precio;
	}

	public double getPeso() {
		return peso;
	}

	public consumo getConsum() {
		return consum;
	}

	public color getCol() {
		return gama;
	}
	
	boolean comprobarConsumoEnergetico(char letra) {
		boolean correcto = false;

		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			correcto = true;
		}

		return correcto;
	}
	
	boolean comprobarColor(String color) {
		boolean correcto = false;

		if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("azul")
				|| color.equalsIgnoreCase("rojo")) {
			correcto = true;
		}

		return correcto;
	}
	
	double precioFinal() {
		double precio = 0;

		switch (consum) {
		case A:
			precio = precio + 100;
			break;
		case B:
			precio = precio + 80;
			break;
		case C:
			precio = precio + 60;
			break;
		case D:
			precio = precio + 50;
			break;
		case E:
			precio = precio + 30;
			break;
		default:
			precio = precio + 10;
		}

		if (peso > 0 && peso < 20) {
			precio += 10;
		} else if (peso >= 20 && peso < 50) {
			precio += 50;
		} else if (peso >= 50 && peso < 80) {
			precio += 80;
		} else {
			precio += 100;
		}

		return precio;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		cadena = "Precio base: " +precio+" euros; \n"
				+ "Color: "+gama+";\n"
				+ "Consumo energético: "+consum+";\n"
				+ "Peso: "+peso+" kg";
		
		return cadena; 	}

}
