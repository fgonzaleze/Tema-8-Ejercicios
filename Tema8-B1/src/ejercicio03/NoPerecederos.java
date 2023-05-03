package ejercicio03;
/**
 * 
 * @author jgonzalez
 *
 */
public class NoPerecederos extends Productos{
		
		/**
		 * String que almacena el tipo
		 */
		String tipo;

		/**
		 * Constructor para los alimentos no perecederos
		 * @param nombre Nombre del producto no perecedero
		 * @param precio Precio del producto no perecedero
		 * @param tipo Tipo del producto no perecedero
		 */
		public NoPerecederos(String nombre, double precio, String tipo) {
			super(nombre, precio);
			this.tipo = tipo;
		}
		
		/**
		 * Getter para el tipo
		 * @return Devuelve un string tipo
		 */
		public String getTipo() {
			return tipo;
		}
		
		/**
		 * Setter que recibe un string con el tipo
		 * @param tipo string que establece el tipo
		 */
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		/**
		 * Recibe de la clase padre el string y concatena el tipo en string
		 */
		@Override
		public String toString() {
			String res = super.toString() + "\n";
			res += "Tipo: " + tipo;
			return res;
		}
	
	}


