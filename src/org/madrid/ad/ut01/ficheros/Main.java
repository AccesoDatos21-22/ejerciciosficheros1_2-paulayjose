package org.madrid.ad.ut01.ficheros;



public class Main {
	
	public static void main(String[] args) {
		
		FicherosTexto ej = new FicherosTexto();
		String ruta = "src\\org\\madrid\\ad\\ut01\\ficheros\\assets\\el_quijote.txt";
		
		//Ejercicio 8
				System.out.println("\n------------------------------------- \nEjercicio 8\n");
				
				ej.palabraMasLarga(ruta);
	}

}
