package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {

		String archivo = "src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";

		System.out.println("Ejercicio 1");

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

		FicherosTexto diez = new FicherosTexto();

		// Ejerccio 10
		System.out.println("\n------------------------------------- \nEjercicio 10\n");

		System.out.println("La frecuencia de las letras es: " + diez.frecuenciaLetras(archivo));

	}

}
