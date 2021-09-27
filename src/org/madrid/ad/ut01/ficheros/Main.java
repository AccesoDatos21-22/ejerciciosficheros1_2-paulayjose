package org.madrid.ad.ut01.ficheros;

public class Main {
	
	public static void main(String[] args) {
		
		String archivo = "..\\ejerciciosficheros1_2-paulayjose\\src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
		
		System.out.println("Ejercicio 5");
		
		FicherosTexto cinco = new FicherosTexto();
		
		System.out.println("El número de líneas que tiene el archivo son: "+cinco.contarLineas(archivo));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();
	
	}
}
