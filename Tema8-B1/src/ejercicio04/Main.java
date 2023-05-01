package ejercicio04;

public class Main {

	public static void main(String[] args) {
		Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

		double precionFinal = 0;
		double precioBase = 0;

		double precioTotalElec = 0;
		double precioTotalLavadora = 0;
		double precioTotalTV = 0;

		Electrodomestico elec1 = new Electrodomestico();
		Electrodomestico elec2 = new Electrodomestico(100, 20);
		Electrodomestico elec3 = new Electrodomestico(150, 30, "F", "negro");
		Electrodomestico elec4 = new Electrodomestico(190, 10);
		Lavadora lava1 = new Lavadora(600, 50, "F", "gris", 40);
		Lavadora lava2 = new Lavadora(150, 40);
		Lavadora lava3 = new Lavadora();
		Television tv1 = new Television(1000, 30);
		Television tv2 = new Television();
		Television tv3 = new Television();

		listaElectrodomesticos[0] = elec1;
		listaElectrodomesticos[1] = elec2;
		listaElectrodomesticos[2] = elec3;
		listaElectrodomesticos[3] = elec4;
		listaElectrodomesticos[4] = lava1;
		listaElectrodomesticos[5] = lava2;
		listaElectrodomesticos[6] = lava3;
		listaElectrodomesticos[7] = tv1;
		listaElectrodomesticos[8] = tv2;
		listaElectrodomesticos[9] = tv3;

		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			precioBase = listaElectrodomesticos[i].precio;
			precionFinal = listaElectrodomesticos[i].precioFinal();
			System.out.println(listaElectrodomesticos[i]);
			System.out.println("Precio inicial: " + precioBase);
			System.out.println("Precio final: " + precionFinal);
			System.out.println();
		}

		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			precioTotalElec += listaElectrodomesticos[i].precioFinal();

			if (listaElectrodomesticos[i] instanceof Lavadora) {
				precioTotalLavadora += listaElectrodomesticos[i].precioFinal();
			} else if (listaElectrodomesticos[i] instanceof Television) {
				precioTotalTV += listaElectrodomesticos[i].precioFinal();
			}
		}

		System.out.println("El precio total de todos los electrodomesticos es: " + precioTotalElec);
		System.out.println("El precio total de todos las lavadoras es: " + precioTotalLavadora);
		System.out.println("El precio total de todos los televisores es: " + precioTotalTV);

	}
}
