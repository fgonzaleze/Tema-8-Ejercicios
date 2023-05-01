package ejercicio01;

public class Hora {
	

	protected int hora = 0;
	protected int minutos = 0;

	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}

	public void inc() {
		minutos++;
		if (minutos >= 60) {
			minutos = 0;
			hora++;

			if (hora >= 24) {
				hora = 0;
			}
		}
	}

	public boolean setMinutos(int valor) {
		boolean valido = false;
		if (valor >= 1 && valor <= 59) {
			minutos = valor;
			valido = true;
		}
		return valido;
	}

	public boolean setHora(int valor) {
		boolean valido = false;
		if (valor >= 1 && valor <= 23) {
			hora = valor;
			valido = true;
		}
		return valido;
	}

	@Override
	public String toString() {
		String res = "";
		if (hora <= 9) {
			res += "0";
		}
		res += hora + ":";

		if (minutos <= 9) {
			res += "0";
		}
		res += minutos;
		return res;
	}

}
