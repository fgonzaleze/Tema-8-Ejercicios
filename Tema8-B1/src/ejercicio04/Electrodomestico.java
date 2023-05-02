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
	 * Constructor electrodomestico
	 * 
	 * @param precio parametro que contiene el precio del electrodomestico
	 * @param peso parametro que contiene el peso del electrodomestico
	 * @param consum parametro que contiene el consum del electrodomestico
	 * @param col parametro que contiene el color del electrodomestico
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
	/**
	 * Método que comprueba que la letra del consumo energético es correcta
	 * @param letra
	 * @return Devuelve un booleano true si la letra es correcta
	 */
	boolean comprobarConsumoEnergetico(char letra) {
		boolean correcto = false;
		// Las disttintas letras que pueden ser correctas
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			correcto = true;
		}

		return correcto;
	}
	/**
	 * Método que comprueba si el color es correcto
	 * @param color color que corresponde al electrodomestico
	 * @return devuelve true si es correcto el color introducido
	 */
	boolean comprobarColor(String color) {
		boolean correcto = false;
		// If con los diferentes colores
		if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("azul")
				|| color.equalsIgnoreCase("rojo")) {
			correcto = true;
		}

		return correcto;
	}
	/**
	 * Metodo que calcula el precio final dependiendo del consumo y del peso. 
	 * En caso del consumo: (A + 100€, B + 80€, C + 60€, D + 50€)
	 * En caso del peso: (0 - 20kg + 10€, 20 - 50kg + 50€, 50 - 80kg + 80€, +100kg + 100€) 
	 * @return Devuelve en double el precio final
	 */
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
