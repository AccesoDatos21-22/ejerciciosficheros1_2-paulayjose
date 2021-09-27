package org.madrid.ad.ut01.ficheros;

public class Main {

	public static void main(String[] args) {

		FicherosTexto ej = new FicherosTexto();
		String ruta = "src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";

		// Ejerccio 10
		System.out.println("\n------------------------------------- \nEjercicio 10\n");

		System.out.println("La frecuencia de las letras es: " + ej.frecuenciaLetras(ruta));

	}

}
