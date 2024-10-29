/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * @author rbr - 291024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 291024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Recorro todos los números del 1 al 20
		for (int i=1; i<21; i++) {
			//Si el número es par no lo muestro por consola
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
