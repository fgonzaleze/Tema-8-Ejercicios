package ejercicio03;

public class Main {

	public static void main(String[] args) {
		NoPerecederos np = new NoPerecederos("Oreo", 1.5, "Galletas");
		double total = np.calcular(30);
		System.out.println(total);
	}

}
