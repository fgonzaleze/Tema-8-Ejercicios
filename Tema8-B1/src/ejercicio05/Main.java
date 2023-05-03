package ejercicio05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
static Poligono arrayPoligonos[] = new Poligono[0];
static Scanner lee = new Scanner(System.in);

	public static void main(String[] args) {
		
			int opcionUser=0;
			do {
				menu();
				opcionUser= lee.nextInt();
				switch(opcionUser) {
				case 1:
					triangulo();
					break;
				case 2:
					rectangulo();
					break;
				case 3:
					listaPoligonos();
					break;
				case 4:
					System.out.println("Ha cerrado el programita.");
					break;	
				default:
					System.err.println("La opción elegida no se encuentra contemplada");
					break;
				}
			}while(opcionUser!=4);
		}
		public static void menu() {
			System.out.println("Seleccione una de las siguientes opciones: ");
			System.out.println("1. Introducir un triangulo.");
			System.out.println("2. Introducir un rectangulo");
			System.out.println("3. Mostrar el contenido del array.");
			System.out.println("4. Salir del programa.");
		}
		public static void posicionAd() {
			arrayPoligonos = Arrays.copyOf(arrayPoligonos, arrayPoligonos.length+1);
		}
		public static void triangulo() {
			int cantLados = 0;
			double lado1;
			double lado2;
			double lado3;
			
			System.out.println("Por favor introduzca los valores de los lados del triangulo.");
			System.out.print("Lado 1:");
			lado1 = lee.nextDouble();
			System.out.print("Lado 2:");
			lado2 = lee.nextDouble();
			System.out.print("Lado 3:");
			lado3 = lee.nextDouble();	
			System.out.println();
			posicionAd();
			arrayPoligonos[arrayPoligonos.length-1] = new Triangulo(cantLados,lado1, lado2, lado3);
			System.out.println("Ha insertado un triangulo en el array.");
			System.out.println();
		}

		public static void rectangulo() {
			int cantLados=4;
			double base;
			double altura;
			
			System.out.println("Por favor introduzca la base y la altura del rectangulo. ");
			System.out.print("Base: ");
			base = lee.nextDouble();
			System.out.print("Altura: ");
			altura = lee.nextDouble();
			
			posicionAd();
			arrayPoligonos[arrayPoligonos.length-1] = new Rectangulo(cantLados, base, altura);
			System.out.println("Ha insertado un rectangulo en el array.");
			System.out.println();
		}
		public static void listaPoligonos() {
			System.out.println();
			for(Poligono objeto : arrayPoligonos) {
				System.out.println(objeto);
				System.out.println("Su area es " + objeto.area()); 
				System.out.println();
			}
		
	}

}
