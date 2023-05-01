package ejercicio03;

/*
 * Nos piden hacer un programa que gestione una serie de productos. Los productos tienen los siguientes atributos:
- Nombre
- Precio
Tenemos dos tipos de productos:
- Perecedero: tiene un atributo llamado días a caducar.
- No perecedero: tiene un atributo llamado tipo.
Crea sus constructores, getters, setters y toString para todas las clases.
Tendremos una función llamada calcular, que devuelve un tipo double, y que según la clase hará una cosa u otra. 
A esta función le pasaremos un número que será la cantidad de productos:
- En Producto, simplemente sería multiplicar el precio por la cantidad de productos pasados y devolverá el resultado.
- En Perecedero, además de lo que hace producto, el precio se reducirá según los días a caducar:
	- Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
	- Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
	- Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
- En NoPerecedero, hace lo mismo que en producto.
Crea una clase ejecutable y crea un array de productos. Crea productos de distinto tipo y 
muestra el precio total de vender 5 productos de cada uno. 
 */

public class Productos {
	
	String nombre;
	double precio;

	public Productos(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		String res = nombre + " - " + precio;
		return res;
	}
	
	public double calcular(int cantidad) {
		return cantidad * precio;
	}
}

