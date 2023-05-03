package ejercicio03;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

				//Creamos un array de 10 productos
				Productos[] arrayProd= new Productos [10];
				
				// Array metemos manualmente los productos
				arrayProd[0]= new Productos("Laca", 2.5);
				arrayProd[1]= new Productos("Agua natural", 0.75);
				arrayProd[2]= new Perecedero ("Piña", 1.25, 3);
				arrayProd[3]= new Perecedero ("Manzana", 1.4, 4);
				arrayProd[4]= new NoPerecederos ("Atun en lata", 3.25, "Alimentacion");
				arrayProd[5]= new NoPerecederos ("Sal", 1.15, "Alimentacion");
				arrayProd[6]= new NoPerecederos ("Pimienta", 1, "Alimentacion");
				arrayProd[7]= new NoPerecederos ("Pintañuas", 12, "Cosmeticos");
				arrayProd[8]= new Perecedero ("Peras", 0.5, 3);
				arrayProd[9]= new Productos ("Colonia", 39);
				
				System.out.println("Lista de productos almacenados:");
				System.out.println(Arrays.toString(arrayProd));
				
				for (int i=0; i<arrayProd.length; i++) {
					System.out.println(arrayProd[i]);
					System.out.println("Precio total: " + arrayProd[i].calcular(10));
					System.out.println();
				}
	}

}
