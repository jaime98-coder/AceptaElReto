package aceptaelreto;

import java.io.Reader;
import java.util.Scanner;

public class AceptaElReto001 {

	public static void main(String[] args) {
		/*
		 * ¿Qué lado de la calle?
		 * Entrada: El programa recibirá, por la entrada
		 * estándar, un conjunto de casos de prueba, cada uno en una línea. Cada caso de
		 * prueba estará compuesto de un número de vivienda. Se garantiza que nunca será
		 * mayor que 1.000. El último caso, que no deberá procesarse, será el número 0.
		 */

		/*
		 * Salida: Para cada caso de prueba el programa escribirá "IZQUIERDA" (sin las
		 * comillas) si la vivienda está situada a la izquierda de la calle, y "DERECHA"
		 * si está a la derecha.
		 */

//		// Opcion A (incompleta)
//		// Declaro las variables 
//		String lado;
//		int numeroVivienda;
//		// Creo el Scanner
//		Scanner reader = new Scanner(System.in);
//		// Solicito al usuario que introduzca el número de la vivienda y leo el valor introducido
//		System.out.println("Introduce el número de la vivienda para saber donde está");
//		numeroVivienda = reader.nextInt();
//		// Asigno a la variable parOImpar la condición del ternario.
//		lado=numeroVivienda%2==0 ? "derecha" : "izquierda";
//		// Imprimo el mensaje final diciendo 
//		System.out.println("Se encuentra a la "+lado+" de la calle");
//		// Cierro el Scanner
//		reader.close();

		// Opción B (deepseek)
		// Declaro las variables
		String lado;
		int numeroVivienda;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Creo un bucle con true como condición (infinito) hasta que se rompa
		// manualmente tras el ingreso del número de vivienda por parte del usuario
		while (true) {
			System.out.println("Introduce el número de la vivienda");
			numeroVivienda = reader.nextInt();
			// Creo una condición IF, donde si el usuario introduce 0, se acaba el bucle y
			// se imprime el mensaje indicando que no hay vivienda nº 0
			if (numeroVivienda == 0) {
				System.out.println("No existe la vivienda número 0\n");
				// Termino con un break el bucle infinito tras cumplirse la condición
				break;
			}
			// Le asigno a la variable un texto u otro dependiendo del resultado del
			// ternario, e imprimo el mensaje indicando el lado
			lado = numeroVivienda % 2 == 0 ? "DERECHA" : "IZQUIERDA";
			System.out.println("Se encuentra a la " + lado + "\n");
		}
		// Cierro el Scanner
		reader.close();
		// Imprimo mensaje indicando que el bucle y por ende el programa ha sido
		// finalizado
		System.out.println("Programa finalizado :)");
	}
}
