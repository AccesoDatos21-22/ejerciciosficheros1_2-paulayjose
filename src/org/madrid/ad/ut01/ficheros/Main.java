package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {

		String archivo = "src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";

		//Ejercicio 1
		System.out.println("\n------------------------------------- \nEjercicio 1\n");

		FicherosTexto uno = new FicherosTexto();

		uno.leer(archivo);

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

		FicherosTexto dos = new FicherosTexto();

		//Ejercicio 2
		System.out.println("\n------------------------------------- \nEjercicio 2\n");

		dos.leer(archivo);

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

		//Ejercicio 3
		System.out.println("\n------------------------------------- \nEjercicio 3\n");

		FicherosTexto tres = new FicherosTexto();

		System.out.println("El número de caracteres que tiene el archivo son: "+tres.contarCaracteres(archivo));

		// Ejerccio 10
		System.out.println("\n------------------------------------- \nEjercicio 10\n");

		FicherosTexto diez = new FicherosTexto();

		System.out.println("La frecuencia de las letras es: " + diez.frecuenciaLetras(archivo));

	}

}
