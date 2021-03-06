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

		//Ejercicio 2
		System.out.println("\n------------------------------------- \nEjercicio 2\n");
		
		FicherosTexto dos = new FicherosTexto();

		dos.leer(archivo);

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

		//Ejercicio 3
		System.out.println("\n------------------------------------- \nEjercicio 3\n");

		FicherosTexto tres = new FicherosTexto();

		System.out.println("El número de caracteres que tiene el archivo son: "+tres.contarCaracteres(archivo));

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

		//Ejercicio 4
		System.out.println("\n------------------------------------- \nEjercicio 4\n");

		FicherosTexto cuatro = new FicherosTexto();

		System.out.println("El fichero tiene " + cuatro.contarCaracteres(archivo) + " caracteres visibles.");

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

		//Ejercicio 5
		System.out.println("\n------------------------------------- \nEjercicio 5\n");

		FicherosTexto cinco = new FicherosTexto();

		System.out.println("El número de líneas que tiene el archivo son: "+cinco.contarLineas(archivo));

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();
		
		//Ejercicio 6
		System.out.println("\n------------------------------------- \nEjercicio 6\n");
		
		FicherosTexto seis = new FicherosTexto();
				
		System.out.println("El fichero tiene " + seis.contarPalabras(archivo) + " palabras.");
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

		//Ejercicio 7
		System.out.println("\n------------------------------------- \nEjercicio 7\n");

		FicherosTexto siete = new FicherosTexto();

		System.out.println("El número de total de palabras pentavocálicas son: "+siete.palabrasPentavocalica(archivo));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

		//Ejercicio 8
		System.out.println("\n------------------------------------- \nEjercicio 8\n");
		
		FicherosTexto ocho = new FicherosTexto();
				
		ocho.palabraMasLarga(archivo);

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();
		
		//Ejercicio 9
		System.out.println("\n------------------------------------- \nEjercicio 9\n");

		FicherosTexto nueve = new FicherosTexto();
		
		System.out.println("El número total de vocales es: "+nueve.frecuenciaVocales(archivo));

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();
		
		// Ejerccio 10
		System.out.println("\n------------------------------------- \nEjercicio 10\n");

		FicherosTexto diez = new FicherosTexto();

		System.out.println("La frecuencia de las letras es: " + diez.frecuenciaLetras(archivo));
	}
}
