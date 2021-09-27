package org.madrid.ad.ut01.ficheros;

public class Main {
	
	public static void main(String[] args) {
		
		String archivo = "..\\ejerciciosficheros1_2-paulayjose\\src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
		
		System.out.println("Ejercicio 3");
		
		FicherosTexto tres = new FicherosTexto();
		
		System.out.println("El número de caracteres que tiene el archivo son: "+tres.contarCaracteres(archivo));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println();	
	}
}
