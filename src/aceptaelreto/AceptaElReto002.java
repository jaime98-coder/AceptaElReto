package aceptaelreto;

import java.util.Scanner;

public class AceptaElReto002 {

	public static void main(String[] args) {
		// ¿Colgadas o colgantes?
		/*
		 * Entrada La entrada comienza con un número que indica la cantidad de casos de
		 * prueba que deben procesarse. Cada caso de prueba es una cadena compuesta por
		 * la palabra "colgadas" o "colgantes", quizá mezclando mayúsculas y minúsculas.
		 * 
		 * Salida El programa escribirá Bien si la palabra del caso de prueba es
		 * "colgadas" y Mal si la palabra es "colgantes", ignorando el uso de
		 * mayúsculas.
		 */
		// Declaro las variables
	
		String respuesta;
		Scanner reader = new Scanner(System.in);
		// Indico al usuario que respona con una palabra para terminar la frase
		System.out.println("Termina la frase:\n" + "Las casas de Cuenca se llaman casas... ");
		// Leo de la consola la respuesta introducida
		respuesta = reader.nextLine();
		// Creo la condicional IF y le asigno la función equalsIgnoreCase para que así
		// no se tenga en cuenta si el usuario introduce la respuesta Colgadas en mayúsculas o
		// minúsculas, y si responde otra cosa, estaría mal, e imprimo "bien" o "mal".
		if (respuesta.equalsIgnoreCase("Colgadas")) {
			System.out.println("Bien");
		} else {
			System.out.println("Mal");
		}
		// Cierro el Scanner
		reader.close();
		
//		
//		int numero;
//		String respuesta;
//		
//		Scanner reader = new Scanner(System.in);
//		
//		numero = reader.nextInt();
//		reader.nextLine();
//		for (int i=1; i<=numero; i++) {
//			respuesta = reader.nextLine();
//			System.out.println(respuesta.equalsIgnoreCase("colgadas") ? "Bien" : "Mal");
//		}
	}

}
