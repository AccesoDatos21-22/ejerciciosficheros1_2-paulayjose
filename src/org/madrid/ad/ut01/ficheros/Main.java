package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		
		FicherosTexto ej = new FicherosTexto();
		
		//Ejercicio 2
		System.out.println("\n------------------------------------- \nEjercicio 2\n");

		String ruta = "src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
		
		ej.leer(ruta);
		
	}

}
