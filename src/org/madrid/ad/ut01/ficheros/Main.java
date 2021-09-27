package org.madrid.ad.ut01.ficheros;

public class Main {
	
	public static void main(String[] args) {
		
		String archivo = "..\\ejerciciosficheros1_2-paulayjose\\src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
		
		System.out.println("Ejercicio 9");
		
		FicherosTexto nueve = new FicherosTexto();
		System.out.println("El número total de vocales es: "+nueve.frecuenciaVocales(archivo));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();

	
	}
}
